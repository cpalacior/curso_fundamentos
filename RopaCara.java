import java.util.Scanner;
public class RopaCara{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        double ap = 0;
        double ac = 0;
        double precio;
        while(true){
            String tipo = scan.next();
            if(tipo.equals("pantalon")){
                precio = scan.nextDouble();
                ap = ap + precio;
            }
            else if(tipo.equals("camisa")){
                precio = scan.nextDouble();
                ac = ac + precio;
            }
            else {
                break;
            }
        }
        System.out.println("precio acumulado de los pantalones: " + ap);
        System.out.println("precio acumulado de las camisas: " + ac);
        if(ac > 100){
            System.out.println("Gucci");
        }
    }
}
