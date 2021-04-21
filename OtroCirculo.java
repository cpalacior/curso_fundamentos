import java.util.Scanner;
public class OtroCirculo {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        Circulo circulo1 =new Circulo();
        double radio = scan.nextInt();
        circulo1.setRadio(radio);
        if(radio > 0){
            System.out.println(circulo1.getRadio());
        }
        else{
            System.out.println("ERROR ¿De qué me hablas viejo?");
        }
    }
}