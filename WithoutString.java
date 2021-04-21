import java.util.Scanner;
public class WithoutString{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String base = scan.next();
        String eliminar = scan.next();
        int eliminarf = base.indexOf(eliminar) + eliminar.length();
       
        if(base.indexOf(eliminar) > 0){
            base = base.substring(0, base.indexOf(eliminar)) + (base.substring(eliminarf, base.length()));
            if(eliminar.length() == 1){
                base = base.substring(0, eliminarf - 1) + (base.substring(eliminarf - 1, base.length()));
            }
            
        }
        System.out.println(base);
    }
}