public class PrincipalAvion {
    public static void main(String[]args){
        Avion a1 = new Avion("F35");
        Avion a2 = new Avion("F22", 100, 8);
        Avion a3 = new Avion("Kfir", 200, 15);
        
        System.out.println("velocidad avion 1: " + a1.getVelocidad());
        System.out.println("velocidad avion 2: " + a2.getVelocidad());
        System.out.println("velocidad avion 3: " + a3.getVelocidad());
        
        a1.aumentarVelocidad(400);
        a2.aumentarVelocidad(480);
        System.out.println("se ha aumentado la velocidad");
        
        System.out.println("velocidad avion 1: " + a1.getVelocidad());
        System.out.println("velocidad avion 2: " + a2.getVelocidad());
        System.out.println("velocidad avion 3: " + a3.getVelocidad());
        
        System.out.println("cantidad cohetes avion 1: " + a1.getCohetes());
        System.out.println("cantidad cohetes avion 2: " + a2.getCohetes());
        System.out.println("cantidad cohetes avion 3: " + a3.getCohetes());
        
        int x = 0;
        while(x < 3){
            a1.disparar();
            a2.disparar();
            a3.disparar();
            x = x + 1;
        }
        
        a1.tripleDisparo();
        a2.tripleDisparo();
        System.out.println("se han disparado unos cohetes");
        
        System.out.println("cantidad cohetes avion 1: " + a1.getCohetes());
        System.out.println("cantidad cohetes avion 2: " + a2.getCohetes());
        System.out.println("cantidad cohetes avion 3: " + a3.getCohetes());
    }
}