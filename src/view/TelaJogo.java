package view;

import model.Personagem;

public class TelaJogo {

    public void mostrarMenu(){
        System.out.println();
        System.out.println("====MENU DE BATALHA===");
        System.out.println("1 - Atacar");
        System.out.println("2 - Usar item");
        System.out.println("3 - Ver status");
        System.out.println("0 - Sair");
        System.out.println("Escolha uma opção: ");
    }

    pubilc void mostrarStatus(Personagem personagem){
        System.out.println();
        System.out.println("===STATUS===");
        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Vida: " + personagem.getVida());
        System.out.println("Nivel: " + personagem.getNivel());
    }

    public void mostrarMensagem(String mensagem){
        System.out.println(mensagem);
    }
}
