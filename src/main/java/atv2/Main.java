package atv2;

import org.picocontainer.MutablePicoContainer;
import org.picocontainer.DefaultPicoContainer;

import atv2.pagamentos.gateway.*;
import atv2.pagamentos.formasPagamento.*;
import atv2.service.PagamentoService;

public class Main {
    public static void main(String[] args) {

        System.out.println("Pagamento PayPal:");
        MutablePicoContainer picoPayPal = new DefaultPicoContainer();

        picoPayPal.addComponent(PayPalSDK.class);
        picoPayPal.addComponent(PagamentoGateway.class, PayPalGateway.class);
        picoPayPal.addComponent(PagamentoService.class);

        PagamentoService pagamentoPayPal =
                picoPayPal.getComponent(PagamentoService.class);

        pagamentoPayPal.pagar(120.00);

        System.out.println("------------------------------");

        System.out.println("Pagamento PagSeguro:");
        MutablePicoContainer picoPagSeguro = new DefaultPicoContainer();

        picoPagSeguro.addComponent(PagSeguroSDK.class);
        picoPagSeguro.addComponent(PagamentoGateway.class, PagSeguroGateway.class);
        picoPagSeguro.addComponent(PagamentoService.class);

        PagamentoService pagamentoPagSeguro =
                picoPagSeguro.getComponent(PagamentoService.class);

        pagamentoPagSeguro.pagar(250.00);

        System.out.println("------------------------------");
        System.out.println("Pagamento Stripe:");
        MutablePicoContainer picoStripe = new DefaultPicoContainer();

        picoStripe.addComponent(StripeSDK.class);
        picoStripe.addComponent(PagamentoGateway.class, StripeGateway.class);
        picoStripe.addComponent(PagamentoService.class);

        PagamentoService pagamentoStripe =
                picoStripe.getComponent(PagamentoService.class);

        pagamentoStripe.pagar(180.00);

    }
}