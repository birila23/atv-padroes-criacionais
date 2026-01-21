package br.edu.ifpb.ads.padroes.atv1.rpg.personagem;

public interface PersonagemFactory {
    Personagem criar(String nome, String raca, String classe);
}
