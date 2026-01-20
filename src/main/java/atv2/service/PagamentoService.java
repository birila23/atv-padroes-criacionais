package atv2.service;

import atv2.pagamentos.gateway.PagamentoGateway;

public class PagamentoService {

    private final PagamentoGateway pagamentoGateway;

    public PagamentoService(PagamentoGateway pagamentoGateway) {
        this.pagamentoGateway = pagamentoGateway;
    }

    public void pagar(double valor) {
        pagamentoGateway.pagar(valor);
    }
}
