import java.util.Scanner;
public class Infinito{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int i;
        int triple;
        while (true){
            i = scan.nextInt();
            if(i != 0){
                triple = i * 3;
                System.out.println(triple);
            }
            else{
                break;
            }
        }
    }
}