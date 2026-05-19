package Testes;

class ClasseTesteMagia {
    public static void testar(){
        Magia m = new Magia(30);
        Heroi h = new Heroi("Arthur", 70, 1);
        m.usar(h);
        System.out.println("Teste Magia OK");
    }
}
