import java.util.Scanner;
public class Ejercicio4while{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese palabra :suma, resta, cuadrado, salir");
        String pal = scan.next();
        while(!pal.equals("salir")){
            if(pal.equals("suma")){
                int num = scan.nextInt();
                int num1 = scan.nextInt();
                int suma = num + num1;
                System.out.println(suma);
            }
            else if (pal.equals("resta")){
                int num2 = scan.nextInt();
                int num3 = scan.nextInt();
                int resta = num2 - num3;
                System.out.println(resta);
            }
            else if (pal.equals("cuadrado")){
                int num4 = scan.nextInt();
                double cuadrado = Math.pow(num4, 2);
                System.out.println(cuadrado);
            }
            System.out.println("Ingrese palabra :suma, resta, cuadrado, salir");
            pal = scan.next();
        }
        System.out.println("Fin programa");
    }
}
