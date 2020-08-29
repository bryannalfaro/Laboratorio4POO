/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hern�ndez
Carn�: 19372
Curso: Programaci�n orientada a objetos
Descripci�n: Clase de complemento indirecto V3
Ultima modificaci�n: 31/10/2019
Apoyo de: Tom�s G�lvez y Jorge Lara
**********************************************
*/
import java.util.ArrayList;

public class ComplementoIndirectoV3 extends ComponenteSintacticoV3{
	//Atributos
	protected String a_quien;
	protected ArrayList<String> y_a_quien_mas=new ArrayList<String>();
	
	//Constructor
	public ComplementoIndirectoV3(String a_quien) {
		this.a_quien=a_quien;
		super.tipo="complementoindirecto";
	}
	//obtener el array de a quien mas
	public ArrayList<String >getArray() {
		return y_a_quien_mas;
	}
	//override de escribir
	public void escribirGeneral() {
		System.out.println(a_quien+" ");
		for(int i =0;i<y_a_quien_mas.size();i++) {
			System.out.println("y "+y_a_quien_mas.get(i));
		}
	}
	//override de precedencia para comprobar
	public boolean precede(ComponenteSintacticoV3 cs) {
		return false;
	}
}
