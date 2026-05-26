package model;

public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int nivel;
    protected Inventario inventario;

    public Personagem(String nome, int vida, int nivel){
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
        this.inventario = new Inventario();
    }

    public abstract void atacar(Personagem alvo);

    public void receberDano(int dano){
        if(this.vida < 0){
            this.vida = 0;
        }
        System.out.println(this.nome + " recebeu " + dano + " de dano");
    }

    public void usarItem(Item item, Personagem alvo){
        item.usar(alvo);
    }

    public boolean estaVivo(){
        return vida > 0;
    }

    public void curar(int quantidade){
        this.vida += quantidade;
        System.out.println(this.nome + " recuperou " + quantidade + " de vida");
    }

    public String getNome(){
        return nome;
    }

    public int getVida(){
        return vida;
    }

    public int getNivel(){
        return nivel;
    }

    public Inventario getInventario(){
        return inventario;
    }
}
