package model;

public class Inimigo extends Personagem{
    private int xp;

    public Inimigo(String nome, int vida, int nivel, int xp){
        super(nome, vida, nivel);
        this.xp = xp;
    }

    @Override
    public void atacar(Personagem alvo){
        int dano = 8 + nivel;
        System.out.println(nome + " atacou " + alvo.getNome() + ".");
        alvo.receberDano(dano);
    }

    public int getXp(){
        return xp;
    }
}
