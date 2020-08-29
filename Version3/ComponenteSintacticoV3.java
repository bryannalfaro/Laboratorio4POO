/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hernández
Carné: 19372
Curso: Programación orientada a objetos
Descripción: Clase donde se maneja el componente sintactico V3
Ultima modificación: 31/10/2019
Apoyo de: Tomás Gálvez y Jorge Lara
**********************************************
*/
public abstract class ComponenteSintacticoV3 {
	//Atributo
	protected String tipo;
	//Obtener el tipo
	public String getTipo() {
		return tipo;
	}
	//metodo abstracto para escribir
	public abstract void escribirGeneral();
	//metodo para comprobar precedencia
	public abstract boolean precede(ComponenteSintacticoV3 cs);
}
