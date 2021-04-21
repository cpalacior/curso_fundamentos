import java.util.Scanner;
public class Mayores {
    public static void main(String[]args) {
        Scanner Mayores = new Scanner(System.in);
        int word1 = Mayores.nextInt();
        int word2 = Mayores.nextInt();
        int suma = word1+word2;
        int multi = word1*word2;
        System.out.println(suma);
        System.out.println(multi);
    }
}