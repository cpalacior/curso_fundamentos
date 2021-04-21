import java.util.Scanner;
public class Hipotenusa {
    public static void main(String[]args){
        Scanner cateto = new Scanner(System.in);
        double hipo = Math.sqrt(Math.pow(cateto.nextDouble(),2)+Math.pow(cateto.nextDouble(),2));
        System.out.println(String.format("%.2f", hipo));
    }
}