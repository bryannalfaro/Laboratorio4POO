/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hernández
Carné: 19372
Curso: Programación orientada a objetos
Descripción: Clase para controlar predicado V3
Ultima modificación: 31/10/2019
Apoyo de: Tomás Gálvez y Jorge Lara
**********************************************
*/
public class PredicadoV3 extends ComponenteSintacticoV3 {
	//Propiedades
	protected String verbo;
	protected String complemento_directo;
	
	//Constructor
	public PredicadoV3() {
		super.tipo="Predicado";
	}
	//Obtener el verbo
	public String getVerbo() {
		return verbo;
	}
	//Obtener el complemento
	public String getComplemento_directo() {
		return complemento_directo;
	}
	//Metodo escribir override
	public void escribirGeneral() {
		System.out.println(verbo);
		System.out.println(complemento_directo);
	}
	//Comprobar precedencia override
	public boolean precede(ComponenteSintacticoV3 cs) {
		if(cs.getTipo().equals("complementoindirecto")) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
