package builder;

public class Produto {

    private String tipo;
    private String nome;
    private Double valor;
    private String QT;
    private String Principio;

    Produto() {

    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrincipio(String Principio) {
        this.Principio = Principio;
    }

    public Produto(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getQT() {
        return QT;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQT(String QT) {
        this.QT = QT;
    }

    public String getPrincipio() {
        return Principio;
    }

    public void mostraProd() {
        System.out.println("Tipo : " + nome);

    }
}
