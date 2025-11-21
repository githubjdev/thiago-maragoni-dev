package thiago.dev.switchcase;

public class Exemplo01SwitchInt {

	public static void main(String[] args) {
		int dia = 0;

		String nomeDia;

		switch (dia) {
		case 1:
			nomeDia = "Domingo";
			break;
		case 2:
			nomeDia = "Segunda";
			break;
		case 3:
			nomeDia = "Terça-feira";
			break;
		case 4:
			nomeDia = "Quarta-feira";
			break;
		case 5:
			nomeDia = "Quinta-feira";
			break;
		case 6:
			nomeDia = "Sexta-feira";
			break;
		case 7:
			nomeDia = "Sabado";
			break;
		default:
			nomeDia = "Dia inválido";

		}

		System.out.println(nomeDia);

	}

}
