package thiago.dev.switchcase;

public class Exemplo03SwitchEnum {

	public static void main(String[] args) {
		StatusPedido status = StatusPedido.ENVIADO;

		String mensagem = "";

		switch (status) {
		case NOVO:
			mensagem = "seu pedido foi recebido e está em analise";
			break;
		case PAGO:
			mensagem = "Pagamento confirmado! Em será enviado seu pedido";
			break;
		case ENTREGUE:
			mensagem = "Pedido Entregue com sucesso!";
			break;
		case CANCELADO:
			mensagem = "Seu pedido foi cancelado, entre em contato para dúvidas";
		case ENVIADO:
			mensagem = "Seu pedido foi enviado";
			break;
		default:
			mensagem = "Status deconhecido";
		}

		System.out.println(mensagem);

	}

}
