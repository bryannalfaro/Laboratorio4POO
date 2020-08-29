/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hernández
Carné: 19372
Curso: Programación orientada a objetos
Descripción: Clase principal del simulador V1
Ultima modificación: 31/10/2019
Apoyo de: Tomás Gálvez y Jorge Lara
**********************************************
*/
public class Main1 {
	
	public static void main(String args[]) {
		//Instancias
		Escritor escritor = new Escritor();
		Sujeto sujeto = new Sujeto();
		Predicado predicado = new Predicado();
		
		//Llenado de datos
		predicado.verbo="trae";
		predicado.complemento_directo="bendiciones";
		sujeto.valor="El principio de abierto-cerrado (open-closed principle en ingles)";
		escritor.getComponentes().add(predicado);
		escritor.getComponentes().add(sujeto);
		//Mostrar en pantalla por medio del escritor
		escritor.escribirComponentes();
		
		
		
		
	}
	
	
	

}
