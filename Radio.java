import java.util.Scanner;
public class Radio {
    public static void main(String[]args) {
        Scanner radio = new Scanner(System.in);
        double area = Math.pow(radio.nextDouble(),2)*Math.PI;
        System.out.println(String.format("%.2f",area));
    }
}