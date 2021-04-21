public class PpalPunto1{
    public static void main(String[]args){
        Punto1 p1 = new Punto1(4, 4);
        Punto1 p2 = new Punto1(4, 4);
        
        double dist = p1.distancia(p1, p2);
        System.out.println(dist);
    }
}
