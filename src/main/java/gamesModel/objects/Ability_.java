
package gamesModel.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ability_ {

    @SerializedName("ability_id")
    @Expose
    private Integer abilityId;
    @SerializedName("ability_level")
    @Expose
    private Integer abilityLevel;

    public Integer getAbilityId() {
        return abilityId;
    }

    public void setAbilityId(Integer abilityId) {
        this.abilityId = abilityId;
    }

    public Integer getAbilityLevel() {
        return abilityLevel;
    }

    public void setAbilityLevel(Integer abilityLevel) {
        this.abilityLevel = abilityLevel;
    }

}
