import java.util.Scanner;
public class CalculadoraSimples {
	public static void main(String[] args) {
		char inicio = 'a';
		int vl1 = 0;
		int vl2 = 0;
		Scanner entrada = new Scanner(System.in);
		while (inicio != '0') {
			System.out.println("Bem vindo à Calculadora, por favor escolha uma das opções: \n"
					+ "------------------------------- \n"
					+ "| MENU - CALCULADORA           |\n"
					+ "| + - Somar                    |\n"
					+ "| - - Subtrair                 |\n"
					+ "| * - Multiplicar              |\n"
					+ "| / - Dividir                  |\n"
					+ "| p - Potencializar            |\n"
					+ "------------------------------- \n"
					+ "| 0 - Sair                     |\n"
					+ "------------------------------- ");
			inicio = entrada.next().charAt(0);
			switch (inicio) {
				case '+':
					System.out.println("Insira o primeiro valor: ");
					vl1 = entrada.nextInt();
					System.out.println("Insira o segundo valor: ");
					vl2 = entrada.nextInt();
					int valorfinal1 = somar(vl1, vl2);
					System.out.println("O resultado da soma de " + vl1 + " + " + vl2 + " é: " + valorfinal1);
					break;
				case '-':
					System.out.println("Insira o primeiro valor: ");
					vl1 = entrada.nextInt();
					System.out.println("Insira o segundo valor: ");
					vl2 = entrada.nextInt();
					int valorfinal2 = subtrair(vl1, vl2);
					System.out.println("O resultado da subtração de " + vl1 + " - " + vl2 + " é: " + valorfinal2);
					break;
				case '*':
					System.out.println("Insira o primeiro valor: ");
					vl1 = entrada.nextInt();
					System.out.println("Insira o segundo valor: ");
					vl2 = entrada.nextInt();
					int valorfinal3 = multiplicar(vl1, vl2);
					System.out.println("O resultado da multiplicação de " + vl1 + " * " + vl2 + " é: " + valorfinal3);
					break;
				case '/':
					System.out.println("Insira o primeiro valor: ");
					vl1 = entrada.nextInt();
					System.out.println("Insira o segundo valor: ");
					vl2 = entrada.nextInt();
					int valorfinal4 = dividir(vl1, vl2);
					System.out.println("O resultado da divisão de " + vl1 + " / " + vl2 + " é: " + valorfinal4);
					break;
				case 'p':
					System.out.println("Para calcular sua potência digite um valor: ");
					vl1 = entrada.nextInt();
					System.out.println("Para calcular sua potência digite um valor de expoente: ");
					vl2 = entrada.nextInt();
					int resultado = potencializar(vl1, vl2);
					System.out.println("O resultado da sua potenciação é: " + resultado);
					break;
				default:
					if (inicio != '0') {
						System.out.println("Você deve selecionar uma das opções acima!");
						break;
					}
		     }
	      }
		System.out.println("Obrigado por utilizar nossa calculadora!");	
	}	
			public static int somar(int valor1, int valor2) {
				int resultado = valor1 + valor2;
				return resultado;
			}
			public static int subtrair(int valor1, int valor2) {
				int resultado = valor1 - valor2;
				return resultado;
			}
			public static int multiplicar(int valor1, int valor2) {
				int resultado = valor1 * valor2;
				return resultado;
			}
			public static int dividir(int valor1, int valor2) {
				int resultado = valor1 / valor2;
				return resultado;
			}
			public static int potencializar(int valor1, int valor2) {
				int resultado = (int) Math.pow(valor1, valor2);
				return resultado;
			}
}
