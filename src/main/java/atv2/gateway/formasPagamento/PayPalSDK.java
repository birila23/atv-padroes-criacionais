package atv2.gateway.formasPagamento;

import atv2.gateway.PagamentoGateway;

public class PayPalSDK implements PagamentoGateway {

    @Override
    public void pagar(double valor) {
        System.out.println("PayPal: pagamento de R$ " + valor + " realizado.");
    }
}
