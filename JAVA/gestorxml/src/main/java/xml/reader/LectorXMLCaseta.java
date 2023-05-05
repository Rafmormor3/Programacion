package main.java.xml.reader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import main.java.model.Casetas.Caseta;
import main.java.model.Casetas.Clase;
import main.java.model.Estudiante.Estudiante;
import main.java.model.Estudiante.Genero;

public class LectorXMLCaseta {

	public List<Caseta> cargarDatos(String ruta){
		List<Caseta> casetas = new ArrayList<>();
		
		File fichero = new File(ruta);
		
		try {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document documento = builder.parse(fichero);
			documento.getDocumentElement().normalize();
			
			System.out.println(documento.getDocumentElement().getNodeName());
			
			NodeList hijos =  documento.getElementsByTagName("DatosLeidos");
			
			for(int i=0; i< hijos.getLength();i++) {
				Element hijo = (Element)hijos.item(i);
				
				String titulo = hijo.getElementsByTagName("TITULO").item(0)==null? "No titulo" : hijo.getElementsByTagName("TITULO").item(0).getTextContent();
				String calle = hijo.getElementsByTagName("CALLE").item(0)==null? "No calle" : hijo.getElementsByTagName("CALLE").item(0).getTextContent();
				int numero = hijo.getElementsByTagName("NUMERO").item(0)==null? 0: Integer.valueOf(hijo.getElementsByTagName("NUMERO").item(0).getTextContent());
				int modulos = hijo.getElementsByTagName("MODULOS").item(0)==null? 0: Integer.valueOf(hijo.getElementsByTagName("MODULOS").item(0).getTextContent());
				Clase clase = hijo.getElementsByTagName("CLASE").item(0)==null? Clase.valueOf("No tiene") : Clase.valueOf(hijo.getElementsByTagName("CLASE").item(0).getTextContent());
				String entidad = hijo.getElementsByTagName("ENTIDAD").item(0)==null? "No entidad" : hijo.getElementsByTagName("ENTIDAD").item(0).getTextContent();
				int id = hijo.getElementsByTagName("ID").item(0)==null? 0: Integer.valueOf(hijo.getElementsByTagName("ID").item(0).getTextContent());
				int idCalle = hijo.getElementsByTagName("ID_CALLE").item(0)==null? 0: Integer.valueOf(hijo.getElementsByTagName("ID_CALLE").item(0).getTextContent());
				
				casetas.add(new Caseta(titulo, calle, numero, modulos, clase, entidad, id, idCalle));
			}
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		return casetas;
	}
	
}
