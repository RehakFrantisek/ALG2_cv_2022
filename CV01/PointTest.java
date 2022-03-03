package CV01;

public class PointTest {
    public static void main(String[] args){
        Point myPoint = new Point(); // zavolani konstruktoru - vytvorim objekt, promenna myPoint na nej ukazuje
        System.out.println(myPoint.toString());
        Point yourPoint = new Point(2,3);
        System.out.println(yourPoint);

        System.out.println(yourPoint.distanceFromOrigin());
    }
}
