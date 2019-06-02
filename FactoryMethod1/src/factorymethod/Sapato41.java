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
public class Sapato41 extends FabricaSapato{
    
    public Sapato41(String marca){
        this.tamanho = marca;
        System.out.println("O tamanho do sapato é 41:" + this.tamanho);
        
    }
}
