package CV01;



public class Fraction{
    private int cicatel;
    private int jmenovatel;
    private String[] vysledek = new String[2];
    public Fraction(int citatel, int jmenovatel) {
        this.cicatel = citatel;
        this.jmenovatel = jmenovatel;
    }
    public Fraction(String zlomek){// if mezera nebo lomitko(contains)
        if (zlomek.contains(" "))
            vysledek = zlomek.split(" ");
        if (zlomek.contains("/"))
            vysledek = zlomek.split("/");
        this.cicatel = Integer.parseInt(vysledek[0]);
        this.jmenovatel = Integer.parseInt(vysledek[1]);
    }
    public int getCicatel() {
        return cicatel;
    }
    public int getJmenovatel() {
        return jmenovatel;
    }
    public double valueOf() {
        //System.out.println(cicatel);
        //System.out.println(jmenovatel);
        return (double)cicatel/jmenovatel;
    }
    public String toString(){
        if(cicatel==jmenovatel)
            return ("1");
        else
            return  String.format("%d/%d", cicatel,jmenovatel);
    }
    //cisla bez jmenovatele(construktor s 1 parametrem)
    //zakladni tvar
}
