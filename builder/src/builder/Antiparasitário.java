
package builder;

public class Antiparasitário extends CadastrarProduto{

    Produto prod = new Produto("ColossoFC30");

    @Override
    public void cadastrarNome(String nome) {
        prod.setNome(nome);
        prod.mostraProd();
    }

    @Override
    public void cadastrarValor(Double val) {
        prod.setValor(val);
    }

    /**
     *
     * @param QT
     */
    @Override
    public void cadastrarQT(String QT) {
        prod.setQT(QT);
    }


    
}
