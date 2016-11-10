package ar.com.educacionit.xstream.test;

import ar.com.educacionit.xstream.models.Persona;
import ar.com.educacionit.xstream.models.Telefono;

import com.thoughtworks.xstream.XStream;

public class Xstream {
	public static void main(String args[]) {
		/* es necesario descargar la librearia XSTREAM */
		
		Persona persona = new Persona();
		persona.setNombre("Santiago");
		persona.setApellido("Scalise");
		
		Telefono telefono = new Telefono();
		telefono.setNumero("4412421421");
		
		persona.setTelefono(telefono);
		
		XStream xstream = new XStream();
		xstream.alias("persona", Persona.class);
		
		String xml = xstream.toXML(persona);
		System.out.println(xml);
		
		Persona personaDecoded = (Persona)xstream.fromXML(xml);
		System.out.println(personaDecoded.getNombre());
	}
}