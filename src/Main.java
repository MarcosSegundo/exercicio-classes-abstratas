import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        System.out.println("Escolha o tipo de lanche que deseja:");
        System.out.println("[1] Sanduiches [2] Massas [3] Bolos");
        String opcao = scanner.nextLine();
        Lanche lanche = null;

        switch (opcao) {
            case "1": lanche = menuSanduiches(); break;
            case "2": lanche = menuMassas(); break;
            case "3": lanche = menuBolos(); break;
            default: System.exit(0);
        }

        finalizarPedido(lanche);
    }

    public static Sanduiche menuSanduiches() {
        System.out.println("Voce pode escolher ate 10 ingredientes");
        System.out.println("Informe os ingredientes que deseja ou digite 0 pra sair: ");
        String itens = scanner.nextLine();
        Sanduiche sanduiche = new Sanduiche(17);

        int contador = 0;
        while(!"0".equals(itens) && contador++ < 10) {
            sanduiche.adicionarIngrediente(itens);
            itens = scanner.nextLine();
        }

        return sanduiche;
    }

    public static Massa menuMassas() {
        System.out.println("Escolha o tipo de massa que deseja:");
        System.out.println("[1] Macarrao [2] Pizza [3] Lasanha");
        String opcao = scanner.nextLine();

        System.out.print("Informe o molho que deseja: ");
        String molho = scanner.nextLine();

        switch (opcao) {
            case "1": return new Macarrao(10, molho);
            case "2": return new Pizza(40, molho);
            case "3": return new Lasanha(30, molho);
            default: return null;
        }
    }

    public static Bolo menuBolos() {

        System.out.print("informe a massa: ");
        String massa = scanner.nextLine();
        System.out.print("informe o recheio: ");
        String recheio = scanner.nextLine();
        System.out.print("informe a cobertura: ");
        String cobertura = scanner.nextLine();

        return new Bolo(15.0, massa, recheio, cobertura);
    }

    public static void finalizarPedido(Lanche lanche) {

        System.out.print("Qual a distancia do restaurante para a sua casa: ");
        int distancia = scanner.nextInt();

        int tempoTotal = lanche.getTempoDePreparo() + distancia * 10;

        System.out.printf("Seu pedido foi um(a): %s%n", lanche.getClass().getSimpleName());
        System.out.printf("O total do seu pedido e de: R$ %.2f e o tempo estimado de entrega e de: %dmin",
                lanche.getPreco(), tempoTotal);
    }
}
