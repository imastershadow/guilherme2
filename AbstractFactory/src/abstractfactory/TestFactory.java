package abstractfactory;

/**
 *
 * @author 0422
 */
public class TestFactory {
     private static Moto montarMoto(String tipo){
        MotoFactory cf = null;
        switch(tipo){
            case"Nova":
                cf = new MotoNovaFactory();
                break;
            case "Velha":
                cf = new MotoVelhaFactory();
            }
        Moto moto = new Moto();
        moto.setRoda(cf.montarRoda());
        moto.setMotor(cf.montarMotor());
        return moto;
     }
     
     public static void main(String [] args){
         Moto c1 = montarMoto("Nova");
         Moto c12 = montarMoto("Velha");
         System.out.println("END"); 
     }
     

        
        
}
    

