package model;

public class Boss extends Inimigo {

    public Boss(String nome, int vida, int nivel, int xp) {
        super(nome, vida, nivel, xp);
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = 15 + getNivel();
        System.out.println(getNome() + " fez um ataque poderoso em " + alvo.getNome() + ".");
        alvo.receberDano(dano);
    }

    public void golpeEspecial(Personagem alvo) {
        int dano = 30 + getNivel();
        System.out.println(getNome() + " usou GOLPE ESPECIAL");
        alvo.receberDano(dano);
    }
}
