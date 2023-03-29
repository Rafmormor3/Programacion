package mock_POO.aplicacion.memoryStorage;

import java.util.Arrays;

import mock_POO.aplicacion.Usuario;
import mock_POO.aplicacion.publicacion.Post;
import mock_POO.aplicacion.publicacion.Publicacion;
import mock_POO.aplicacion.publicacion.PublicacionException;
import mock_POO.aplicacion.publicacion.Recomendacion;
import mock_POO.aplicacion.publicacion.Tweet;

public class MemoryStorage {
	
	private static final int NUM_MAXIMO_USUARIOS=15;
	private static final int NUM_MAXIMO_PUBLICACIONES=50;
	
	private int numUsuariosActuales;
	private int numPublicacionesActuales;
	
	int contUsuario;
	int contPublicacion;
	
	Usuario[] usuarios = new Usuario[NUM_MAXIMO_USUARIOS];
	Publicacion[] publicaciones = new Publicacion[NUM_MAXIMO_PUBLICACIONES];
	
	
	public MemoryStorage() {
		super();
		usuarios = new Usuario[NUM_MAXIMO_USUARIOS];
		publicaciones = new Publicacion[NUM_MAXIMO_PUBLICACIONES];
	}
	
	private int posicionUsuario(String login) {
		int res=-1;
		for(int i=0; i<usuarios.length && res==-1;i++) {
			if(this.usuarios[i]!=null && this.usuarios[i].getLogin().equals(login)) {
				res=i;
			}
		}
		return res;
	}
	
	public void addUsuario(String login, String pass) throws MemoryStorageException {
		if(posicionUsuario(login)!=-1) {
			throw new MemoryStorageException();
		}
		usuarios[numUsuariosActuales]=new Usuario(login, pass);
		numUsuariosActuales++;
	}
	
	public void addPublicacion(String texto, String login) {
		try {
			int pos=posicionUsuario(login);
			if(pos!=-1) {
				this.publicaciones[numPublicacionesActuales%NUM_MAXIMO_PUBLICACIONES]=new Tweet(texto,this.usuarios[posicionUsuario(login)]);
				numPublicacionesActuales++;
			}
			
		} catch (PublicacionException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void addPublicacion(String texto, String login, String tema) {
		try {
			int pos=posicionUsuario(login);
			if(pos!=-1) {
				this.publicaciones[numPublicacionesActuales%NUM_MAXIMO_PUBLICACIONES]=new Post(texto,this.usuarios[posicionUsuario(login)], tema);
				numPublicacionesActuales++;
			}
			
		} catch (PublicacionException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void addPublicacion(String texto,String login, int numeroEstrellas) {
		try {
			int pos=posicionUsuario(login);
			if(pos!=-1) {
				this.publicaciones[numPublicacionesActuales%NUM_MAXIMO_PUBLICACIONES]=new Recomendacion(texto,this.usuarios[posicionUsuario(login)], numeroEstrellas);
				numPublicacionesActuales++;
			}
			
		} catch (PublicacionException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String mostrarListaPublicaciones() {
		Arrays.sort(this.publicaciones);
		return listar(publicaciones);
	}
	
	public String mostrarTweets() {
		Arrays.sort(this.publicaciones);
		
		int cont=0;
		for(Publicacion p:publicaciones) {
			if(p instanceof Tweet) {
				cont++;
			}
		}
		
		Tweet[] tweets = new Tweet[cont];
		int pos =0;
		for(Publicacion p : publicaciones) {
			tweets[pos++]=(Tweet) p;
		}
		
		return listar(tweets);
	}
	
	public String mostrarPost() {
		Arrays.sort(this.publicaciones);
		
		int cont=0;
		for(Publicacion p:publicaciones) {
			if(p instanceof Post) {
				cont++;
			}
		}
		
		Post[] posts = new Post[cont];
		int pos =0;
		for(Publicacion p : publicaciones) {
			posts[pos++]=(Post) p;
		}
		
		return listar(posts);
	}
	
	public String mostrarRecomendacion() {
		Arrays.sort(this.publicaciones);
		
		int cont=0;
		for(Publicacion p:publicaciones) {
			if(p instanceof Recomendacion) {
				cont++;
			}
		}
		
		Recomendacion[] recomendaciones = new Recomendacion[cont];
		int pos =0;
		for(Publicacion p : publicaciones) {
			recomendaciones[pos++]=(Recomendacion) p;
		}
		
		return listar(recomendaciones);
	}
	
	
	private String listar (Publicacion[] publicaciones) {
		StringBuilder sb = new StringBuilder();
		
		for(Publicacion p : publicaciones) {
			sb.append(p).append("-----").append(System.lineSeparator());
		}
		
		return sb.toString();
	}
	
	
	
	
	

}
