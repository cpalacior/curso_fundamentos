import java.util.Scanner;
public class While{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = 5;
        while (i <= 100){
            System.out.println(i);
             i = i + 5;
        }
    }
}