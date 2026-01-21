package atv2.pagamentos.formasPagamento;

import atv2.pagamentos.gateway.PagamentoGateway;

public class StripeSDK implements PagamentoGateway {

    @Override
    public void pagar(double valor) {
        System.out.println("Stripe: pagamento de R$ " + valor + " realizado.");
    }
}
