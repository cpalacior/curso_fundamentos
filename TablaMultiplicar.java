public class TablaMultiplicar{
    public static void main(String[]args){
        int numerito;
        int y = 1;
        while(y < 10){
            int x = 1;
            while (x < 10){
                numerito = x * y;
                System.out.print(numerito + "  ");
                x = x + 1;
            }
            System.out.println(" ");
            y = y + 1;
        }
    }
}
