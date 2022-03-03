package CV01;

public class Point {
    //data, clenske promenne, instancni promenne, atributy
    private double x;
    private double y;

    //metody
    //konstruktor defaultny
    public Point(){
        this(0.0, 0.0); //volani jineho kontstruktoru
        //x = 0.0;
        //y = 0.0;
    }
    //pretizeny konstruktor (overloaded)
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    //[2.00,3.00]
    @Override //prekryti metody
    public String toString(){
        return String.format("[%.2f, %.2f]",x ,y);

    }

    public double distanceFromOrigin(){ //vzdalenost od pocatku
        return Math.sqrt(Math.pow(x-0,2) + Math.pow(y-0,2));
    }

    public double distanceFrom(Point p){ //vzdalenost od jineho bodu zadaneho jako objekt
        return Math.sqrt(Math.pow(x-p.x,2) + Math.pow(y-p.y,2));
    }

    public double distanceFromPoint(double x, double y){ //vzdalenost od jineho bodu zadaneho souradnicemi
        return Math.sqrt(Math.pow(this.x-x,2) + Math.pow(this.y-y,2));
    }
}
