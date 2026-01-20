package atv2.pagamentos.gateway;

import atv2.pagamentos.formasPagamento.PagSeguroSDK;

public class PagSeguroGateway implements PagamentoGateway {
    private final PagSeguroSDK pagSeguroSDK;

    public PagSeguroGateway(PagSeguroSDK pagSeguroSDK) {
        this.pagSeguroSDK = pagSeguroSDK;
    }

    @Override
    public void pagar(double valor) {
        pagSeguroSDK.pagar(valor);
    }
}
