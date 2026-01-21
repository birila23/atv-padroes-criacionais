package br.edu.ifpb.ads.padroes.atv1.rpg.equimentos;

import br.edu.ifpb.ads.padroes.atv1.rpg.armamento.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.armamento.Armadura;

public interface Equipamento {
    Arma criarArma();
    Armadura criarArmadura();
}
