package Testes;

class ClasseTesteJogoController {
    public static void testar(){
        JogoController controller = new JogoController();
        controller.iniciarJogo("Arthur");
        System.out.println("Teste JogoController OK");
    }
}
