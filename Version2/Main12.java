/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hern�ndez
Carn�: 19372
Curso: Programaci�n orientada a objetos
Descripci�n: Clase principal para simulador V2
Ultima modificaci�n: 31/10/2019
Apoyo de: Tom�s G�lvez y Jorge Lara
**********************************************
*/
public class Main12 {
	
	public static void main(String args[]) {
		//Instancias
		EscritorV2 escritor = new EscritorV2();
		SujetoV2 sujeto = new SujetoV2();
		PredicadoV2 predicado = new PredicadoV2();
		
		ComplementoIndirectoV2 indirecto = new ComplementoIndirectoV2("a sus programas");
		
		//Llenado de datos
		indirecto.getArray().add("a sus vidas");
		indirecto.getArray().add("al mundo");
		predicado.verbo="trae";
		predicado.complemento_directo="bendiciones";
		sujeto.valor="El principio de abierto-cerrado (open-closed principle en ingles)";
		
		escritor.getComponentes().add(indirecto);
		escritor.getComponentes().add(predicado);
		escritor.getComponentes().add(sujeto);
		//mostrar en pantalla por el escritor
		escritor.escribirComponentes();
		
		
	}
	
	
	

}
