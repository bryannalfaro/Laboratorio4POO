/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hern�ndez
Carn�: 19372
Curso: Programaci�n orientada a objetos
Descripci�n: Clase que maneja el sujeto V2
Ultima modificaci�n: 31/10/2019
Apoyo de: Tom�s G�lvez y Jorge Lara
**********************************************
*/
public class SujetoV2 extends ComponenteSintacticoV2 {
	//atributo
	protected String valor;
	//obtener el valor
	public String getValor() {
		return valor;
	}
	//constructor
	public SujetoV2() {
		super.tipo="Sujeto";
	}
	//override de escribir
	public void escribirGeneral() {
		System.out.println(valor);
	}
}
