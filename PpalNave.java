import java.util.ArrayList;
public class PpalNave{
    public static ArrayList<Nave> arr = new ArrayList<Nave>();
    public static void main(String[]args){
        Nave n1 = new Nave();
        Nave n2 = new Nave(1011, 15, 15);
        Nave n3 = new Nave(1012, 10, 8);
        
        arr.add(n1);
        arr.add(n2);
        arr.add(n3);
        
        Nave.mostrarNavesVivas(arr);
        
        Nave.ataque(arr.get(0), arr.get(1));
        Nave.ataque(arr.get(2), arr.get(0));
        
        Nave.mostrarNavesVivas(arr);
        
        
    }
}