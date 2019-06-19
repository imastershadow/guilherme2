package abstractfactory;


public class Moto {
    Roda17 roda;
    Motor1500cc motor; 
    
    public Roda17 getRoda() {
        return roda;
    }
    
    public void setRoda (Roda17 roda){
        this.roda = roda;
    }
    
    public Motor1500cc getMotor() {
        return motor;
    }
    
    public void setMotor (Motor1500cc motor){
        this.motor = motor;
    }
}



