package br.edu.ifpb.ads.padroes.atv1.rpg.personagem;

import br.edu.ifpb.ads.padroes.atv1.rpg.equimentos.Equipamento;
import br.edu.ifpb.ads.padroes.atv1.rpg.equimentos.EquipamentoArqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.equimentos.EquipamentoGuerreiro;

public class CriadorPersonagem implements PersonagemFactory {

    @Override
    public Personagem criar(String nome, String raca, String classe) {
        PersonagemBuilder builder = new PersonagemBuilder()
                .nome(nome)
                .raca(raca)
                .classe(classe);

        Equipamento equipamentoFactory = null;

        if (raca.equals("Humano")) {
            if (classe.equals("Guerreiro")) {
                equipamentoFactory = new EquipamentoGuerreiro(); // Usa a Abstract Factory
                builder.atributos(15, 8, 10, 120, 30)
                        .habilidades(new String[]{"Investida", "Bloqueio"});
            }
        }
        else if (raca.equals("Elfo")) {
            if (classe.equals("Arqueiro")) {
                equipamentoFactory = new EquipamentoArqueiro(); // Usa a Abstract Factory
                builder.atributos(8, 16, 20, 90, 100)
                        .habilidades(new String[]{"Tiro Múltiplo", "Camuflagem"});
            }
        }

        if (equipamentoFactory == null) {
            throw new IllegalArgumentException("Combinação inválida de Raça e Classe");
        }

        builder.equipamento(equipamentoFactory.criarArma(), equipamentoFactory.criarArmadura());

        return builder.build();
    }

    public Personagem criarPersonagemEspecial(String nome, String raca, String classe) {
        Personagem base = criar(nome, raca, classe);
        Personagem especial = base.clone();

        // Modifica o clone sem afetar o original e sem repetir lógica de construção
        especial.setNome(nome + " o Lendário");
        return especial;
    }
}
