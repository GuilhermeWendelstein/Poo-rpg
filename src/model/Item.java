package model;

public class Item implements  Usavel {
    protected String nome;
    protected String tipo;
    protected int cura;

    public Item(String nome, String tipo, int cura) {
        this.nome = nome;
        this.tipo = tipo;
        this.cura = cura;
    }

    @Override
    public void usar(Personagem alvo) {
        if (tipo.equalsIgnoreCase("cura")){
            alvo.curar(cura);
            System.out.println(nome + " foi usado em " + alvo.getNome() + ".");
        }
    }

    public String getNome(){
        return nome;
    }

    public String getTipo(){
        return tipo;
    }
}
