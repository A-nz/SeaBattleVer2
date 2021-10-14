package ru.vsu.cs.petrov2021;

public class Step {
    private Player player;
    private ShipTeam team;
    private Cell target;
    private Ship damagedShip;


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ShipTeam getTeam(){
        return team;
    }

    public void setTeam(ShipTeam team){
        this.team=team;
    }

    public Cell getTarget() {
        return target;
    }

    public void setTarget(Cell target) {
        this.target = target;
    }

    public Ship getDamagedShip(){
        return damagedShip;
    }

    public void setDamagedShip(Ship damagedShip) {
        this.damagedShip = damagedShip;
    }
}
