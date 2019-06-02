package padraoprototype;

public class Antiparasitário extends ProdutoPrototype {


    public Antiparasitário(Antiparasitário parasita) {

    }

    public Antiparasitário() {

    }

    @Override
    public void exibirInformacao() {
        System.out.println("====================");
        System.out.println("Marca:"+ getMarca());
        System.out.println("Informaçao:"+ getInformaçao());
    }

    @Override
    public Antiparasitário clonar() {

        return new Antiparasitário(this);
    }
}
