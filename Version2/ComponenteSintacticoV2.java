/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hern�ndez
Carn�: 19372
Curso: Programaci�n orientada a objetos
Descripci�n: Clase para controlar el componente sintactico V2
Ultima modificaci�n: 31/10/2019
Apoyo de: Tom�s G�lvez y Jorge Lara
**********************************************
*/

public abstract class ComponenteSintacticoV2 {
	//Atributo
	protected String tipo;
	//Obtener el tipo
	public String getTipo() {
		return tipo;
	}
	//Metodo para ser override en las clases hijas
	public abstract void escribirGeneral();
}

