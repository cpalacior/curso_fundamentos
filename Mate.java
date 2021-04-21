public class Mate{
    private int factor = 1;
    private int x = 1;
    public int factorial (int num){
        while(x <= num){
            factor *= x ;
            x = x + 1;
        }
        return factor; 
    }
}