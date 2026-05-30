package model;

public class Magia extends Item {
    private int dano;

    public Magia(String nome, String tipo, int dano){
        super(nome, tipo, 0);
        this.dano = dano;
    }

    @Override
    public void usar(Personagem alvo) {
        System.out.println(nome + " atingiu " + alvo.getNome() + " causando" + dano + " de dano mágico");
        alvo.receberDano(dano);
    }

    public int getDano(){
        return dano;
    }
}
