/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hern�ndez
Carn�: 19372
Curso: Programaci�n orientada a objetos
Descripci�n: Clase donde se maneja el componente sintactico V3
Ultima modificaci�n: 31/10/2019
Apoyo de: Tom�s G�lvez y Jorge Lara
**********************************************
*/
public abstract class ComponenteSintacticoV3 {
	//Atributo
	protected String tipo;
	//Obtener el tipo
	public String getTipo() {
		return tipo;
	}
	//metodo abstracto para escribir
	public abstract void escribirGeneral();
	//metodo para comprobar precedencia
	public abstract boolean precede(ComponenteSintacticoV3 cs);
}
