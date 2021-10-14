package ru.vsu.cs.petrov2021;

import java.util.*;

public class Game {
    private Map<Ship, Cell> shipToCellMap = new LinkedHashMap<>();
    private Map<Cell, Ship> cellToShipMap = new HashMap();
    private Map<Player, Set<Ship>> PlayerToShipMap = new HashMap();
    private Map<Ship, Player> shipToPlayerMap = new LinkedHashMap<>();
    private List<Step> steps = new ArrayList<>();
}
