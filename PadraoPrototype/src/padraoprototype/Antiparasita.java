package padraoprototype;

public class Antiparasita extends  ProdutoPrototype {


    public Antiparasita(Antiparasita tenis) {
        this.informaçao = tenis.getInformaçao();
        this.marca = tenis.getMarca();
    }

    public Antiparasita() {

    }


    @Override
    public void exibirInformacao() {
        System.out.println("====================");
        System.out.println("Marca:"+ getMarca());
        System.out.println("Informaçao:"+ getInformaçao());

    }

    @Override
    public Antiparasita clonar() {
        return new Antiparasita(Antiparasita.this);
    }
}
