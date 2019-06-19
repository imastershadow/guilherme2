
package factorymethod;


public class FactoryFabrica {
    public FabricaSapato getFabricaSapato(String marca, String tamanho){
        if (marca.equals("Nike"))
            return new Sapato41(tamanho);
        if (marca.equals("Adidas"))
            return new Sapato40(tamanho);
        if (marca.equals("Puma"))
            return new Sapato39(tamanho);
        
         return null;
    }
       
   
}
