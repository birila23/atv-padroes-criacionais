package br.edu.ifpb.ads.padroes.atv1.rpg.personagem;

import br.edu.ifpb.ads.padroes.atv1.rpg.equimentos.Equipamento;
import br.edu.ifpb.ads.padroes.atv1.rpg.equimentos.EquipamentoArqueiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.equimentos.EquipamentoGuerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.equimentos.EquipamentoMago;

public class CriadorPersonagem implements PersonagemFactory {

    @Override
    public Personagem criar(String nome, String raca, String classe) {
        PersonagemBuilder builder = new PersonagemBuilder()
                .nome(nome)
                .raca(raca)
                .classe(classe);

        Equipamento equipamentoFactory = null;

        if (raca.equalsIgnoreCase("Humano")) {
            if (classe.equalsIgnoreCase("Guerreiro")) {
                // Atributos de Humano Guerreiro
                builder.atributos(15, 8, 10, 120, 30)
                        .habilidades(new String[]{"Investida", "Bloqueio"});
                equipamentoFactory = new EquipamentoGuerreiro();

            } else if (classe.equalsIgnoreCase("Mago")) {
                // Atributos de Humano Mago
                builder.atributos(6, 18, 8, 80, 150)
                        .habilidades(new String[]{"Bola de Fogo", "Cura"});
                equipamentoFactory = new EquipamentoMago();

            } else if (classe.equalsIgnoreCase("Arqueiro")) {
                // Atributos de Humano Arqueiro
                builder.atributos(10, 12, 16, 100, 70)
                        .habilidades(new String[]{"Tiro Certeiro", "Chuva de Flechas"});
                equipamentoFactory = new EquipamentoArqueiro();
            }

        } else if (raca.equalsIgnoreCase("Elfo")) {
            if (classe.equalsIgnoreCase("Guerreiro")) {
                // Atributos de Elfo Guerreiro
                builder.atributos(12, 14, 16, 100, 60)
                        .habilidades(new String[]{"Dança das Lâminas", "Agilidade Élfica"});
                // Nota: O ideal seria ter uma classe 'ElfoGuerreiroEquipamento',
                // mas vou usar a genérica que você tem para o código rodar:
                equipamentoFactory = new EquipamentoGuerreiro();

            } else if (classe.equalsIgnoreCase("Mago")) {
                // Atributos de Elfo Mago (Aqui estava o erro!)
                builder.atributos(4, 20, 14, 70, 180)
                        .habilidades(new String[]{"Magia da Natureza", "Teleporte"});
                equipamentoFactory = new EquipamentoMago();

            } else if (classe.equalsIgnoreCase("Arqueiro")) {
                // Atributos de Elfo Arqueiro
                builder.atributos(8, 16, 20, 90, 100)
                        .habilidades(new String[]{"Tiro Múltiplo", "Camuflagem"});
                equipamentoFactory = new EquipamentoArqueiro();
            }

        } else if (raca.equalsIgnoreCase("Orc")) {
            if (classe.equalsIgnoreCase("Guerreiro")) {
                // Atributos de Orc Guerreiro
                builder.atributos(20, 6, 8, 150, 20)
                        .habilidades(new String[]{"Fúria", "Pancada Devastadora"});
                equipamentoFactory = new EquipamentoGuerreiro();

            } else if (classe.equalsIgnoreCase("Mago")) {
                // Atributos de Orc Mago
                builder.atributos(10, 14, 6, 100, 120)
                        .habilidades(new String[]{"Magia Sombria", "Invocação"});
                equipamentoFactory = new EquipamentoMago();

            } else if (classe.equalsIgnoreCase("Arqueiro")) {
                // Atributos de Orc Arqueiro
                builder.atributos(14, 8, 12, 120, 40)
                        .habilidades(new String[]{"Tiro Brutal", "Intimidação"});
                equipamentoFactory = new EquipamentoArqueiro();
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
