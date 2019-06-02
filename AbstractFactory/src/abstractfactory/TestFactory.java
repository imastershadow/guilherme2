package abstractfactory;

/**
 *
 * @author 0422
 */
public class TestFactory {
     private static Moto montarCarro(String tipo){
        MotoFactory cf = null;
        switch(tipo){
            case"novo":
                cf = new MotoNovaFactory();
                break;
            case "atual":
                cf = new MotoVelhaFactory();
            }
        Moto carro = new Moto();
        carro.setRoda(cf.montarRoda());
        carro.setMotor(cf.montarMotor());
        return carro;
     }
     
     public static void main(String [] args){
         Moto c1 = montarCarro("novo");
         Moto c12 = montarCarro("atual");
         System.out.println("END"); 
     }
     

        
        
}
    
