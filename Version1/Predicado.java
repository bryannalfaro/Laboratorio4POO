/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hern�ndez
Carn�: 19372
Curso: Programaci�n orientada a objetos
Descripci�n: Clase para manejar predicado V1
Ultima modificaci�n: 31/10/2019
Apoyo de: Tom�s G�lvez y Jorge Lara
**********************************************
*/
public class Predicado extends ComponenteSintactico {
	//ATRIBUTOS
	protected String verbo;
	protected String complemento_directo;
	
	//CONSTRUCTOR
	public Predicado() {
		super.tipo="Predicado";
	}
	//OBTENER EL VERBO
	public String getVerbo() {
		return verbo;
	}
	//OBTENER EL COMPLEMENTO DIRECTO
	public String getComplemento_directo() {
		return complemento_directo;
	}
	
	
}

