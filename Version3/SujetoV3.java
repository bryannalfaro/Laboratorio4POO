/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hern�ndez
Carn�: 19372
Curso: Programaci�n orientada a objetos
Descripci�n: Clase donde se maneja el sujeto V3
Ultima modificaci�n: 31/10/2019
Apoyo de: Tom�s G�lvez y Jorge Lara
**********************************************
*/
public class SujetoV3 extends ComponenteSintacticoV3 {
	//Atributo
	protected String valor;
	//OBTENER VALOR
	public String getValor() {
		return valor;
	}
	//CONSTRUCTOR
	public SujetoV3() {
		super.tipo="Sujeto";
	}
	//OVERRIDE DE ESCRIBIR
	public void escribirGeneral() {
		System.out.println(valor);
	}
	//METODO PARA COMPROBAR PRECEDENCIA
	public boolean precede(ComponenteSintacticoV3 cs) {
		return false;
	}
}
