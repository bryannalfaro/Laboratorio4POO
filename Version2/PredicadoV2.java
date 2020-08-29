/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hern�ndez
Carn�: 19372
Curso: Programaci�n orientada a objetos
Descripci�n: Clase que se encarga del predicado V2
Ultima modificaci�n: 31/10/2019
Apoyo de: Tom�s G�lvez y Jorge Lara
**********************************************
*/
public class PredicadoV2 extends ComponenteSintacticoV2 {
	//Atributos
	protected String verbo;
	protected String complemento_directo;
	//Constructor
	public PredicadoV2() {
		super.tipo="Predicado";
	}
	//obtener el verbo
	public String getVerbo() {
		return verbo;
	}
	//obtener el complemento directo
	public String getComplemento_directo() {
		return complemento_directo;
	}
	//Metodo de escribir override
	public void escribirGeneral() {
		System.out.println(verbo);
		System.out.println(complemento_directo);
	}
	
	
}
