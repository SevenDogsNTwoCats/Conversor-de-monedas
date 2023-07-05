/*
 * author: alh9cef@gmail.com
 * date: 2023/04/07
 * Clase COnversor
 **/

package conversores;

import java.text.DecimalFormat;
import pantallas.Pantallas;

public class Conversor {
	
	
	/*
	 * Metodo para conversor de monedas
	 * */
	public static void Monedas() {
		
		//opciones posibles
		String[] posiblesValores = { "Dolares a Lempiras",
									"Lempiras a Dolares",
									"Euros a Lempiras",
									"Lempiras a Euros",
									"Libras Esterlinas a Lempiras",
									"Lempiras a Libras Esterlinas",
									"Yen Japones a Lempiras",
									"Lempiras a Yen Japones",
									"Won sur-coreano a Lempiras",
									"Lempiras a Won sur-coreano",};
		//formato para la salida
		DecimalFormat df = new DecimalFormat("#.##");
		
		//captura de errores
		try {
			
			//llamada a la pantalla para que el usuario ingrese la cantidad
			String cantidad = Pantallas.Entrada("Ingrese la cantidad que desea convertir");
			//llamada  a la pantalla para que el usuario seleccione la conversion
			Object opcionSeleccionada = Pantallas.Selector("Seleccione una opcion", "Conversor Moneda", posiblesValores);
			
			//conversion respectiva dependiendo la opcion y llamada a la pantalla que muestra el resultado
			if (opcionSeleccionada == posiblesValores[0]) {
				double total = Double.parseDouble(cantidad) * 24.13;
				Pantallas.Dialogo("$" + cantidad + " dolares son L" + df.format(total) + " lempiras");
			} else if (opcionSeleccionada == posiblesValores[1]) {
				double total = Double.parseDouble(cantidad) / 24.13;
				Pantallas.Dialogo("L" + cantidad + " lempiras son $" + df.format(total) + " dolares");
			}else if (opcionSeleccionada == posiblesValores[2]) {
				double total = Double.parseDouble(cantidad) * 26.73;
				Pantallas.Dialogo("€" + cantidad + " euros son L" + df.format(total) + " lempiras");
			}else if (opcionSeleccionada == posiblesValores[3]) {
				double total = Double.parseDouble(cantidad) / 26.73;
				Pantallas.Dialogo("L" + cantidad + " lempiras son €" + df.format(total) + " euros");
			}else if (opcionSeleccionada == posiblesValores[4]) {
				double total = Double.parseDouble(cantidad) * 31.24;
				Pantallas.Dialogo("£" + cantidad + " libras esterlinas son L" + df.format(total) + " lempiras");
			}else if (opcionSeleccionada == posiblesValores[5]) {
				double total = Double.parseDouble(cantidad) / 31.24;
				Pantallas.Dialogo("L" + cantidad + " lempiras son £" + df.format(total) + " libras esterlinas");
			}else if (opcionSeleccionada == posiblesValores[6]) {
				double total = Double.parseDouble(cantidad) * 5.88;
				Pantallas.Dialogo("¥" + cantidad + " yen japones son L" + df.format(total) + " lempiras");
			}else if (opcionSeleccionada == posiblesValores[7]) {
				double total = Double.parseDouble(cantidad) / 5.88;
				Pantallas.Dialogo("L" + cantidad + " lempiras son ¥" + df.format(total) + " yen japones");
			}else if (opcionSeleccionada == posiblesValores[8]) {
				double total = Double.parseDouble(cantidad) * 52.91;
				Pantallas.Dialogo("₩" + cantidad + " won sur-corenao son L" + df.format(total) + " lempiras");
			}else if (opcionSeleccionada == posiblesValores[9]) {
				double total = Double.parseDouble(cantidad) / 52.91;
				Pantallas.Dialogo("L" + cantidad + " lempiras son ₩" + df.format(total) + " won sur-coreano");
			} else {
				Pantallas.Dialogo("La opcion seleccionada no es valida");
			}
			

		} catch (NumberFormatException e) {
			Pantallas.Dialogo("El valor ingresado no es valido");
		} catch (Exception e) {
			Pantallas.Dialogo("Ha ocurrido el error: \n" + e);
		}
	}
		
	public static void Temperatura() {
		
		String[] posiblesValores = {"Farenheit a Celcius", "Celcius a Farenheit"};
		DecimalFormat df = new DecimalFormat("#.##");
		
		try {
			//llamada a la pantalla para que el usuario ingrese la cantidad
			String cantidad = Pantallas.Entrada("Ingrese la cantidad que desea convertir");
			//llamada  a la pantalla para que el usuario seleccione la conversion
			Object opcionSeleccionada = Pantallas.Selector("Seleccione una opcion", "Conversor Temperatura",posiblesValores);
			
			//conversion respectiva dependiendo la opcion y llamada a la pantalla que muestra el resultado
			if(opcionSeleccionada == posiblesValores[0]) {
				double total = (5*(Double.parseDouble(cantidad)- 32))/9;
				Pantallas.Dialogo(cantidad + "°F son " + df.format(total) + " °C");
			} else if(opcionSeleccionada == posiblesValores[1]){
				double total = (Double.parseDouble(cantidad)*9/5)+32;
				Pantallas.Dialogo(cantidad + "°C celcius son " + df.format(total) + "°F farenheit");
			} else {
				Pantallas.Dialogo("La opcion seleccionada no es valida");
			}
		} catch (NumberFormatException e) {
			Pantallas.Dialogo("El valor ingresado no es valido");
		} catch (Exception e) {
			Pantallas.Dialogo("Ha ocurrido el error: \n" + e);
		}
	}
	
	public static void Distacia() {
		
		String[] posiblesValores = {"Metros a Kilometro", "Kilometros a Metros"};
		DecimalFormat df = new DecimalFormat("#.####");
		
		try {
			//llamada a la pantalla para que el usuario ingrese la cantidad
			String cantidad = Pantallas.Entrada("Ingrese la cantidad que desea convertir");
			//llamada  a la pantalla para que el usuario seleccione la conversion
			Object opcionSeleccionada = Pantallas.Selector("Seleccione una opcion", "Conversor Distancia", posiblesValores);
			
			//conversion respectiva dependiendo la opcion y llamada a la pantalla que muestra el resultado
			if(opcionSeleccionada == posiblesValores[0]) {
				double total = Double.parseDouble(cantidad)/1000;
				Pantallas.Dialogo(cantidad + "m metros son " + df.format(total) + "km kilometros");
			} else if(opcionSeleccionada == posiblesValores[1]){
				double total = Double.parseDouble(cantidad)*1000;
				Pantallas.Dialogo(cantidad + "km kilometros son " + df.format(total) + "m metros");
			} else {
				Pantallas.Dialogo("La opcion seleccionada no es valida");
			}
			
		} catch (NumberFormatException e) {
			Pantallas.Dialogo("El valor ingresado no es valido");
		} catch (Exception e) {
			Pantallas.Dialogo("Ha ocurrido el error: \n" + e);
		}		
		
	}
	
}
