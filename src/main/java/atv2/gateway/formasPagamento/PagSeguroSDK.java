package atv2.gateway.formasPagamento;

import atv2.gateway.PagamentoGateway;

public class PagSeguroSDK implements PagamentoGateway {

    @Override
    public void pagar(double valor) {
        System.out.println("PagSeguro: pagamento de R$ " + valor + " confirmado.");
    }
}
