/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hernández
Carné: 19372
Curso: Programación orientada a objetos
Descripción: Clase de predicado V4
Ultima modificación: 31/10/2019
Apoyo de: Tomás Gálvez y Jorge Lara
**********************************************
*/
public class PredicadoV4 extends ComponenteSintacticoV4 {
	//Atributos
	protected String verbo;
	protected String complemento_directo;
	
	//Constructor
	public PredicadoV4() {
		super.tipo="Predicado";
	}
	//Obtener el verbo
	public String getVerbo() {
		return verbo;
	}
	//Obtener el complemento
	public String getComplemento_directo() {
		return complemento_directo;
	}
	//Override del metodo escribir
	public void escribirGeneral() {
		System.out.println(verbo);
		System.out.println(complemento_directo);
	}
	
	
}
