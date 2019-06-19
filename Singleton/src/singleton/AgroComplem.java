
ppackage singleton;


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

   
