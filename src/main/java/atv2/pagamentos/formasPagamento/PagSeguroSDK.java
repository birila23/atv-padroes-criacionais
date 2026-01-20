package atv2.pagamentos.formasPagamento;

import atv2.pagamentos.gateway.PagamentoGateway;

public class PagSeguroSDK implements PagamentoGateway {

    @Override
    public void pagar(double valor) {
        System.out.println("PagSeguro: pagamento de R$ " + valor + " confirmado.");
    }
}
