import java.util.Scanner;
public class SubTextoMejorado{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if (num2 > word.length()){
            System.out.println("Error");
        }
        else if (num1 > num2){
            System.out.println("Error2");
        }
        else{
        word = word.substring(num1, num2 + 1);
        System.out.println(word);
        }
    }
}
