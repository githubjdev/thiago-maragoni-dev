package thiago.dev.switchcase;

public class Exemplo02SwitchString {

	public static void main(String[] args) {
		String comando = "CRIAR";

		switch (comando) {
		case "CRIAR":
			System.out.println("Executando lógica de criação");
			break;
		case "ATUALIAR":
			System.out.println("Executando lógica de atualizar");
			break;
		case "DELETAR":
			System.out.println("Executando lógica de criação");
			break;
		case "REMOVER":
			System.out.println("Executando lógica de REMOVER");
			break;			
		default:
			System.out.println("comando inválido: -> " + comando);

		}
	}

}
