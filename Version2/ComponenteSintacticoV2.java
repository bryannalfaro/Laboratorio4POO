/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hernández
Carné: 19372
Curso: Programación orientada a objetos
Descripción: Clase para controlar el componente sintactico V2
Ultima modificación: 31/10/2019
Apoyo de: Tomás Gálvez y Jorge Lara
**********************************************
*/

public abstract class ComponenteSintacticoV2 {
	//Atributo
	protected String tipo;
	//Obtener el tipo
	public String getTipo() {
		return tipo;
	}
	//Metodo para ser override en las clases hijas
	public abstract void escribirGeneral();
}

