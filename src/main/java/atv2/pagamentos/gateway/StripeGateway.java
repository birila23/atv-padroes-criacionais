package atv2.pagamentos.gateway;

import atv2.pagamentos.formasPagamento.StripeSDK;

public class StripeGateway implements PagamentoGateway {
    private final StripeSDK stripeSDK;

    public StripeGateway(StripeSDK stripeSDK) {
        this.stripeSDK = stripeSDK;
    }

    @Override
    public void pagar(double valor) {
        stripeSDK.pagar(valor);
    }
}
