import java.util.Scanner;
public class PrincipalCalculadoraSimple {
    public static void main(String[]args){
        CalculadoraSimple x = new CalculadoraSimple();
        Scanner pedir = new Scanner(System.in);
        int num1 = pedir.nextInt();
        int num2 = pedir.nextInt();
        x.sumar(num1, num2);
        System.out.println(num1+num2);
        x.restar(num1, num2);
        System.out.println(num1-num2);
    }
}