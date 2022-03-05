package Ukoly;

// dodelani bodu z cviceni

// TODO
// vytvořit zlomek zadaný jedním číslem (např. 3 znamená 3/1)
// vytvořit zlomek zadaný jako textový řetězec ( 3 4 nebo 3/4 případně jako jedno číslo pokud nemá jmenovatel)
// při vytváření zlomek převeďte na základní tvar (tip: největší společný dělitel, Euklidův algoritmus)

public class Fraction {
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
