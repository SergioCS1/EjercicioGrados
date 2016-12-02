import java.util.Scanner;

public class Grados {


		public static void main(String[] args) {
			String r;
			char c= 'F';
			double calc;
			Scanner sc = new Scanner(System.in);
			System.out.println("Pulse 1 Para Pasar de grados centígrados a  grados Fahrenheit");
			System.out.println("Pulse 2 Para Pasar de grados Fahrenheit a  grados centígrados");
			r = sc.next();
			c = r.charAt(0);
			if (c == 'F') {
				System.out.println("Introduzca grados Centigrado");
				double g = sc.nextDouble();
				calc = 32 + (9 * g / 5);
				System.out.println(calc);

			}
			if (c == 'C') {
				System.out.println("Introduzca grados Fahrenheit");
				double g = sc.nextDouble();
				calc = (g - 32) * 5 / 9;
				System.out.println(calc);
				
			}
			if(c != 'F' || c != 'C'){
				System.out.println("Error en la seleccion");
			}
		}

	}
