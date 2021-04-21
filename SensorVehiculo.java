import java.util.ArrayList;
public class SensorVehiculo{
    public double velocidad;
    public int cantidad;

    public void setVelocidad(double v){
        this.velocidad = v;
    }

    public void setCantidad(int c){
        this.cantidad = c;
    }

    public double getVelocidad(){
        return this.velocidad;
    }

    public double getCantidad(){
        return this.cantidad;
    }

    public String flujoVehicular(){
        String flujo = "";
        if(this.velocidad < 20){
            if(this.cantidad > 4){
                flujo = "flujo lento";           
            }
        }
        else{
            flujo = "flujo normal";
        }
        return flujo;
    }
    
    public void capturaDatos(ArrayList a){
        
    }
}