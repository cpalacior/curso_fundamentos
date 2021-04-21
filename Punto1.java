public class Punto1{

    private double X;
    private double Y;

    public Punto1(double x, double y){
        this.X = x;
        this.Y = y;
    }

    public static double distancia(Punto1 p, Punto1 p1){
        double dist = Math.sqrt(Math.pow(p.getX()-p1.getX(),2) + Math.pow(p.getY()-p1.getY(),2));
        return dist;
    }

    public double getX(){
        return this.X;
    }

    public double getY(){
        return this.Y;
    }

    public void setX(double n){
        this.X = n;
    }

    public void setY(double n){
        this.Y = n;
    }
}
