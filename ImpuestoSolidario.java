import java.util.Scanner;
public class ImpuestoSolidario{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        double salario = scan.nextDouble();
        String contrato = scan.next();
        if(contrato.equals("publico") && salario > 10000000){
            double impuesto = salario * 0.15;
            System.out.println(String.format("%.2f", impuesto));
        }
        else{
            System.out.println("No debes aportar");
        }
    }
}