import java.util.Scanner;
public class ControlAmbiente{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        SensorActuador sen1 = new SensorActuador(5, 1, 10);
        int n = 0;
        int num; 
        while(n < 4){
            num = scan.nextInt();
            if(n <= 1){
                sen1.disminuirTemp(num);
            }
            if(n >= 2) {
                sen1.aumentarTemp(num);
            }
            n = n + 1;
        }
        System.out.println(sen1.getTemperatura());
    }
}