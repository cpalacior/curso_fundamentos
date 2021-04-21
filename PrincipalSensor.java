import java.util.Scanner;
public class PrincipalSensor{
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        SensorLuz sl1 = new SensorLuz(18, 40);
        System.out.println("Ingrese texto: duplicar, asignarint o salir ");
        String word = scan.next();
        while (!word.equals("salir")){
            if(word.equals("duplicar")){
                System.out.println(sl1.getIntensidad());
                System.out.println(sl1.duplicarIntensidad());
            }
            else if(word.equals("asignarint")){
                System.out.println("Ingrese entero entre 18 y 40");
                int i = scan.nextInt();
                sl1.setIntensidad(i);
                System.out.println("la intensidad es "+ i);
            }
            System.out.println("Ingrese texto: duplicar, asignarint o salir ");
            word = scan.next();
        }
    }
}