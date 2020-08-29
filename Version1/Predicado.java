/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hernández
Carné: 19372
Curso: Programación orientada a objetos
Descripción: Clase para manejar predicado V1
Ultima modificación: 31/10/2019
Apoyo de: Tomás Gálvez y Jorge Lara
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

