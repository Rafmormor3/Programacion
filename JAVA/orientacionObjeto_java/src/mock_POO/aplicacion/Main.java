package mock_POO.aplicacion;

import mock_POO.aplicacion.memoryStorage.MemoryStorage;
import mock_POO.aplicacion.memoryStorage.MemoryStorageException;
import mock_POO.aplicacion.publicacion.Post;
import mock_POO.aplicacion.publicacion.Publicacion;
import mock_POO.aplicacion.publicacion.PublicacionException;
import mock_POO.aplicacion.publicacion.Recomendacion;
import mock_POO.aplicacion.publicacion.Tweet;

public class Main {

	public static void main(String[] args) {
		
		try {
			Publicacion tweet = new Tweet("Hola mundo", new Usuario("rmm", "123"));
			System.out.println(tweet);
		} catch (PublicacionException e) {
			e.printStackTrace();
		}
		
		try {
			Publicacion post = new Post("Hola mundo, post", new Usuario("rmm", "123"),"IT");
			System.out.println(post);
		} catch (PublicacionException e) {
			e.printStackTrace();
		}
		
		try {
			Publicacion recomendacion = new Recomendacion("Hola mundo, post Hola mundo, post Hola mundo, post Hola mundo, post "
					+ "Hola mundo, post Hola mundo, post Hola mundo, post", new Usuario("rmm", "123"),3);
			System.out.println(recomendacion);
		} catch (PublicacionException e) {
			e.printStackTrace();
		}
		
		
		MemoryStorage ms = new MemoryStorage();
	
		try {
			ms.addUsuario("rafa", "paco");
			ms.addUsuario("Paco", "rafa");
		} catch (MemoryStorageException e) {
			e.printStackTrace();
		}
		
		//Corregir y hacer main ( lo va a subir)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
