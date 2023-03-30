package Point;

import java.util.Arrays;

public class TestP3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.setxyz(1,2,3);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
