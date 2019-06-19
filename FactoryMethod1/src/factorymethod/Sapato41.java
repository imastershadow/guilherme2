
package factorymethod;

public class Sapato41 extends FabricaSapato{
    
    public Sapato41(String marca){
        this.tamanho = marca;
        System.out.println("O tamanho do sapato é 41:" + this.tamanho);
        
    }
}
