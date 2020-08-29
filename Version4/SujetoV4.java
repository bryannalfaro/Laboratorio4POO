/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hernández
Carné: 19372
Curso: Programación orientada a objetos
Descripción: Clase de sujeto V4
Ultima modificación: 31/10/2019
Apoyo de: Tomás Gálvez y Jorge Lara
**********************************************
*/
public class SujetoV4 extends ComponenteSintacticoV4 {
	//Atributos
	protected String valor;
	
	//Obtener valor
	public String getValor() {
		return valor;
	}
	//Constructor
	public SujetoV4() {
		super.tipo="Sujeto";
	}
	//Override de escribir
	public void escribirGeneral() {
		System.out.println(valor);
	}
	
}
