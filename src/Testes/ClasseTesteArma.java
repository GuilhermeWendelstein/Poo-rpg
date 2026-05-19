package Testes;

class ClasseTesteArma {
    public static void testar(){
        Arma a = new Arma(25);
        Heroi h = new Heroi("Arthur", 100, 1);
        a.usar(h);
        System.out.println("Teste arma Ok");
    }
}
