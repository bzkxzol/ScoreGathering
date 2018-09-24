package parsers;

import static config.Configuration.API_INTERFACE_LIVE_MATCH;
import static config.Configuration.KEY;
import static config.Configuration.LIVE_LEAGUE_GAMES;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import entries.ResultResponseEntry;
import gamesModel.GameModel;

public class GameParser {

    private String paramsForRequest = "/?key=" + KEY;
    private String requestForLiveGames = API_INTERFACE_LIVE_MATCH + LIVE_LEAGUE_GAMES + paramsForRequest;


    private JsonElement parseGamesJson() {
        JsonElement element;
        HttpURLConnection conn;
        URL url;
        InputStreamReader isr = null;
        BufferedReader br = null;
        JsonParser parser;
        JsonElement games = null;

        try {
            url = new URL(requestForLiveGames);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            isr = new InputStreamReader(conn.getInputStream());
            br = new BufferedReader(isr);
            parser = new JsonParser();
            element = parser.parse(br);
            JsonObject results = (JsonObject) element.getAsJsonObject().get("result");
            games = results.getAsJsonObject().get("games");
        } catch (Exception e) {
            e.getStackTrace();
        }
        return games;
    }

    public void parseLiveGames() {
        Gson gson = new Gson();
        Type collectionType = new TypeToken<Collection<GameModel>>() {
        }.getType();
        Collection<GameModel> gameModels = gson.fromJson(parseGamesJson(), collectionType);
        List<ResultResponseEntry> resultResponseEntries = new ArrayList<>();
        for (GameModel gameModel : gameModels) {
            String direTeamName = null;
            String radiantTeamName = null;
            Integer direScore = null;
            Integer radiantScore = null;
            Long matchId = null;

            if (gameModel.getDireTeam() != null) {
                direTeamName = gameModel.getDireTeam().getTeamName();
                if (gameModel.getRadiantTeam() != null) {
                    radiantTeamName = gameModel.getRadiantTeam().getTeamName();
                    if (gameModel.getScoreboard() != null) {
                        direScore = gameModel.getScoreboard().getDire().getScore();
                        if (gameModel.getScoreboard().getRadiant().getScore() != null) {
                            radiantScore = gameModel.getScoreboard().getRadiant().getScore();

                            matchId = gameModel.getMatchId();

                            resultResponseEntries.add(new ResultResponseEntry(direTeamName, radiantTeamName, direScore + "-" + radiantScore, matchId));
                        }
                    }
                }
            }

        }
        resultResponseEntries.size();
    }
}
