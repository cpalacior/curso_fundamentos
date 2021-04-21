import java.util.Scanner;
public class DeFront{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        word = word.toLowerCase();
        if(word.charAt(0) != 'a'){
            word = word.substring(1, word.length());
            if(word.charAt(0) != 'b'){
                word = word.substring(1, word.length());
            }
        }
        else if(word.charAt(1) != 'b'){
            word = word.charAt(0) + word.substring(2, word.length());
        }

        System.out.println(word);
    }
}