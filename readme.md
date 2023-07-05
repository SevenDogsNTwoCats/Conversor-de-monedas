# CONVERSOR DE MONEDAS

@auhor @SevendogsNTwoCats alh9cef@gmail.com  @date 2023/0/07

## Índice

* [Descripcion de challenge](#descripcion-del-challenge)

    * [Main](#clase-main)

    * [Conversores](#conversor)

        * [Moneda](#conversor-de-monedas-1)

        * [Temperatura](#conversor-de-temperatura)

        * [Distaancia](#conversor-de-distancia)

    * [Pantallas](#Pantallas)

        * [Dialogo](#dialogo)

        * [Selector](#selector)

        * [Entrada](#entrada)

        * [Confirmacion](#confirmacion)


## Descripcion del challenge

Challenge BackEnd Java - Conversor. En esta oportunidad, a los Devs se nos solicitó crear un conversor de divisas utilizando el lenguaje Java. Las características solicitadas por nuestro cliente son las siguientes:

El convertidor de moneda debe:

      - Convertir de la moneda de tu país a Dólar
      - Convertir de la moneda de tu país  a Euros
      - Convertir de la moneda de tu país  a Libras Esterlinas
      - Convertir de la moneda de tu país  a Yen Japonés
      - Convertir de la moneda de tu país  a Won sul-coreano

Recordando que también debe ser posible convertir inversamente, es decir:

        - Convertir de Dólar a la moneda de tu país
        - Convertir de Euros a la moneda de tu país
        - Convertir de Libras Esterlinas a la moneda de tu país
        - Convertir de Yen Japonés a la moneda de tu país
        - Convertir de Won sul-coreano a la moneda de tu país

<strong> Extras: </strong>

    - Conversor de Temperatura
    - Conversor de Distancia


## Clase Main

Funcion desde la cual se inicia el programa, contiene la opcion de seleccionar el tipo de conversor (Monedas, Temperatura y Distancia).

        posiblesValores -> Arreglo de objetos, Conversores a seleccionar
        opcionSeleccionada -> Texto, Opcion que el usuario selecciono
        siono -> Entero, Confirmacion del usuario si desea continuar o no

El usuario selecciona una opcion de posiblesValores, y se guarda en opcionSeleccionada, dependiendo la opcion se manda a llamar la funcion correspondiende de la clase Conversor, al finalizar se pregunta al usuario si desea continuar, la respuesta se guarda en la variable siono, y dependiendo la seleccion se vuelve a ejecutar el programa o se finaliza con un cuadro de dialogo que muestra un mensaje de finalizacion.

## Conversor

Hay 3 tipos de conversores: Moneda, Temperatura, Distancia.

### Conversor de monedas
Esta la funcion Monedas() la cual contiene:
        cantidad -> Double, caantidad ingresada por el usuario
        opcionSeleccionada -> Object, seleccion del usuario de tipo a tipo de moneda
        df -> DecimalFormat, para mostrar la salida en el formato deseado

El programa pide al usuario que ingrese la cantidad a convertir, luego el programa pide al usuario que seleccione el tipo de conversion de que moneda a que moneda sera, finalmente el programa dependiendo de la seleccion aplica el cambio y lo muestra en pantalla.

### Conversor de temperatura
Esta la funcion Temperatura() la cual contiene:
        cantidad -> Double, caantidad ingresada por el usuario
        opcionSeleccionada -> Object, seleccion del usuario de tipo a tipo de moneda
        df -> DecimalFormat, para mostrar la salida en el formato deseado

El programa pide al usuario que ingrese la cantidad a convertir, luego el programa pide al usuario que seleccione el tipo de conversion de que moneda a que moneda sera, finalmente el programa dependiendo de la seleccion aplica la conversion y lo muestra en pantalla.

### Conversor de distancia
Esta la funcion Distancia() la cual contiene:
        cantidad -> Double, caantidad ingresada por el usuario
        opcionSeleccionada -> Object, seleccion del usuario de tipo a tipo de moneda
        df -> DecimalFormat, para mostrar la salida en el formato deseado

El programa pide al usuario que ingrese la cantidad a convertir, luego el programa pide al usuario que seleccione el tipo de conversion de que moneda a que moneda sera, finalmente el programa dependiendo de la seleccion aplica la conversion y lo muestra en pantalla.

## Pantallas

Para mostrar las pantallas de la interfaz para el uso de la aplicacion. Hace uso de la libreria JOptionPane de javax.

### Dialogo
    /*
	 * Metodo para mostrar un cuadro de dialogo
	 * Params: mensaje - mensaje a mostrar
	 * */
	public static void Dialogo(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

### Selector
    /*
	 * Metodo para mostrar un cuadro de seleccion
	 * Params: titulo- titulo de la ventana, mensaje - mensaje a mostrar, opciones - posibles opciones a seleccionar
	 * Return: retorna la opcion seleccionada
	 * */	
	public static Object Selector(String titulo, String mensaje, Object[] opciones) {
		Object opcionSeleccionada = JOptionPane.showInputDialog(null,
					mensaje,
					titulo,
					JOptionPane.INFORMATION_MESSAGE, 
					null,
					opciones, 
					opciones[0]);
		return opcionSeleccionada;
	}

### Entrada
    /*
	 * Metodo para mostrar una entrada de texto o numero
	 * Params: mensaje - mensaje a mostrar
	 * Return: retorna la entrada ingresada por el usuario
	 * */
	public static String Entrada(String mensaje) {
		String datos = JOptionPane.showInputDialog(mensaje);
		return datos;
	}

### Confirmacion
        	
	/*
	 * Metodo para mostrar un cuadro de confirmacion
	 * Params: titulo- titulo de la ventana, mensaje - mensaje a mostrar
	 * Return: retorna un entero que representa la opcion seleccionada 1 para no, 0 para si
	 * */
	public static int Confirmacion(String titulo, String mensaje) {
		int opcion = JOptionPane.showConfirmDialog(null,
	             mensaje, titulo, JOptionPane.YES_NO_OPTION);
		return opcion;
	}

 ![imagen conversor](https://github.com/SevenDogsNTwoCats/Imagenes/blob/main/Untitled.png)





        
