/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hernández
Carné: 19372
Curso: Programación orientada a objetos
Descripción: Clase que maneja el sujeto V2
Ultima modificación: 31/10/2019
Apoyo de: Tomás Gálvez y Jorge Lara
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
