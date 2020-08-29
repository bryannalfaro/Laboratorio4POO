/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hern�ndez
Carn�: 19372
Curso: Programaci�n orientada a objetos
Descripci�n: Clase de componente sintactico V4
Ultima modificaci�n: 31/10/2019
Apoyo de: Tom�s G�lvez y Jorge Lara
**********************************************
*/
public abstract class ComponenteSintacticoV4 {
	//Atributos
	protected String tipo;
	
	//Obtener el tipo
	public String getTipo() {
		return tipo;
	}
	
	//Metodo a ser override en las demas clases hijas
	public abstract void escribirGeneral();

}
