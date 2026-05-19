package Testes;

class ClasseTesteMago {
    public static void testar() {
        Mago m = new Mago("Merlin", 80, 5, 20);
        Inimigo i = new Inimigo("Goblin", 50, 2);
        m.atacar(i);
        System.out.println("Teste Mago OK");
    }
}
