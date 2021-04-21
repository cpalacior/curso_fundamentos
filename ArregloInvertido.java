public class ArregloInvertido{
    public static void main(String[] args){
        int[] arreglo = {0,1,2,3,4,5,6,7,8,9,5};
        int j = arreglo.length-1;
        int temp;
        for(int i=0; i<(arreglo.length/2); i++){
            temp=arreglo[i];
            arreglo[i]=arreglo[j];
            arreglo[j]=temp;
            j--;
        }
        for(int i=0; i<arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
    }
}