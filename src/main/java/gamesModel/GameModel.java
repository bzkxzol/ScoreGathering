
package gamesModel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import gamesModel.objects.DireTeam;
import gamesModel.objects.RadiantTeam;
import gamesModel.objects.Scoreboard;

public class GameModel {

    @SerializedName("players")
    @Expose
    private List<Object> players = null;
    @SerializedName("radiant_team")
    @Expose
    private RadiantTeam radiantTeam;
    @SerializedName("dire_team")
    @Expose
    private DireTeam direTeam;
    @SerializedName("lobby_id")
    @Expose
    private Integer lobbyId;
    @SerializedName("match_id")
    @Expose
    private Long matchId;
    @SerializedName("spectators")
    @Expose
    private Integer spectators;
    @SerializedName("league_id")
    @Expose
    private Integer leagueId;
    @SerializedName("league_node_id")
    @Expose
    private Integer leagueNodeId;
    @SerializedName("stream_delay_s")
    @Expose
    private Integer streamDelayS;
    @SerializedName("radiant_series_wins")
    @Expose
    private Integer radiantSeriesWins;
    @SerializedName("dire_series_wins")
    @Expose
    private Integer direSeriesWins;
    @SerializedName("series_type")
    @Expose
    private Integer seriesType;
    @SerializedName("scoreboard")
    @Expose
    private Scoreboard scoreboard;

    public List<Object> getPlayers() {
        return players;
    }

    public void setPlayers(List<Object> players) {
        this.players = players;
    }

    public RadiantTeam getRadiantTeam() {
        return radiantTeam;
    }

    public void setRadiantTeam(RadiantTeam radiantTeam) {
        this.radiantTeam = radiantTeam;
    }

    public DireTeam getDireTeam() {
        return direTeam;
    }

    public void setDireTeam(DireTeam direTeam) {
        this.direTeam = direTeam;
    }

    public Integer getLobbyId() {
        return lobbyId;
    }

    public void setLobbyId(Integer lobbyId) {
        this.lobbyId = lobbyId;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Integer getSpectators() {
        return spectators;
    }

    public void setSpectators(Integer spectators) {
        this.spectators = spectators;
    }

    public Integer getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    public Integer getLeagueNodeId() {
        return leagueNodeId;
    }

    public void setLeagueNodeId(Integer leagueNodeId) {
        this.leagueNodeId = leagueNodeId;
    }

    public Integer getStreamDelayS() {
        return streamDelayS;
    }

    public void setStreamDelayS(Integer streamDelayS) {
        this.streamDelayS = streamDelayS;
    }

    public Integer getRadiantSeriesWins() {
        return radiantSeriesWins;
    }

    public void setRadiantSeriesWins(Integer radiantSeriesWins) {
        this.radiantSeriesWins = radiantSeriesWins;
    }

    public Integer getDireSeriesWins() {
        return direSeriesWins;
    }

    public void setDireSeriesWins(Integer direSeriesWins) {
        this.direSeriesWins = direSeriesWins;
    }

    public Integer getSeriesType() {
        return seriesType;
    }

    public void setSeriesType(Integer seriesType) {
        this.seriesType = seriesType;
    }

    public Scoreboard getScoreboard() {
        return scoreboard;
    }

    public void setScoreboard(Scoreboard scoreboard) {
        this.scoreboard = scoreboard;
    }

}
