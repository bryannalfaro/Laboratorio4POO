/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hern�ndez
Carn�: 19372
Curso: Programaci�n orientada a objetos
Descripci�n: Clase principal para controlar el simulador V3
Ultima modificaci�n: 31/10/2019
Apoyo de: Tom�s G�lvez y Jorge Lara
**********************************************
*/
public class Main123 {
	
	public static void main(String args[]) {
		//INSTANCIAS
		EscritorV3 escritor = new EscritorV3();
		SujetoV3 sujeto = new SujetoV3();
		PredicadoV3 predicado = new PredicadoV3();
		
		ComplementoIndirectoV3 indirecto = new ComplementoIndirectoV3("a sus programas");
		
		//INSERTAR DATOS
		indirecto.getArray().add("a sus vidas");
		indirecto.getArray().add("al mundo");
		predicado.verbo="trae";
		predicado.complemento_directo="bendiciones";
		sujeto.valor="El principio de abierto-cerrado (open-closed principle en ingles)";
		
		escritor.getComponentes().add(indirecto);
		escritor.getComponentes().add(predicado);
		escritor.getComponentes().add(sujeto);
		//MOSTRAR LOS DATOS EN PANTALLA
		escritor.escribirComponentes();
		//MOSTRAR LA PRECEDENCIA COMPROBADO CON SUJETO Y PREDICADO
		System.out.println("Sujeto no precede de predicado por lo tanto: "+predicado.precede(sujeto));
		System.out.println("Indirecto precede de predicado por lo tanto:"+ predicado.precede(indirecto));
		
		
	}
	
	
	

}
