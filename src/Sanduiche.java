public class Sanduiche extends Lanche {
    private String[] ingredientes = new String[10];
    private int capacidade;

    public Sanduiche(double preco) {
        super(preco);
        this.setTempoDePreparo(15);
    }

    public void adicionarIngrediente(String ingrediente) {
        ingredientes[capacidade++] = ingrediente;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }
}
