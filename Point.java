public class Point{
    private double x;
    private double y;
    private double dist;

    public Point(){
        this(0, 0);
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(Point p){
        this.x = p.getX();
        this.y = p.getY();
    } 

    public void setX(double x){
        this.x = x;
    }

    public double getX(){
        return this.x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getY(){
        return this.y;
    }

    public double distancia(Point p){
        double dist = Math.sqrt(Math.pow(this.x-p.getX(),2) + Math.pow(this.y-p.getY(),2));
        return dist;
    }

    public Point puntoMedio(Point p){
        double midx = (this.x + p.getX())/2;
        double midy = (this.y + p.getY())/2;
        Point puntomedio = new Point();
        puntomedio.setX(midx);
        puntomedio.setY(midy);
        return (puntomedio);
    }
}