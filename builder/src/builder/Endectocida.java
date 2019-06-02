package builder;

public class Endectocida extends CadastrarProduto {

    Produto prod = new Produto("Trucid");

    @Override
    public void cadastrarNome(String nome) {
        prod.setNome(nome);
        
    }

    @Override
    public void cadastrarValor(Double val) {
        prod.setValor(val);
    }

    @Override
    public void cadastrarQT(String QT) {
        prod.setQT(QT);
    }
    
    /**
     *
     * @param prin
     */
    @Override
    public void cadastrarPrincipio(String prin){
        prod.setPrincipio(prin);
    }
}
