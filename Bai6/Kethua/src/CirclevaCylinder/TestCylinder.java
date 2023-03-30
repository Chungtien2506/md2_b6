package CirclevaCylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(5);
        cylinder.setRadius(5);
        cylinder.setColor("hung");
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());


    }
}
