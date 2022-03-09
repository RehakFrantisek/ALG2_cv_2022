package Ukoly;

// test gitu

import CV01.Fraction;

public class FractionMain {
    public static void main(String[] args) {
        String zlomek1 = "5/6";
        String zlomek2 = "4 3";
        CV01.Fraction firstFraction = new CV01.Fraction(6,3);
        CV01.Fraction secondFraction = new CV01.Fraction(zlomek2);
        CV01.Fraction thirdFraction = new Fraction(4);

        System.out.println(secondFraction); //zlomek zadany jako string
        System.out.println(thirdFraction.transform()); //vrati zlomek zadany jednim cislo + nulu jako nulu
        System.out.println(firstFraction.Eukleid()); //vrati nejvetsi spolecny delitel
    }
}
