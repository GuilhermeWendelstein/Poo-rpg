package model;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<String> itens = new ArrayList<>();

    public void adicionarItem(Item item) { itens.add(item);}
    public void listarItens(){
        for(Item item : itens) {
            System.out.println(item);
        }
    }

}
