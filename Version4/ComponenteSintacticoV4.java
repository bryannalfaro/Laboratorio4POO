/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hernández
Carné: 19372
Curso: Programación orientada a objetos
Descripción: Clase de componente sintactico V4
Ultima modificación: 31/10/2019
Apoyo de: Tomás Gálvez y Jorge Lara
**********************************************
*/
public abstract class ComponenteSintacticoV4 {
	//Atributos
	protected String tipo;
	
	//Obtener el tipo
	public String getTipo() {
		return tipo;
	}
	
	//Metodo a ser override en las demas clases hijas
	public abstract void escribirGeneral();

}
