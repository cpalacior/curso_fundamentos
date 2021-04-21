import java.util.Scanner;
public class PpalString{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String message = "Welcome to Java";
        System.out.println("The length of " + message + " is " + message.length());
        System.out.println(message.charAt(6));
        String mesage = scan.next();
        int n = 0;
        int cont = 0;
        while(n <= mesage.length()){
            char ch = mesage.charAt(n);
            if(ch == 'a'){
                cont = cont + 1;
            }
            n = n + 1;
        }
        
        
    }
}