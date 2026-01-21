package br.edu.ifpb.ads.padroes.atv1.rpg.equimentos;

import br.edu.ifpb.ads.padroes.atv1.rpg.armamento.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.armamento.Armadura;

public class EquipamentoMago implements Equipamento {
    @Override
    public Arma criarArma() {
        return new Arma("Cajado Mágico", 15, "Cajado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Vestes Mágicas", 8, "Leve");
    }
}
