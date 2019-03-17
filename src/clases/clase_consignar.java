package clases;

public class clase_consignar extends clase1{
    
    @Override
    public void Transaciones  (){
           System.out.print("Cuanto va cosignar:" + getSaldo());
           
           Deposito();
           transaciones = getSaldo();
           setSaldo(transaciones + deposito);
      System.out.println("Consigno:" + deposito);
      System.out.println("SaldoActual:" + getSaldo());
    }
    
}
