package padraoprototype;

public class Antiparasita extends  ProdutoPrototype {


    public Antiparasita(Antiparasita parasita1) {
        this.informaçao = parasita1.getInformaçao();
        this.marca = parasita1.getMarca();
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
