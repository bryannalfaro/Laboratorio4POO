/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hern�ndez
Carn�: 19372
Curso: Programaci�n orientada a objetos
Descripci�n: Clase para manejar el sujeto V1
Ultima modificaci�n: 31/10/2019
Apoyo de: Tom�s G�lvez y Jorge Lara
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
