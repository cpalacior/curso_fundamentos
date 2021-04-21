public class Balanceado{
    public static boolean balancear(int[] a){
        if(a.length % 2 == 0){
            return true;
        }
        else{
            int i = 0;
            int j = a.length/2 + 1;
            int suma1 = 0;
            int suma2 = 0;
            while(i < a.length/2){
                suma1 = suma1 + a[i];
                i = i + 1;
            }
            while(j > a.length/2 && j < a.length){
                suma2 = suma2 + a[j];
                j = j + 1;
            }
            if(suma1 == suma2){
                return true;
            }
            else {
                return false;
            }
        }
    }
}