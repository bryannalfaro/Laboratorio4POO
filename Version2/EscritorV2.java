/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hernández
Carné: 19372
Curso: Programación orientada a objetos
Descripción: Clase para manejar al escritor V2
Ultima modificación: 31/10/2019
Apoyo de: Tomás Gálvez y Jorge Lara
**********************************************
*/
import java.util.ArrayList;

public class EscritorV2 {
	//Atributo
	protected ArrayList<ComponenteSintacticoV2> componentes = new ArrayList<ComponenteSintacticoV2>();
	
	//Obtener componentes
	public ArrayList<ComponenteSintacticoV2> getComponentes(){
		return componentes;
	}
	//Metodo para escribir 
	public void escribirComponentes() {
		for(int i=0;i<componentes.size();i++) {
			componentes.get(i).escribirGeneral();
		}
	}
}



