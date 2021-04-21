import java.util.Scanner;
public class SumaPares{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;
        int a = 0;
        while(n > 0){
            i = scan.nextInt();
            if(i % 2 == 0){
                a = a + i;
            }
            n = n - 1;
        }
        System.out.println(a);
    }
}