public abstract class Massa extends Lanche {
    private String molho;

    public Massa(double preco, String molho) {
        super(preco);
        this.molho = molho;
        this.setTempoDePreparo(30);
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }
}
