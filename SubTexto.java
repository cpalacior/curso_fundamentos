import java.util.Scanner;
public class SubTexto{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        word = word.substring(num1, num2 + 1);
        System.out.println(word);
    }
}