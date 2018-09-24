package entries;

public class ResultResponseEntry {

    private String direTeamName;
    private String radiantTeamName;
    private String score;
    private Long matchId;

    public ResultResponseEntry(String direTeamName, String radiantTeamName, String score, Long matchId) {
        this.direTeamName = direTeamName;
        this.radiantTeamName = radiantTeamName;
        this.score = score;
        this.matchId = matchId;
    }

    public String getDireTeamName() {
        return direTeamName;
    }

    public String getRadiantTeamName() {
        return radiantTeamName;
    }

    public String getScore() {
        return score;
    }

    public Long getMatchId() {
        return matchId;
    }
}
