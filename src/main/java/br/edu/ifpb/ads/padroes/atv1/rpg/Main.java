package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.config.ConfiguracaoJogo;
import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.CriadorPersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.PersonagemFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== SISTEMA RPG INICIADO ===\n");

        System.out.println("--- 1. Teste Singleton ---");
        ConfiguracaoJogo config = ConfiguracaoJogo.getInstance();
        System.out.println("Dificuldade Inicial: " + config.getNivelDificuldade());

        // Alterando a dificuldade
        config.setNivelDificuldade(10);
        System.out.println("Dificuldade Alterada para: " + config.getNivelDificuldade());

        System.out.println("\n--- 2. Teste Factory e Builder ---");

        PersonagemFactory fabrica = new CriadorPersonagem();

        // Criando um Guerreiro Humano
        Personagem p1 = fabrica.criar("Aragorn", "Humano", "Guerreiro");

        if (p1 != null) {
            System.out.println("Personagem Criado com Sucesso:");
            System.out.println(p1.toString());
        } else {
            System.out.println("Falha ao criar personagem (combinação inválida).");
        }

        // Criando um Mago Elfo
        Personagem p2 = fabrica.criar("Legolas Mágico", "Elfo", "Mago");
        if (p2 != null) {
            System.out.println("\nOutro Personagem Criado:");
            System.out.println(p2.toString());
        }

        System.out.println("\n--- 3. Teste Prototype ---");

        try {
            Personagem clone = p1.clone();

            clone.setNome("Aragorn Clone Sombrio");

            System.out.println("Original: " + p1.getNome());
            System.out.println("Clone:    " + clone.getNome());

            if (p1 != clone) {
                System.out.println("O clone foi feito com sucesso.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao clonar: " + e.getMessage());
        }
    }
}
