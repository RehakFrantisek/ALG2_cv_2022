package Ukoly;

public class MathTools {
    public int gcd(int citatel, int jmenovatel) {
        while (jmenovatel != 0) {
            int tmp = citatel % jmenovatel;
            citatel = jmenovatel;
            jmenovatel = tmp;
        }
        return citatel;
    }
}
