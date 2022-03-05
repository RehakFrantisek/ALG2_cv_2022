package CV01;

public class FractionTest {
    public static void main(String[] args) {
        String zlomek1 = "5/6";
        String zlomek2 = "4 3";
        String zlomek3 = "2 2";
        Fraction firstFraction = new Fraction(6,3);
        Fraction secondFraction = new Fraction(zlomek3);
        Fraction thirdFraction = new Fraction (4);
        System.out.println(firstFraction.toString()); //zlomek zadany dvema cisly
        System.out.println(secondFraction); //zlomek zadany jako string
        System.out.println(thirdFraction.transform()); //vrati zlomek zadany jednim cislo + nulu jako nulu
        System.out.println(firstFraction.getCitatel()); //vrati citatel
        System.out.println(firstFraction.getJmenovatel()); //vrati jmenovatel
        System.out.println(firstFraction.valueOf()); //vrati hodnotu zlomku jako double
        System.out.println(firstFraction.Eukleid()); //vrati nejvetsi spolecny delitel
    }
}