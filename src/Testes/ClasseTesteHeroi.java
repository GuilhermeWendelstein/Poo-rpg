package Testes;

class ClasseTesteHeroi {
    public static void testar() {
        Heroi h = new Heroi("Arthur", 100, 1);
        Inimigo i = new Inimigo("Goblin", 50, 2);
        h.atacar(i);
        System.out.println("Teste Heroi OK");
    }
}