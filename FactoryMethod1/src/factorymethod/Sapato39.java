/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author 0422
 */
public class Sapato39 extends FabricaSapato{
    
    
    public Sapato39(String marca){
        this.tamanho = marca;
        System.out.println("O tamanho do sapato é 39:" + this.tamanho);
        
    }
    
}