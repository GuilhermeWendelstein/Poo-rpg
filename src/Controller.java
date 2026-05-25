import java.util.Scanner;
// classe que é responsavel por controlar o fluxo do jogo 
public class Controller {
    private Heroi heroi;
    private Inimigo inimigo;
    private Scanner sc;

    public Controller() {
        sc = new Scanner(System.in);
    }
    public void iniciarjogo() {
        System.out.println("Digite seu nome de heroi: ");
        String nome = sc.nextLine();

        heroi = new Heroi(nome);
        inimigo = new Inimigo("seu inimigo é um goblin");

        System.out.println(" \n=== Jogo Iniciado ===");
        loopjogo();
    }
    private void loopjogo() {
        while (heroi.estavivo() && inimigo.estavivo()) {
            System.out.println("Status");
            heroi.mostrarStatus();
            inimigo.mostrarStatu();
            System.out.println("1 - ATACAR");
            System.out.println("2 - Ver status");
            System.out.println("escolha: ");

            int op = sc.nextInt();
            switch (op) {
                case 1:
                    turnoCombate();
                    break;

                case 2:
                    heroi.mostrarStatus();
                    break;
                default:
                    System.out.println("opçao invalida!");
            }
        }
        finlizarjogo();
    }
    private void turnoCombate() {

        heroi.atacar(inimigo);

        if (inimigo.estaVivo()) {
            inimigo.atacar(heroi);
        }
    }

    private void finalizarJogo() {

        System.out.println("\n=== FIM DO JOGO ===");

        if (heroi.estaVivo()) {
            System.out.println("Você venceu!");
            heroi.ganharXp(100);
        } else {
            System.out.println("Você perdeu!");
        }

        sc.close();
    }
}
