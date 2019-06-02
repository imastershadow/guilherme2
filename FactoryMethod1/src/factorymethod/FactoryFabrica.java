/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author Rafael
 */
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