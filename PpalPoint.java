public class PpalPoint{
    public static void main(String[]args){
        Point p1 = new Point();
        p1.setX(4);
        p1.setY(4);
        Point p2 = new Point();
        p2.setX(4);
        p2.setY(5);
        double dist = p1.distancia(p2);
        double dist2 = p1.distancia(p1);
        System.out.println(dist);
        System.out.println(dist2);
        
        Point puntomedio = p1.puntoMedio(p2);
        System.out.println(puntomedio.getX());
        System.out.println(puntomedio.getY());
    }
}