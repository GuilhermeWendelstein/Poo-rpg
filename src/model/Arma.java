package model;

public class Arma extends Item {
    private int dano;

    public Arma(String nome, String tipo, int dano){
        super(nome, tipo, 0);
        this.dano = dano;
    }
    @Override
    public void usar(Personagem alvo){
        System.out.println(nome + " causou " + dano + " de dano em " + alvo.getNome() + ".");
        alvo.receberDano(dano);
    }
    public int getDano(){
        return dano;
    }
}
