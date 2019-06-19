
package factorymethod;


public class Sapato39 extends FabricaSapato{
    
    
    public Sapato39(String marca){
        this.tamanho = marca;
        System.out.println("O tamanho do sapato é 39:" + this.tamanho);
        
    }
    
}
