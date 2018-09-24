
package gamesModel.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Scoreboard {

    @SerializedName("duration")
    @Expose
    private Double duration;
    @SerializedName("roshan_respawn_timer")
    @Expose
    private Integer roshanRespawnTimer;
    @SerializedName("radiant")
    @Expose
    private Radiant radiant;
    @SerializedName("dire")
    @Expose
    private Dire dire;

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Integer getRoshanRespawnTimer() {
        return roshanRespawnTimer;
    }

    public void setRoshanRespawnTimer(Integer roshanRespawnTimer) {
        this.roshanRespawnTimer = roshanRespawnTimer;
    }

    public Radiant getRadiant() {
        return radiant;
    }

    public void setRadiant(Radiant radiant) {
        this.radiant = radiant;
    }

    public Dire getDire() {
        return dire;
    }

    public void setDire(Dire dire) {
        this.dire = dire;
    }

}
