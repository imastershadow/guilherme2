/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author hugo
 */
 public class AgroComplem {
   public static AgroComplem instancia;
    
    protected String Ração;
    protected String QtProteina;
    protected String Animal;
        
    protected AgroComplem(){
    }

     public static AgroComplem getInstancia() {
        if (instancia==null)
        instancia = new AgroComplem();  
        
        return instancia;
        
        }
    }


   
