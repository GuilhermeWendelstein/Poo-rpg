package Testes;

class ClasseTesteTelaJogo {
    public static voi testar(){
        TelaJogo tela = new TelaJogo();
        Heroi h = new Heroi("Arthur", 100, 1);
        tela.mostrarStatus(h);
        tela.mostrarMenu();
        System.out.println("Teste TelaJogo OK");
    }
}
