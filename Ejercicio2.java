import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int seleccion = 0;
		String numerotar1;
		double pago, total, pago2;
		double vueltas;
		String numerotar;
		Integer c = 0, v = 0, d = 0, bc = 0, md = 0, u = 0;
		Integer m = 0, vc = 0, dc = 0, cc = 0, dic = 0, uc = 0;
		int primer, tamaño;
		/* declaro todos los valores */

		System.out.println("Indique la cantidad indicada en su ticket");
		total = sc.nextDouble();

		System.out.println("Seleccione el tipo de pago 1(efectivo) o 2(tarjeta)");
		seleccion = sc.nextInt();

		if (seleccion == 1) {
			System.out.println("Ha seleccionado pago en efectivo");
			System.out.println("Porfavor indique la cantidad de dinero que va a entregar");
			pago = sc.nextDouble();
			if (pago > total) {
			vueltas = pago - total;
			if (vueltas > 0) {
				while (vueltas >= 50) {
					vueltas = vueltas - 50;
					c++;
				}
				while (vueltas >= 20) {
					vueltas = vueltas - 20;
					v++;
				}
				while (vueltas >= 10) {
					vueltas = vueltas - 10;
					d++;
				}
				while (vueltas >= 5) {
					vueltas = vueltas - 5;
					bc++;
				}
				while (vueltas >= 2) {
					vueltas = vueltas - 2;
					md++;
				}
				while (vueltas >= 1) {
					vueltas = vueltas - 1;
					u++;
				}
				while (vueltas >= 0.5) {
					vueltas = (vueltas - 0.5);
					m++;
				}
				while (vueltas >= 0.2) {
					vueltas = vueltas - 0.2;
					vc++;
				}
				while (vueltas >= 0.1) {
					vueltas = vueltas - 0.1;
					dc++;
				}
				while (vueltas >= 0.05) {
					vueltas = vueltas - 0.05;
					cc++;
				}
				while (vueltas >= 0.02) {
					vueltas = vueltas - 0.02;
					dic++;
				}
				while (vueltas >= 0.01) {
					vueltas = vueltas - 0.01;
					uc++;
				}

			System.out.println("Se devuelven:");
			if (c >= 1) {
				System.out.println(+c + " Billetes de 50 ");
			} else {
			}
				if (v >= 1) {
					System.out.println(+v + " Billetes de 20 ");
				}
				if (d >= 1) {
					System.out.println(+d + " Billetes de 10 ");
				}
				if (bc >= 1) {
					System.out.println(+bc + " Billetes de 5 ");
				}
				if (md >= 1) {
					System.out.println(+md + " Monedas de 2 ");
				}
				if (u >= 1) {
					System.out.println(+u + " monedas de 1 ");
				}
				if (m >= 1) {
					System.out.println(+m + " monedas de 50 centimos ");
				}
				if (vc >= 1) {
					System.out.println(+vc + " monedas de 20 centimos ");
				}
				if (dc >= 1) {
					System.out.println(+dc + " monedas de 10 centimos ");
				}
				if (cc >= 1) {
					System.out.println(+cc + " monedas de 5 centimos ");
				}
				if (dic >= 1) {
					System.out.println(+dic + " monedas de 2 centimos ");
				}
				if (uc >= 1) {
					System.out.println(+uc + " monedas de 1 centimo ");
				}

			} /* lo he hecho con if para que sea mas preciso */
		}
	}
		if (seleccion == 2) {
			System.out.println("Ha seleccionado pago en tarjeta");
			System.out.println("¿Cuanto quiere pagar?");
			pago2 = sc.nextDouble();
			if (pago2 >= total) {
			System.out.println("Ingrese los numeros de su tarjeta en su debido orden");
			numerotar1 = sc.nextLine();
			numerotar1 = sc.nextLine();

			numerotar = numerotar1.replaceAll("\\s", "");
			System.out.println(numerotar);
			numerotar.charAt(0);
			numerotar.length();
			primer = Character.getNumericValue(numerotar.charAt(0));
			tamaño = numerotar.length();

			if (primer == 3 && tamaño == 15) {
				System.out.println("Se ha realizado el pago con exito");
				System.out.println("Su tarjeta es una American Express");

			} else {

				if (primer == 4 && tamaño == 16) {
					System.out.println("se ha realizado el pago con exito");
					System.out.println("Su tarjeta es una visa");

				} else {

					if (primer == 5 && tamaño == 16) {
						System.out.println("Su pago ha sido realizado con exito");
						System.out.println("su tarjeta es una mastercard");

					} else {

						System.out.println("ERROR 404");
						System.out.println(
								"Recuerde que solo aceptamos: American Express, Visa y Mastercard y que todos los valores tienen que ser numeros");
						/* hacemos las restricciones de los numeros en el if */
					}
				}
			}
		} else {
			System.out.println("La cantidad tiene que ser igual o maor a la del ticket");
			System.out.println("pruebe de nuevo");
			}

		}
		sc.close();
	}

}
