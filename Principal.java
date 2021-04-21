import java.util.Scanner;
public class Principal {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        Circulo circulo1 =new Circulo();
        circulo1.setRadio(5);
        System.out.println(circulo1.getPerimetro());
        int radio = scan.nextInt();
        
        Circulo circulo2 =new Circulo();
        circulo2.setRadio(15);
        System.out.println(circulo2.getRadio());
        System.out.println(circulo2.getRadio());
    }
}

