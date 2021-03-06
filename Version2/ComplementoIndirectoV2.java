/*
**********************************************
Universidad del valle de Guatemala
Autor: Bryann Eduardo Alfaro Hern�ndez
Carn�: 19372
Curso: Programaci�n orientada a objetos
Descripci�n: Clase donde se maneja el complemento indirecto V2
Ultima modificaci�n: 31/10/2019
Apoyo de: Tom�s G�lvez y Jorge Lara
**********************************************
*/
import java.util.ArrayList;

public class ComplementoIndirectoV2 extends ComponenteSintacticoV2{
	//Atributos
	protected String a_quien;
	protected ArrayList<String> y_a_quien_mas=new ArrayList<String>();
	
	//Constructor
	public ComplementoIndirectoV2(String a_quien) {
		this.a_quien=a_quien;
	}
	//Obtener el array de a quien mas
	public ArrayList<String >getArray() {
		return y_a_quien_mas;
	}
	//Metodo para escribir , override
	public void escribirGeneral() {
		System.out.println(a_quien+" ");
		for(int i =0;i<y_a_quien_mas.size();i++) {
			System.out.println("y "+y_a_quien_mas.get(i));
		}
	}
}
