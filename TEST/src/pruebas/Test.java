package pruebas;

import paquete1.Persona;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona(20,"Juan");
		paquete2.Persona m = new paquete2.Persona(24,"María");
	
		System.out.println(p.toString());
		System.out.println(m.toString());
		
	}

}
