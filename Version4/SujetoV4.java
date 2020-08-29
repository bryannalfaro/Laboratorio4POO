/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hern�ndez
Carn�: 19372
Curso: Programaci�n orientada a objetos
Descripci�n: Clase de sujeto V4
Ultima modificaci�n: 31/10/2019
Apoyo de: Tom�s G�lvez y Jorge Lara
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
