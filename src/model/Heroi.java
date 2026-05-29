package model;

public class Heroi extends Personagem {
    protected int xp;
    protected String arma;

    public Heroi(String nome, int vida, int nivel, int xp, String arma){
        super(nome, vida, nivel);
        this.xp = xp;
        this.arma = arma;
    }

    @Override
    public void atacar(Personagem alvo){
        int dano = 10 + nivel;
        System.out.println(nome + " atacou " + alvo.getNome() + " com " + arma + ".");
        alvo.receberDano(dano);
    }

    public void ganharXp(int quantidade){
        this.xp += quantidade;
        System.out.println(nome + " ganhou " + quantidade + " XP. ");
    }

    public int getXp(){
        return xp;
    }

    public String getArma(){
        return arma;
    }
}
