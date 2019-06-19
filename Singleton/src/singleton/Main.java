
package singleton;

public class Main {
    public static void main(String[] args) {
        
         
    AgroComplem AgroComplem1 =  AgroComplem.getInstancia();
    AgroComplem1.Ração="22ae Especial";
    AgroComplem1.QtProteina="22%";
    AgroComplem1.Animal="Vaca Leite";
  
    System.out.println("Informações: " + AgroComplem1 + " Ração: " + AgroComplem1.Ração + " QtProteina: " + AgroComplem1.QtProteina + AgroComplem1 + "Animal" + AgroComplem1.Animal);
    
    System.out.println("");
    
    AgroComplem AgroComplem2 =  AgroComplem.getInstancia();
    AgroComplem2.Ração="18ae";
    AgroComplem2.QtProteina="18%";
    AgroComplem2.Animal="Vaca Corte";
    
    System.out.println("Informações: " + AgroComplem1 + " Ração: " + AgroComplem1.Ração + " QtProteina: " + AgroComplem1.QtProteina + AgroComplem1 + "Animal" + AgroComplem1.Animal);
}
}
