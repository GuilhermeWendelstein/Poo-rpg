package Testes;

class ClasseTesteBoss {
    public static void testar() {
        Boss b = new Boss("Dragão", 120, 6);
        Heroi h = new Heroi("Arthur", 100, 1);
        b.atacar(h);
        System.out.println("Teste Boss OK");
    }
}