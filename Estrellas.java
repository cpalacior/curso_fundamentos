import java.util.Scanner;
public class Estrellas{    
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int x;
        while(n >= 0){
            if(n == 0){
                c0 = c0 + 1;
            }
            else if(n == 1){
                c1 = c1 + 1;
            }
            else if(n == 2){
                c2 = c2 + 1;
            }
            else if(n == 3){
                c3 = c3 + 1;
            }
            else if(n == 4){
                c4 = c4 + 1;
            }
            else if(n == 5){
                c5 = c5 + 1;
            }
            
            n = scan.nextInt();
        }
        x = c0 + c1 + c2 + c3 + c4 + c5;
        System.out.println("0("+ c0 +") *("+ c1 +") **("+ c2 +") ***("+ c3 +") ****("+ c4 +") *****("+ c5 + ")");
        System.out.println("Total: "+ x);
    }
}    