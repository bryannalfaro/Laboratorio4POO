/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hernández
Carné: 19372
Curso: Programación orientada a objetos
Descripción: Clase donde se maneja el sujeto V3
Ultima modificación: 31/10/2019
Apoyo de: Tomás Gálvez y Jorge Lara
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
