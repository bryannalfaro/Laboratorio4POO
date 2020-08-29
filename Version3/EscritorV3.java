/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hern�ndez
Carn�: 19372
Curso: Programaci�n orientada a objetos
Descripci�n: Clase que maneja el escritor
Ultima modificaci�n: 31/10/2019
Apoyo de: Tom�s G�lvez y Jorge Lara
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



