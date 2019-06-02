package padraoprototype;

public class Endectocida extends ProdutoPrototype {


    public Endectocida(Endectocida Verme) {

    }

    public Endectocida() {

    }

   
    public void exibirInformacao() {
        System.out.println("====================");
        System.out.println("Marca:"+ getMarca());
        System.out.println("Informaçao:"+ getInformaçao());
    }

 
    public Endectocida clonar() {
        return new Endectocida(this);
    }
}
