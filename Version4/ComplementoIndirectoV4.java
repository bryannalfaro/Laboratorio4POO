/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hern�ndez
Carn�: 19372
Curso: Programaci�n orientada a objetos
Descripci�n: Clase del complemento indirecto V4
Ultima modificaci�n: 31/10/2019
Apoyo de: Tom�s G�lvez y Jorge Lara
**********************************************
*/
import java.util.ArrayList;

public class ComplementoIndirectoV4 extends ComponenteSintacticoV4{
	//atributos
	protected String a_quien;
	protected ArrayList<String> y_a_quien_mas=new ArrayList<String>();
	
	//constructor
	public ComplementoIndirectoV4(String a_quien) {
		this.a_quien=a_quien;
		super.tipo="complementoindirecto";
	}
	//obtener el array de a quien mas
	public ArrayList<String >getArray() {
		return y_a_quien_mas;
	}
	//override del metodo escribir 
	public void escribirGeneral() {
		System.out.println(a_quien+" ");
		for(int i =0;i<y_a_quien_mas.size();i++) {
			System.out.println("y "+y_a_quien_mas.get(i));
		}
	}
	
}
