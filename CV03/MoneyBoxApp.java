package CV03;

public class MoneyBoxApp {
    public static void main(String[] args) {
        MoneyBox plna = new MoneyBox("Alice",25,15);
        MoneyBox prazdna = new MoneyBox("Bob");
        prazdna.addOnes(2);
        prazdna.addTwos(3);
        prazdna.addMoney(5,10);
        System.out.println(plna.toString());
        System.out.println(prazdna.toString());
        System.out.println(plna.count());
        System.out.println(prazdna.count());
        System.out.println(prazdna.giftMoney(39));
        System.out.println(plna.giftMoney(39));
        plna.transferMoney(prazdna,plna.getOnes(),plna.getTwos());
        System.out.println(plna.toString());
        System.out.println(prazdna.toString());
    }
}
