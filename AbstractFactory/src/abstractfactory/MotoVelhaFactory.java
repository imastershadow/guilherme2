package abstractfactory;

public class MotoVelhaFactory  extends MotoFactory{
    public Roda17 montarRoda() {
        return new Roda18();
        } 
    public Motor1500cc montarMotor() {
        return new Motor700cc();
    }
    
}
