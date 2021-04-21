public class PpalGafa{
    public static void main(String[]args){
    Gafa g1 = new Gafa("neon", 2566);
    System.out.println(g1.getNombre());
    System.out.println(g1.getPrecio());
    g1.imprimirDatosGenerales();
    System.out.println(g1.toString());
    System.out.println(g1);
    }
}