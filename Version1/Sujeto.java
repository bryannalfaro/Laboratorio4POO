/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hernández
Carné: 19372
Curso: Programación orientada a objetos
Descripción: Clase para manejar el sujeto V1
Ultima modificación: 31/10/2019
Apoyo de: Tomás Gálvez y Jorge Lara
**********************************************
*/
public class Sujeto extends ComponenteSintactico {
	//ATRIBUTO
	protected String valor;
	//OBTENER EL VALOR
	public String getValor() {
		return valor;
	}
	//METODO PARA ESCRIBIR
	public void escribirGeneral() {
		System.out.println(this.valor);
	}
	//CONSTRUCTOR
	public Sujeto() {
		super.tipo="Sujeto";
	}
}
