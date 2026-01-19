package br.edu.ifpb.ads.padroes.atv1.rpg.equimentos;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public interface Equipamento {
    Arma criarArma();
    Armadura criarArmadura();
}
