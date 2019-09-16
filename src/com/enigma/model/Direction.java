package com.enigma.model;

public enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    public Direction getRight(){
        return Direction.values()[(ordinal()+1)%4];
    }

    public Direction getLeft(){
        return Direction.values()[(ordinal()+3)%4];
    }
}
