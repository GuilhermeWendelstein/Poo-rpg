package Testes;

class ClasseTesteGuerreiro {
    public static void testar() {
        Guerreiro g = new Guerreiro("Conan", 120, 5, 15);
        Inimigo i = new Inimigo("Goblin", 50, 2);
        g.atacar(i);
        System.out.println("Teste Guerreiro OK");
    }
}