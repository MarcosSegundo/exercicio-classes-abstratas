public class Bolo extends Lanche {
    private String massa;
    private String recheio;
    private String cobertura;

    public Bolo(double preco, String massa, String recheio, String cobertura) {
        super(preco);
        this.massa = massa;
        this.recheio = recheio;
        this.cobertura = cobertura;
        this.setTempoDePreparo(10);
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }
}
