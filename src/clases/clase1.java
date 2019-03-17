package clases;

import java.util.Scanner;

public abstract class clase1 {

    protected int transaciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0;
        int seleccion = 0;
        do {
            do {
                System.out.println("Seleccione  una opcion");
                System.out.println("     1. Consultar saldo.");
                System.out.println("     2. Retirar.");
                System.out.println("     3. Cosignar.");
                System.out.println("     4. Salir.");
                seleccion = entrada.nextInt();
                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println(" opcion no valida.");
                }

            } while (bandera == 0);

            if (seleccion == 1) {
              clase1 mensajero = new clase_consulta(); 
                      mensajero.Transaciones();
            } else if (seleccion == 2) {
              clase1 mensajero = new clase_retiro(); 
                      mensajero.Transaciones();
            } else if (seleccion == 3) {
                clase1 mensajero = new clase_consignar(); 
                      mensajero.Transaciones();
            } else if (seleccion == 4) {
                System.out.println("Gracias.");
                bandera = 2;

            }
        } while (bandera != 2);
    }

// cantidad de retiro
    public void Retiro() {
        retiro = entrada.nextInt();
    }

// solicitar consignar     
    public void Deposito() {
        deposito = entrada.nextInt();
    }
public abstract void Transaciones();

public int getSaldo (){
    return saldo;
    
}
public void setSaldo (int saldo){
   this.saldo = saldo;    
}

  


}
