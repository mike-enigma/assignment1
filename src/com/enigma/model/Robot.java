package com.enigma.model;

import java.util.Arrays;

public class Robot {
    private Integer postX;
    private Integer postY;
    private char[] commends;

    Direction direction; //memanggil enum di file Direction

    private final String FORWARD = "F";
    private final String LEFT = "L";
    private final String RIGHT = "R";

    public Robot(Integer x, Integer y, Direction direction){
        this.postX=x;
        this.postY=y;
        this.direction=direction;
    }

    void turnLeft(){
        this.direction=this.direction.getLeft();

    }

    void turnRight(){
        this.direction=this.direction.getRight();
    }

    public void forward(){
        if (this.direction.equals(Direction.NORTH)){
            this.postY++;
            this.direction = Direction.NORTH;
        }else if(this.direction.equals(Direction.WEST)){
            this.postX--;
            this.direction = Direction.WEST;
        }else if(this.direction.equals(Direction.SOUTH)) {
            this.postY--;
            this.direction = Direction.SOUTH;
        }else if(this.direction.equals(Direction.EAST)){
            this.postX++;
            this.direction = Direction.EAST;
        }else{
            System.out.println("ARAH YANG ANDA MASUKAN SALAH!");
        }
    }

    private void move(String movement, Direction direction){

        if(movement.equals(RIGHT)) {
            turnRight();
        }
        else if(movement.equals(LEFT)) {
            turnLeft();
        }
        else if(movement.equals(FORWARD)){
            forward();
        }
        else {
            System.out.println("Huruf " + movement + " Bukan Bagian Perintah!!");
            System.exit(0);
        }

    }

    public void setCommends(String commends){
        this.commends = commends.toCharArray();

    }

    public String getPositions(){
        return "(" + postX + "," + postY + ")";
    }


    public void run(){
        for(int i=0; i < this.commends.length; i++){
            move(String.valueOf(this.commends[i]), this.direction);
            System.out.println(this.commends[i] + getPositions() + this.direction);
        }
    }


    public String print() {
        return "Robot{" +
                "postX=" + postX +
                ", postY=" + postY +
                ", commends=" + Arrays.toString(commends) +
                ", direction=" + direction +
                '}';
    }
}
