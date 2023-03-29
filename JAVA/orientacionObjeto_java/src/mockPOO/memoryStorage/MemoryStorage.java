package mockPOO.memoryStorage;

import java.util.Arrays;

import mockPOO.publicacion.Post;
import mockPOO.publicacion.Publicacion;
import mockPOO.publicacion.PublicacionException;
import mockPOO.publicacion.Recomendacion;
import mockPOO.publicacion.Tweet;
import mockPOO.usuario.Usuario;

public class MemoryStorage {
	
	private static final int NUM_MAXIMO_USUARIOS=2;
	private static final int NUM_MAXIMO_PUBLICACIONES=6;
	
	private int numUsuariosActuales;
	private int numPublicacionesActuales;
	
	Usuario[] usuarios;
	Publicacion[] publicaciones;
	
	public MemoryStorage() {
		super();
		usuarios=new Usuario[NUM_MAXIMO_USUARIOS];
		publicaciones=new Publicacion[NUM_MAXIMO_PUBLICACIONES];
	}
	
	private int posicionUsuario(String login) {
		int pos=-1;
		boolean res=false;
		for(int i=0; i<usuarios.length && res==false;i++) {
			if(usuarios[i]!=null && usuarios[i].getLogin().equals(login)) {
				pos=i;
				res=true;
			}
		}
		return pos;
	}
	
	public void addUsuario(String login, String pass) throws MemoryStorageException {
		if(login==null || pass==null || login.isEmpty() || pass.isEmpty()) {
			throw new MemoryStorageException("Usuario no creado");
		}
		usuarios[numUsuariosActuales%NUM_MAXIMO_USUARIOS]=new Usuario(login, pass);
		numUsuariosActuales++;
	}
	
	public void addPublicacion(String texto, String login) throws MemoryStorageException {
		if(texto==null || texto.isEmpty() || posicionUsuario(login)==-1) {
			throw new MemoryStorageException("Error añadir publicacion");
		}
		publicaciones[numPublicacionesActuales%NUM_MAXIMO_PUBLICACIONES]= new Tweet(texto,usuarios[posicionUsuario(login)]);
		numPublicacionesActuales++;
	}
	
	public void addPublicacion(String texto, String login, String tema) throws MemoryStorageException {
		if(texto==null || texto.isEmpty() || posicionUsuario(login)==-1) {
			throw new MemoryStorageException("Error añadir publicacion");
		}
		publicaciones[numPublicacionesActuales%NUM_MAXIMO_PUBLICACIONES]= new Post(texto,usuarios[posicionUsuario(login)],tema);
		numPublicacionesActuales++;
	}
	
	public void addPublicacion(String texto, String login, int numEstrellas) throws MemoryStorageException {
		if(texto==null || texto.isEmpty() || posicionUsuario(login)==-1) {
			throw new MemoryStorageException("Error añadir publicacion");
		}
		try {
			publicaciones[numPublicacionesActuales%NUM_MAXIMO_PUBLICACIONES]= new Recomendacion(texto,usuarios[posicionUsuario(login)], numEstrellas);
			numPublicacionesActuales++;
		} catch (PublicacionException e) {
			e.printStackTrace();
		}
	}
	
	public String mostrarListaPublicaciones() {
		return listar(publicaciones);
	}
	
	public String mostrarTweets() {
		Arrays.sort(publicaciones);
		
		int cont=0;
		for(Publicacion p : publicaciones) {
			if(p!=null && p instanceof Tweet) {
				cont++;
			}
		}
		int pos=0;
		Tweet[] lista = new Tweet[cont];
		for(Publicacion p : publicaciones) {
			if(p instanceof Tweet) {
				lista[pos]=(Tweet) p;
				pos++;
			}
		}
		return listar(lista);
	}

	public String mostrarPosts() {
		Arrays.sort(publicaciones);
		
		int cont=0;
		for(Publicacion p : publicaciones) {
			if(p!=null && p instanceof Post) {
				cont++;
			}
		}
		
		int pos=0;
		Post[] lista = new Post[cont];
		for(Publicacion p :publicaciones) {
			if(p instanceof Post) {
				lista[pos]=(Post)p;
				pos++;
			}
		}
		return listar(lista);
	}
	
	public String mostrarRecomendaciones() {
		Arrays.sort(publicaciones);
		
		int cont=0;
		for(Publicacion p : publicaciones) {
			if(p!=null && p instanceof Recomendacion) {
				cont++;
			}
		}
		
		int pos=0;
		Recomendacion[] lista = new Recomendacion[cont];
		for(Publicacion p :publicaciones) {
			if(p instanceof Recomendacion) {
				lista[pos]=(Recomendacion)p;
				pos++;
			}
		}
		return listar(lista);
	}

	private String listar (Publicacion[] publicaciones) {
		StringBuilder sb = new StringBuilder();
		
		for(Publicacion p : publicaciones) {
			sb.append(p).append("-----").append(System.lineSeparator());
		}
		
		return sb.toString();
	}
	


}
