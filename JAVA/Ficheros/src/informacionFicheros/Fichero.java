package informacionFicheros;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDate;

public class Fichero {
	
	private FileTime fechaCreacion;
	private long size;
	//private String usuario;
	private boolean permisoLectura;
	private boolean permisoEscritura;
	private boolean permisoEjecucion;
	private boolean esDirectorio;
	private boolean esFichero;
	private String nombre;
	private String ruta;
	private String listaFicheros;
	private String listaDirectorio;
	
	private File fichero;
	
	public Fichero(String path) throws Exception {
		super();
		
		this.fichero = new File(path);
		
		if(this.fichero.exists()) {
			
			this.size=this.fichero.length();
			this.permisoEjecucion=this.fichero.canExecute();
			this.permisoEscritura=this.fichero.canWrite();
			this.permisoLectura=this.fichero.canRead();
			this.esDirectorio=this.fichero.isDirectory();
			this.esFichero=this.fichero.isFile();
			this.nombre=this.fichero.getName();
			this.ruta=this.fichero.getPath();
			this.listaFicheros=listarFicheros(this.fichero);
			this.listaDirectorio=listarDirectorios(this.fichero);
			this.fechaCreacion=Files.readAttributes(this.fichero.toPath(), BasicFileAttributes.class).creationTime();
			
			
		}else {
			throw new Exception("No existe");
		}
		
	}
	
	private String listarFicheros(File fichero) {
		StringBuilder sb = new StringBuilder();
		if(fichero.isDirectory()) {
			for(File f : fichero.listFiles()) {
				if(f.isFile()) {
					sb.append(f.getName() + " ");
				}
			}
		}else {
			sb.append("No hay");
		}
		return sb.toString();
	}
	
	private String listarDirectorios(File fichero) {
		StringBuilder sb = new StringBuilder();
		if(fichero.isDirectory()) {
			for(File f : fichero.listFiles()) {
				if(f.isDirectory()) {
					sb.append(f.getName() + " ");
				}
			}
		}else {
			sb.append("No hay");
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		return String.format("El fichero con nombre %s que podemos encontrar en la ruta %s es creado el %s y tiene un tamanio de %s,"
				+ "\n¿Es fichero? %s, ¿Es directorio? %s, ¿Tiene permiso de escritura? %s, ¿Tiene permiso de ejecucion? %s, ¿Tiene permiso de lectura? %s,"
				+ "\nLista de Directorios: %s \nLista de Ficheros: %s",this.nombre, this.ruta, this.fechaCreacion, this.size,this.esFichero,this.esDirectorio,
				this.permisoEscritura, this.permisoEjecucion, this.permisoLectura, this.listaDirectorio, this.listaFicheros);
	}
	
	
	
	
	

}
