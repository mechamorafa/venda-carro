public class Venda {
    private double valor;
    private String cliente;
    private String carro;

    public Venda (double valor, String cliente, String carro){
        this.valor = valor;
        this.cliente = cliente;
        this.carro = carro;
    }

    public double getValor(){
        return valor;
    }

}
