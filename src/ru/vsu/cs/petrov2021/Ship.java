package ru.vsu.cs.petrov2021;

public class Ship {
    private final ShipType type;
    private final ShipTeam team;

    public Ship(ShipType type, ShipTeam team) {
        this.type = type;
        this.team = team;
    }

    public ShipType getType() {
        return type;
    }

    public ShipTeam getTeam() {
        return team;
    }
}
