/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hern�ndez
Carn�: 19372
Curso: Programaci�n orientada a objetos
Descripci�n: Clase escritor V4
Ultima modificaci�n: 31/10/2019
Apoyo de: Tom�s G�lvez y Jorge Lara
**********************************************
*/
import java.util.ArrayList;

public class EscritorV4 {
	//Array de componentes
	protected ArrayList<ComponenteSintacticoV4> componentes = new ArrayList<ComponenteSintacticoV4>();
	
	//Obtener el array
	public ArrayList<ComponenteSintacticoV4> getComponentes(){
		return componentes;
	}
	//Override de escribir
	public void escribirComponentes() {
		for(int i=0;i<componentes.size();i++) {
			componentes.get(i).escribirGeneral();
		}
	}
}



