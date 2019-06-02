package padraoprototype;

public class Main {

    public static void main(String[] args) {


        Antiparasita prototipoAntiparasita = new Antiparasita();

        ProdutoPrototype Antiparasitário = prototipoAntiparasita.clonar();
        Antiparasitário.setMarca("ColossoFC30");
        Antiparasitário.setInformaçao("Informaçao para Antiparasitário");

        Antiparasitário.exibirInformacao();

        ProdutoPrototype Antiparasitário2 = prototipoAntiparasita.clonar();
        Antiparasitário2.setMarca("Aspersin");
        Antiparasitário2.setInformaçao("Informaçao para Antiparasitário");

        Antiparasitário2.exibirInformacao();


        Endectocida Endectocida = new Endectocida();
        ProdutoPrototype Endectocida1 = Endectocida.clonar();
        Endectocida1.setMarca("Trucid");
        Endectocida1.setInformaçao("Informaçao para Endectocida");

        Endectocida1.exibirInformacao();

        ProdutoPrototype Endectocida2 = Endectocida.clonar();
        Endectocida2.setMarca("Dectomax");
        Endectocida2.setInformaçao("Informaçao para Endectocida");

        Endectocida2.exibirInformacao();
    }
}
