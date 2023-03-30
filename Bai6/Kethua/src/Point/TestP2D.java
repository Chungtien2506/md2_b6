package Point;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestP2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(5,6);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
