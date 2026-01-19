package br.edu.ifpb.ads.padroes.atv1.rpg.equimentos;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public class EquipamentoGuerreiro implements Equipamento {
    @Override
    public Arma criarArma() {
        return new Arma("Espada de Ferro", 25, "Espada");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Placas", 20, "Pesada");
    }
}
