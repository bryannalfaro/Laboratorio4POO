/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hern�ndez
Carn�: 19372
Curso: Programaci�n orientada a objetos
Descripci�n: Clase que sera el main del comprobador sintactico version 4
Ultima modificaci�n: 31/10/2019
Apoyo de: Tom�s G�lvez y Jorge Lara
**********************************************
*/
public class Main1234 {
	
	public static void main(String args[]) {
		//Instancias
		EscritorV4 escritor = new EscritorV4();
		SujetoV4 sujeto = new SujetoV4();
		PredicadoV4 predicado = new PredicadoV4();
		comprobacionPrece comprobar = new comprobacionPrece();
		
		ComplementoIndirectoV4 indirecto = new ComplementoIndirectoV4("a sus programas");
		//anadir elementos
		indirecto.getArray().add("a sus vidas");
		indirecto.getArray().add("al mundo");
		predicado.verbo="trae";
		predicado.complemento_directo="bendiciones";
		sujeto.valor="El principio de abierto-cerrado (open-closed principle en ingles)";
		
		escritor.getComponentes().add(indirecto);
		escritor.getComponentes().add(predicado);
		escritor.getComponentes().add(sujeto);
		
		//Mostrar en pantalla los componentes
		escritor.escribirComponentes();
		//Realizar la comprobacion 
		comprobar.generalizacion(predicado);
		comprobar.generalizacion(sujeto);
	}
}
