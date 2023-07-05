/*
 * author: alh9cef@gmail.com
 * date: 2023/04/07
 * Clase Main
 **/

import conversores.*;
import pantallas.Pantallas;

public class Main {

	public static void main(String[] args) {

		//Conversores a seleccionar
		Object[] posiblesValores = { "Conversor de Monedas", "Conversor de Temperatura", "Conversor de Distancia"};
		
		//captura de errores
		try {
			//llamada a la pantalla para seleccionar un conversor, se envia titulo, mensaje y opciones posibles a seleccionar
			Object opcionSeleccionada = Pantallas.Selector("Conversor", "Seleccione una opcion", posiblesValores);
			
			//dependiendo de la opcion se llama al conversor correspondiende
			if(opcionSeleccionada == posiblesValores[0]) {
				Conversor.Monedas();
			}else if(opcionSeleccionada == posiblesValores[1]) {
				Conversor.Temperatura();
			}else if(opcionSeleccionada == posiblesValores[2]) {
				Conversor.Distacia();
			}else {
				Pantallas.Dialogo("La opcion no es valida");
			}
			
			//ventana de desea continuar
			int siono = Pantallas.Confirmacion("Conversor", "Desea Continuar");
			
			//si desea continuar se vuelve  a llamar la fincion si no se envia el mensa de finalizacion
			if (siono == 0) {
				Main.main(args);;
			} else {
				Pantallas.Dialogo("Programa finalizado");
			}
			
		} catch (Exception e) {
			Pantallas.Dialogo("Ha ocurrido el error: \n" + e);;
		}
		 
	}

}
