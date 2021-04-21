public class InvertirArreglo{
    public static int[] invertir(int[] a){
        int temp;
        int j = a.length - 1;
        int i = 0;
        while(i < a.length/2){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i = i + 1;
            j = j- 1;
        }
        return a;
    }
    public static void imprimir(int[] a){
        int i = 0;
        while(i < (a.length - 1)){
            System.out.print(a[i]+ ",");
            i = i + 1;
            if(i == a.length - 1){
            System.out.print(a[i]);
            }
        }
    }
}