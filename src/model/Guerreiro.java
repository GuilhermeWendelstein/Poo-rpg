package model;

public class Guerreiro extends Heroi {
    private int forca;

    public Guerreiro(String nome, int vida, int nivel, int xp, String arma, int forca){
        super(nome, vida, nivel, xp, arma);
        this.forca = forca;
    }

    @Override
    public void atacar(Personagem alvo){
        int dano = 15 + forca + nivel;
        System.out.println(nome + " golpeou " + alvo.getNome() + " com força bruta ");
        alvo.receberDano(dano);
    }

    public int getForca(){
        return forca;
    }
}
