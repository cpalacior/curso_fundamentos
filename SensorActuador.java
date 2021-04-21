public class SensorActuador{
    private int temperatura;
    private int minTemp;
    private int maxTemp;

    public SensorActuador(int temp, int min, int max){
        this.temperatura = temp;
        this.minTemp = min;
        this.maxTemp = max;
    }

    public int getTemperatura(){
        return this.temperatura;
    }

    public void disminuirTemp(int i){
        this.temperatura = this.temperatura - i;
        if(temperatura  < this.minTemp){
            this.temperatura = this.temperatura + i;
        }
    }

    public void aumentarTemp(int i){
        this.temperatura = this.temperatura + i;
        if (this.temperatura > this.maxTemp){
            this.temperatura = this.temperatura - i;
        }
    }
}