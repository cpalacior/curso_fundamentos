import java.util.Scanner;
public class Fahrenheit {
    public static void main(String[]args) {
        Scanner C = new Scanner(System.in);
        double F = (1.8*C.nextDouble())+32;
        System.out.println(String.format("%.2f", F));
    }
}