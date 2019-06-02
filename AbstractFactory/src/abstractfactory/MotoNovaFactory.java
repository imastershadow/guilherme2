package abstractfactory;

/**
 *
 * @author 0422
 */
public class MotoNovaFactory extends MotoFactory{
    public Roda17 montarRoda() {
        return new RodaLigaLeve17();
        } 
    public Motor1500cc montarMotor() {
        return new Motor1000cc();
    }
    
}