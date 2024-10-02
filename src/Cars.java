public class Cars {
    private String modelo;
    private String marca;
    private int ano;
    private double valorVenda;

    public Cars(String modelo, String marca, int ano, double valorVenda) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.valorVenda = valorVenda + (valorVenda * 0.1);
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda + (valorVenda * 0.1);
    }
}
