package atv2.gateway.formasPagamento;

import atv2.gateway.PagamentoGateway;

public class StripeSDK implements PagamentoGateway {

    @Override
    public void pagar(double valor) {
        System.out.println("Stripe: pagamento de R$ " + valor + " realizado.");
    }
}
