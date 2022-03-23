package CV03;

public class MoneyBox {

    private String name;
    private int ones, twos;

    public MoneyBox(String name){
        this.name = name;
        this.ones = 0;
        this.twos = 0;
    }

    public MoneyBox(String name, int Nones, int Ntwos){
        this.name = name;
        this.ones = Nones;
        this.twos = Ntwos;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addOnes(int addOnes){
        this.ones=this.ones+addOnes;
    }

    public int getOnes(){ return this.ones; }

    public int getTwos(){ return this.twos; }

    public void addTwos(int addTwos){
        this.twos=this.twos+addTwos;
    }

    public void addMoney(int addOnes, int addTwos){
        this.ones=this.ones+addOnes;
        this.twos=this.twos+addTwos;
    }

    public int count(){
        int count=this.ones+this.twos;
        return count;
    }

    // darek
    public String giftMoney(int gift){
        if (count() > gift){
            return getName()+ " ma dostatek penez";
        }
        else {
            return getName()+ " nema dostatek penez";
        }
    }

    public void putMoney(int crown, int two_crowns)
    {
        this.ones=this.ones+crown;
        this.twos=this.twos+two_crowns;
    }

    public void transferMoney(MoneyBox reciever,int crown,int two_crowns)
    {
        this.ones = this.ones - crown;
        this.twos = this.twos - two_crowns;
        reciever.putMoney(crown, two_crowns);
    }

    @Override
    public String toString() {
        return name+" ma v pokladnicce " +count()+ "Kc - " +ones+ "korun a " +twos+ "dvoukorun";
    }
}
