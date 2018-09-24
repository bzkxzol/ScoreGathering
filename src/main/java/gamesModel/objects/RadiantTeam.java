
package gamesModel.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RadiantTeam {

    @SerializedName("team_name")
    @Expose
    private String teamName;
    @SerializedName("team_id")
    @Expose
    private Integer teamId;
    @SerializedName("team_logo")
    @Expose
    private Integer teamLogo;
    @SerializedName("complete")
    @Expose
    private Boolean complete;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getTeamLogo() {
        return teamLogo;
    }

    public void setTeamLogo(Integer teamLogo) {
        this.teamLogo = teamLogo;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

}
