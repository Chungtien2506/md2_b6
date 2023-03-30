package PointvamOveablePoint;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(1,2);
        System.out.println(Arrays.toString(point.getXY()));
    }
}
