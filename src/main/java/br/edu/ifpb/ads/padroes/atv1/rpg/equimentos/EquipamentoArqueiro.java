package br.edu.ifpb.ads.padroes.atv1.rpg.equimentos;

import br.edu.ifpb.ads.padroes.atv1.rpg.armamento.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.armamento.Armadura;

public class EquipamentoArqueiro implements Equipamento {
    @Override
    public Arma criarArma() {
        return new Arma("Arco Élfico", 20, "Arco");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Couro", 12, "Média");
    }
}
