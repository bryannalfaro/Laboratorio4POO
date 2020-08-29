/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hern�ndez
Carn�: 19372
Curso: Programaci�n orientada a objetos
Descripci�n: Clase para controlar predicado V3
Ultima modificaci�n: 31/10/2019
Apoyo de: Tom�s G�lvez y Jorge Lara
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
