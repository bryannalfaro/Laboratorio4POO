/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hernández
Carné: 19372
Curso: Programación orientada a objetos
Descripción: Clase donde se realiza la comprobacion generalizada V4
Ultima modificación: 31/10/2019
Apoyo de: Tomás Gálvez y Jorge Lara
**********************************************
*/
import java.util.ArrayList;

public class comprobacionPrece {
	
	//array de archivo
	protected ArrayList<String> archivo = new ArrayList<String>();
	
	//metodo donde se comprueba en el archivo
	public void generalizacion(ComponenteSintacticoV4 cs) {
		archivo.add("Sujeto");
		archivo.add("Predicado");
		archivo.add("complementoindirecto");
		
		for(int i=0;i<archivo.size();i++) {
			if(cs.tipo.equals(archivo.get(i))) {
				System.out.println("Eres un : "+cs.tipo);
				System.out.println("Estas precedido de: ");
				for(int j=i+1;j<archivo.size();j++) {
					System.out.println(archivo.get(j));
				}
			}
		}
		archivo.clear();
	}
}
