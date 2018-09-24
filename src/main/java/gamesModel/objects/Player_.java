
package gamesModel.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Player_ {

    @SerializedName("player_slot")
    @Expose
    private Integer playerSlot;
    @SerializedName("account_id")
    @Expose
    private Integer accountId;
    @SerializedName("hero_id")
    @Expose
    private Integer heroId;
    @SerializedName("kills")
    @Expose
    private Integer kills;
    @SerializedName("death")
    @Expose
    private Integer death;
    @SerializedName("assists")
    @Expose
    private Integer assists;
    @SerializedName("last_hits")
    @Expose
    private Integer lastHits;
    @SerializedName("denies")
    @Expose
    private Integer denies;
    @SerializedName("gold")
    @Expose
    private Integer gold;
    @SerializedName("level")
    @Expose
    private Integer level;
    @SerializedName("gold_per_min")
    @Expose
    private Integer goldPerMin;
    @SerializedName("xp_per_min")
    @Expose
    private Integer xpPerMin;
    @SerializedName("ultimate_state")
    @Expose
    private Integer ultimateState;
    @SerializedName("ultimate_cooldown")
    @Expose
    private Integer ultimateCooldown;
    @SerializedName("item0")
    @Expose
    private Integer item0;
    @SerializedName("item1")
    @Expose
    private Integer item1;
    @SerializedName("item2")
    @Expose
    private Integer item2;
    @SerializedName("item3")
    @Expose
    private Integer item3;
    @SerializedName("item4")
    @Expose
    private Integer item4;
    @SerializedName("item5")
    @Expose
    private Integer item5;
    @SerializedName("respawn_timer")
    @Expose
    private Integer respawnTimer;
    @SerializedName("position_x")
    @Expose
    private Double positionX;
    @SerializedName("position_y")
    @Expose
    private Double positionY;
    @SerializedName("net_worth")
    @Expose
    private Integer netWorth;

    public Integer getPlayerSlot() {
        return playerSlot;
    }

    public void setPlayerSlot(Integer playerSlot) {
        this.playerSlot = playerSlot;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getHeroId() {
        return heroId;
    }

    public void setHeroId(Integer heroId) {
        this.heroId = heroId;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public Integer getDeath() {
        return death;
    }

    public void setDeath(Integer death) {
        this.death = death;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getLastHits() {
        return lastHits;
    }

    public void setLastHits(Integer lastHits) {
        this.lastHits = lastHits;
    }

    public Integer getDenies() {
        return denies;
    }

    public void setDenies(Integer denies) {
        this.denies = denies;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getGoldPerMin() {
        return goldPerMin;
    }

    public void setGoldPerMin(Integer goldPerMin) {
        this.goldPerMin = goldPerMin;
    }

    public Integer getXpPerMin() {
        return xpPerMin;
    }

    public void setXpPerMin(Integer xpPerMin) {
        this.xpPerMin = xpPerMin;
    }

    public Integer getUltimateState() {
        return ultimateState;
    }

    public void setUltimateState(Integer ultimateState) {
        this.ultimateState = ultimateState;
    }

    public Integer getUltimateCooldown() {
        return ultimateCooldown;
    }

    public void setUltimateCooldown(Integer ultimateCooldown) {
        this.ultimateCooldown = ultimateCooldown;
    }

    public Integer getItem0() {
        return item0;
    }

    public void setItem0(Integer item0) {
        this.item0 = item0;
    }

    public Integer getItem1() {
        return item1;
    }

    public void setItem1(Integer item1) {
        this.item1 = item1;
    }

    public Integer getItem2() {
        return item2;
    }

    public void setItem2(Integer item2) {
        this.item2 = item2;
    }

    public Integer getItem3() {
        return item3;
    }

    public void setItem3(Integer item3) {
        this.item3 = item3;
    }

    public Integer getItem4() {
        return item4;
    }

    public void setItem4(Integer item4) {
        this.item4 = item4;
    }

    public Integer getItem5() {
        return item5;
    }

    public void setItem5(Integer item5) {
        this.item5 = item5;
    }

    public Integer getRespawnTimer() {
        return respawnTimer;
    }

    public void setRespawnTimer(Integer respawnTimer) {
        this.respawnTimer = respawnTimer;
    }

    public Double getPositionX() {
        return positionX;
    }

    public void setPositionX(Double positionX) {
        this.positionX = positionX;
    }

    public Double getPositionY() {
        return positionY;
    }

    public void setPositionY(Double positionY) {
        this.positionY = positionY;
    }

    public Integer getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(Integer netWorth) {
        this.netWorth = netWorth;
    }

}
