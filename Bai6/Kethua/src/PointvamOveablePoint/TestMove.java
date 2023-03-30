package PointvamOveablePoint;

import java.util.Arrays;

public class TestMove {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setSpeed(5,6);

        System.out.println(Arrays.toString(movablePoint.getSpeed()));
    }


}
