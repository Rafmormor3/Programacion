package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import main.java.model.Casetas.Caseta;
import main.java.model.Estudiante.Estudiante;
import main.java.model.Estudiante.Genero;
import main.java.xml.reader.LectorXML;
import main.java.xml.reader.LectorXMLCaseta;
import main.java.xml.writer.EscritorXml;

public class Principal {

	public static void main(String[] args) {
		
		List<Estudiante> estudiantes =  new LectorXML().cargarDatos("./files/estudiantes.xml");  //".\\files\\estudiantes.xml" tambien va
		for(Estudiante e : estudiantes) {
			System.out.println(e.toString());
		}
		 
		
		
		List<Estudiante> nuevosEstudiantes = new ArrayList<>(Arrays.asList(new Estudiante(1,"jm","sa","unknown",Genero.HOMBRE),
						new Estudiante(2,"gonzalo","sa","unknown",Genero.HOMBRE),
						new Estudiante(3,"alvaro","sa","unknown",Genero.HOMBRE),
						new Estudiante(4,"ivan","sa","unknown",Genero.HOMBRE)));
		;
		
		new EscritorXml().escribirDatos(nuevosEstudiantes, "./files/nuevo_fichero_estudiantes.xml");
	}

}
