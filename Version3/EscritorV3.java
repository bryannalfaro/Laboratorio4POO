/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hernández
Carné: 19372
Curso: Programación orientada a objetos
Descripción: Clase que maneja el escritor
Ultima modificación: 31/10/2019
Apoyo de: Tomás Gálvez y Jorge Lara
**********************************************
*/
import java.util.ArrayList;

public class EscritorV3 {
	protected ArrayList<ComponenteSintacticoV3> componentes = new ArrayList<ComponenteSintacticoV3>();
	//Obtener el array de componentes
	public ArrayList<ComponenteSintacticoV3> getComponentes(){
		return componentes;
	}
	//metodo para escribir
	public void escribirComponentes() {
		for(int i=0;i<componentes.size();i++) {
			componentes.get(i).escribirGeneral();
		}
	}
}



