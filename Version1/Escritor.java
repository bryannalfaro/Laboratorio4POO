/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hernández
Carné: 19372
Curso: Programación orientada a objetos
Descripción: Clase para manejar el escritor V1
Ultima modificación: 31/10/2019
Apoyo de: Tomás Gálvez y Jorge Lara
**********************************************
*/
import java.util.ArrayList;

public class Escritor {
	//Atributo
	protected ArrayList<ComponenteSintactico> componentes = new ArrayList<ComponenteSintactico>();
	//METODO PARA ESCRIBIR UN SUJETO
	public void escribirSujeto(Sujeto s) {
		System.out.println(s.valor);
	}
	//METODO PARA OBTENER LOS COMPONENTES
	public ArrayList<ComponenteSintactico> getComponentes(){
		return componentes;
	}
	//METODO PARA ESCRIBIR UN PREDICADO
	public void escribirPredicado(Predicado p) {
		System.out.println(p.verbo);
		System.out.println(p.complemento_directo);
	}
	//METODO PARA ESCRIBIR DE ACUERDO AL TIPO DE COMPONENTE
	public void escribirComponentes() {
		for(int i=0;i<componentes.size();i++) {
			if(componentes.get(i).getTipo().equals("Predicado")){
				escribirPredicado((Predicado) componentes.get(i));
			}
			else {
				escribirSujeto((Sujeto)componentes.get(i));
			}
		}
	}
}
