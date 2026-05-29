package model;

public class Mago extends Heroi{
    private int mana;

    public Mago(String nome, int vida, int nivel, int xp, String arma, int mana) {
        super(nome, vida, nivel, xp, arma);
        this.mana = mana;
    }

    @Override
    public void atacar(Personagem alvo){
        if (mana >= 5){
            int dano = 20 + nivel;
            mana -= 5;

            System.out.println(nome + " lançou uma magia em " + alvo.getNome() + ".");
            alvo.receberDano(dano);
        } else {
            int dano = 5;
            System.out.println(nome + " está em mmana e fez um ataque fraco.");
        }
    }

    public int getMana() {
        return mana;
    }
}
