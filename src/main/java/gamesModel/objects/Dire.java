
package gamesModel.objects;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dire {

    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("tower_state")
    @Expose
    private Integer towerState;
    @SerializedName("barracks_state")
    @Expose
    private Integer barracksState;
    @SerializedName("players")
    @Expose
    private List<Player_> players = null;
    @SerializedName("abilities")
    @Expose
    private List<Ability_> abilities = null;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getTowerState() {
        return towerState;
    }

    public void setTowerState(Integer towerState) {
        this.towerState = towerState;
    }

    public Integer getBarracksState() {
        return barracksState;
    }

    public void setBarracksState(Integer barracksState) {
        this.barracksState = barracksState;
    }

    public List<Player_> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player_> players) {
        this.players = players;
    }

    public List<Ability_> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability_> abilities) {
        this.abilities = abilities;
    }

}
