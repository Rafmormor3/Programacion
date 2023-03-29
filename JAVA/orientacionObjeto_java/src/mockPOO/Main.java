package mockPOO;

import mockPOO.memoryStorage.MemoryStorage;
import mockPOO.memoryStorage.MemoryStorageException;


public class Main {

	public static void main(String[] args) {
	
		MemoryStorage m = new MemoryStorage();
		
		try {
			m.addUsuario("rafa", "1234");
			m.addUsuario("ANA", "ANA");
			
			m.addPublicacion("Hola mundo cruel", "rafa");
			m.addPublicacion("Bonita flor", "ANA");
			
			m.addPublicacion("QUe bonito que bonito que bonito que bonito que bonito", "ANA", 5);
			m.addPublicacion("No me gusta nada de nada No me gusta nada de nada No me gusta nada de nada", "rafa", 1);
			
			m.addPublicacion("Adios", "rafa", "Despedida");
			m.addPublicacion("Hola", "ANA", "Saludo");
			
			System.out.println(m.mostrarListaPublicaciones());
			System.out.println(m.mostrarTweets());
			System.out.println(m.mostrarRecomendaciones());
			System.out.println(m.mostrarPosts());
			
			
		} catch (MemoryStorageException e) {
			e.getMessage();
		}
		
		
		
	}

}
