
package clases;

public class clase_retiro extends clase1 {
     
    @Override
    public void Transaciones  (){
           System.out.println("Cuanto va retirar.");
          Retiro();
          if (retiro <= getSaldo()){
          transaciones = getSaldo();
              setSaldo(transaciones - retiro);
              System.out.println("Retiro" + retiro);
              System.out.println("Saldo Actual" + getSaldo());
          }else{
           System.out.println("Saldo Insuficiente.");   
          }
      
    }
    
}   

