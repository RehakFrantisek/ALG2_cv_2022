package CV01;

public class Fraction{
    private int citatel;
    private int jmenovatel;
    private int cislo;
    private String[] vysledek = new String[2];
    public Fraction(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    public Fraction(String zlomek){// if mezera nebo lomitko(contains)
        if (zlomek.contains(" "))
            vysledek = zlomek.split(" ");
        if (zlomek.contains("/"))
            vysledek = zlomek.split("/");
        this.citatel = Integer.parseInt(vysledek[0]);
        this.jmenovatel = Integer.parseInt(vysledek[1]);
    }

    public Fraction(int cislo){
        this.cislo = cislo;
    }

    public int getCitatel() {
        return citatel;
    }

    public int getJmenovatel() {
        return jmenovatel;
    }

    public double valueOf() {
        //System.out.println(citatel);
        //System.out.println(jmenovatel);
        return (double)citatel/jmenovatel;
    }

    public String toString(){
        if(citatel==jmenovatel)
            return ("1");
        else
            return  String.format("%d/%d", citatel,jmenovatel);
    }

    public String transform(){
        if(cislo==0)
            return ("0");
        else
            return String.format("%d/%d", cislo, 1);
    }

    public int Eukleid(){
        while (jmenovatel != 0){
            int tmp = citatel%jmenovatel;
            citatel = jmenovatel;
            jmenovatel = tmp;
        }
        return citatel;
    }

}
