public class Array{
    public static void transpuesta(int[][]arr){
        int i = 0;
        int temp;
        while(i < arr.length){
            int j = 0;
            temp = arr[i][j];
                while(j < arr.length){
                    temp = arr[j][i];
                    System.out.println(temp);
                    j++;
                }
            i++;
        }
    }
    
    
    public static int sumaDiagonal(int[][]arr){
        int suma = 0;
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr.length){
                if(i == j){
                    suma = suma + arr[i][j];
                }
                j++;
            }
            i++;
        }
        return suma;
    }

    public static int minimoBuscado(int[][]arr){
        int i = 0;
        int n = arr.length;
        int menor = arr[0][0];
        while(i < n) {
            int j = 0;
            while(j < n){
                if (menor > arr[i][j]){
                    menor = arr[i][j];   
                }
                j++;
            }
            i++;
        }
        return menor;
    }
}