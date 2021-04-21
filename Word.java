import java.util.Scanner;
public class Word{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        word = word.toLowerCase();
        System.out.println(word.length());
        System.out.println(word.indexOf('a'));
    }
}