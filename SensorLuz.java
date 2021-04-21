public class SensorLuz{
    private int intensidadMin;
    private int intensidadMax;
    private int intensidad;
    
    public SensorLuz (int min, int max){
        this.intensidadMin = min;
        this.intensidadMax = max;
        this.intensidad = this.intensidadMin;
    }
    public void setIntensidad (int i){
        if((i >= intensidadMin) && (i <= intensidadMax)){
            this.intensidad = i;
        }
    }
    public int getIntensidad(){
        return this.intensidad;
    }
    public int duplicarIntensidad(){
        int duplicado = this.intensidad * 2;
        if(duplicado <= this.intensidadMax){
            return (duplicado);
        }
        else{
            return (this.intensidad);
        }
        
    }
}