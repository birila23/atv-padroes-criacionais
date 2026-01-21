package atv2.pagamentos.gateway;

import atv2.pagamentos.formasPagamento.PayPalSDK;

public class PayPalGateway implements PagamentoGateway {
    private final PayPalSDK payPalSDK;

    public PayPalGateway(PayPalSDK payPalSDK) {
        this.payPalSDK = payPalSDK;
    }

    @Override
    public void pagar(double valor) {
        payPalSDK.pagar(valor);
    }
}
