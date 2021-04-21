public class Avion{
    private String nombre;
    private int velocidad = 0;
    private int velocidadMaxima = 540;
    private int cohetes;

    public Avion(String n){
        this.nombre = n;
        this.cohetes = 5;
    }

    public Avion(String n, int v, int c){
        this.nombre = n;
        this.velocidad = v;
        this.cohetes = c;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getVelocidad(){
        return this.velocidad;
    }

    public int getCohetes(){
        return this.cohetes;
    }

    public void disparar(){
        if(this.cohetes > 0){
            this.cohetes = this.cohetes - 1;
        }
    }

    public void tripleDisparo(){
        if(this.cohetes >= 3){
            this.cohetes = this.cohetes - 3;
        }
    }
    
    public void disminuirVelocidad(int v){
        this.velocidad = this.velocidad - v;
        if(this.velocidad <= 0){
            this.velocidad = 0;
        }
    }

    public void aumentarVelocidad(int v){
        this.velocidad = this.velocidad + v;
        if(this.velocidad >= this.velocidadMaxima){
            this.velocidad = this.velocidadMaxima;
        }
    }
}