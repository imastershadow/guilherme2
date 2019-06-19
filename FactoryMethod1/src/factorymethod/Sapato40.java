
package factorymethod;

public class Sapato40 extends FabricaSapato{
    
    public Sapato40(String marca){
        this.tamanho = marca;
        System.out.println("O tamanho do sapato é 40:" + this.tamanho);
        
    }
    
}
