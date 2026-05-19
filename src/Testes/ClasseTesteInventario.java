package Testes;

class ClasseTesteInventario {
    public static void testar() {
        Inventario inv = new Inventario();
        inv.adicionarItem(new Magia(20));
        inv.adicionarItem(new Arma(15));
        System.out.println("Teste Inventario OK");
    }
}