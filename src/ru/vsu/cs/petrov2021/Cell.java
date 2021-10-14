package ru.vsu.cs.petrov2021;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cell {
    private final CellColor color;
    private final Map<Direction, Cell> neighbors = new LinkedHashMap<>();

    public Cell (CellColor color) {
        this.color = color;
    }

    public CellColor getColor() {
        return color;
    }

    public Map<Direction, Cell> getNeighbors() {
        return neighbors;
    }
}
