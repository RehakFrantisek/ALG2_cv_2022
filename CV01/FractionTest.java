package CV01;

public class FractionTest {
    public static void main(String[] args) {
        String zlomek1 = "5/6";
        String zlomek2 = "4 3";
        String zlomek3 = "2 2";
        Fraction firstFraction = new Fraction(2,3);
        Fraction secondFraction = new Fraction(zlomek3);
        System.out.println(firstFraction.toString());
        System.out.println(secondFraction);
        System.out.println(firstFraction.getCicatel());
        System.out.println(firstFraction.getJmenovatel());
        System.out.println(firstFraction.valueOf());
    }
}