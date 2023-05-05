package main.java.xml.writer;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import main.java.model.Estudiante.Estudiante;

public class EscritorXml {

	
	public void escribirDatos(List<Estudiante> estudiantes, String rutaFichero) {
		try {
			//1
			Document documento =  DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			
			//2
			Element nodoRaiz = documento.createElement("estudiantes");
			documento.appendChild(nodoRaiz);
			
			for(Estudiante e : estudiantes) {
				
				Element nodoHijo= documento.createElement("estudiante");
				nodoRaiz.appendChild(nodoHijo);
				
				Element nombre = documento.createElement("nombre");
				nombre.appendChild(documento.createTextNode(e.getNombre()));
				nodoHijo.appendChild(nombre);
				
				Attr identificador = documento.createAttribute("identificador");
				identificador.setNodeValue(String.valueOf(e.getId()));
				nodoHijo.setAttributeNode(identificador);
				
				
				Element apellido = documento.createElement("apellido");
				apellido.appendChild(documento.createTextNode(e.getApellidos()));
				nodoHijo.appendChild(apellido);
				
				Element fechaNac = documento.createElement("Fecha_Nacimiento");
				fechaNac.appendChild(documento.createTextNode(e.getFechaNacimiento()));
				nodoHijo.appendChild(fechaNac);
				
				Element genero = documento.createElement("Genero");
				genero.appendChild(documento.createTextNode(e.getGenero().toString()));
				nodoHijo.appendChild(genero);
				
				
			}
			
			//3 volcar en fichero
			
			Transformer optimus = TransformerFactory.newInstance().newTransformer();
			
			DOMSource source = new DOMSource(documento);
			StreamResult result = new StreamResult(new File(rutaFichero));
			optimus.setOutputProperty(OutputKeys.INDENT, "yes");
			
			optimus.transform(source, result);
			
			
		} catch (ParserConfigurationException | 
					TransformerException | 
					TransformerFactoryConfigurationError e) {
			e.printStackTrace();
		}
	}
	
}
