
package factorymethod;


public class FactoryMethod {

   
    public static void main(String[] args) {
      FactoryFabrica factory = new FactoryFabrica();
      String tamanho = "41";
      String marca = "Nike";
      factory.getFabricaSapato(marca, tamanho);
      
      
      FactoryFabrica factory1 = new FactoryFabrica();
      String tamanho1 = "40";
      String marca1 = "Adidas";
      factory1.getFabricaSapato(marca1, tamanho1);
      
      FactoryFabrica factory2 = new FactoryFabrica();
      String tamanho2 = "39";
      String marca2 = "Puma";
      factory1.getFabricaSapato(marca2, tamanho2);
    }
    
}
