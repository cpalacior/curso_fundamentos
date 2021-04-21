public class Discoteca{
    public boolean accesoDiscoteca(int edad, int dinero, String nombre){
        if (edad >= 18 && dinero >= 100){        
            if(nombre.equals("jimmy")){
                return false;
            }    
            else {
                return true;
            }
        }
        else{
            return false;
        }
    }
}