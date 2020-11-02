/******************** Ejemplos *************************
**                                                   ***
** Autor: David Carmona Montaño                      ***
**       iscdcm.com                                  ***
** Fecha: 02 de Noviembre 2020                       ***
** Descripcion: Ejemplo de la utilizacion de         ***
				la clase Lee y sus metodos           ***
*******************************************************/
public class ejemplo
{
	public static void main (String args [])
	{
		Lee lee =  new Lee();

		// Lectura de enteros - Suma dos numeros enteros
		int numero1int, numero2int, sumaint;
		System.out.println ("Ingresa un numero entero: ");
		numero1int = lee.leerInt();
		System.out.println ("Ingresa otro numero entero: ");
		numero2int = lee.leerInt();
		sumaint = numero1int + numero2int;
	    System.out.println ("La suma es : "+sumaint+"\n");

	    //Lectura de flotantes | doubles - Suma dos numeros doubles
	    double numero1dou, numero2dou, sumadou;
	    System.out.println ("Ingresa un numero double: ");
		numero1dou = lee.leerDouble();
		System.out.println ("Ingresa otro numero double: ");
		numero2dou = lee.leerDouble();
		sumadou = numero1dou + numero2dou;
	    System.out.println ("La suma es : "+sumadou+"\n");

	    //Lectura de Strings - Leer cadena Saludar
	    String nombre;
	    System.out.println ("Escribe tu nombre: ");
		nombre = lee.leerString();
	    System.out.println ("Hola! tu nombre es: "+nombre+"\n");

	    //Lectura de un Char - Imprimir Inicial
	    char inicial;
	    System.out.println ("Escribe tu nombre: ");
		inicial = lee.leerChar();
	    System.out.println ("Tu inicial es: "+inicial+"\n");
	}
}