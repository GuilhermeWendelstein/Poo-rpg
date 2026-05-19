package Testes;

class ClasseTesteBatalha {
    public static void testar(){
        Heroi h = new Heroi("Arthur", 100, 1);
        Inimigo i = new Inimigo("Goblin", 50, 2);
        Batalha b = new Batalha(h, i, 0);
        b.iniciar();
        System.out.println("Teste Batalha Ok");
    }
}
