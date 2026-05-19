package Testes;

class ClasseTesteInimigo {
    public static void testar() {
        Inimigo i = new Inimigo("Goblin", 50, 2);
        Heroi h = new Heroi("Arthur", 100, 1);
        i.atacar(h);
        System.out.println("Teste Inimigo OK");
    }
}