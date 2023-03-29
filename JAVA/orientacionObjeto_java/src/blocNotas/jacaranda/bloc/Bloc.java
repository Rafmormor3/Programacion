package blocNotas.jacaranda.bloc;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

import blocNotas.jacaranda.bloc.Comparator.OrdenarBloc;
import blocNotas.jacaranda.notas.Nota;
import blocNotas.jacaranda.notas.NotaAlarma;
import blocNotas.jacaranda.notas.NotaAlarmaException;

public class Bloc{

	private static final int NUMERO_NOTAS_MAXIMA=5;
	private int numNotas;
	private String nombre;
	
	Nota[] notas;
	
	public Bloc(String nombre) throws NotaAlarmaException {
		super();
		if(nombre==null || nombre.isEmpty()) {
			throw new NotaAlarmaException("Nombre incorrecto");
		}
		this.nombre = nombre;
		notas = new Nota[NUMERO_NOTAS_MAXIMA];
	}
	
	public void addNota(Nota nota) {
		boolean res=false;
		for(Nota n : notas) {
			if(n!=null && n.getCodigo()==nota.getCodigo()) {
				res=true;
			}
		}
		
		if(res==false && numNotas<NUMERO_NOTAS_MAXIMA) {
			notas[this.numNotas]=nota;
			this.numNotas++;
		}
	}
	
	public String getNota(int codigo) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<notas.length;i++) {
			if(notas[i].getCodigo()==codigo) {
				sb.append(notas[i].toString());
			}
		}
		return sb.toString();
	}
	
	public void updateNota(int codigo, String nuevoTexto) {
		boolean esta=false;
		for(int i=0; i<notas.length && esta==false; i++) {
			if(notas[i].getCodigo()==codigo) {
				notas[i].setTexto(nuevoTexto);
				esta=true;
			}
		}
		
	}

	public void activa(int codigo) {
		boolean activa=false;
		for(int i=0; i<notas.length && activa==false; i++) {
			if(notas[i].getCodigo()==codigo) {
				Nota n =new NotaAlarma(notas[i].getTexto(), LocalDateTime.now(), true);
				activa=true;
			}
		}
	}

	public void desactiva(int codigo) {
		boolean activa=false;
		for(int i=0; i<notas.length && activa==false; i++) {
			if(notas[i].getCodigo()==codigo) {
				Nota n =new NotaAlarma(notas[i].getTexto(), LocalDateTime.now(), false);
				activa=true;
			}
		}	
	}
	
	public static int getNumeroNotasMaxima() {
		return NUMERO_NOTAS_MAXIMA;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName()).append("\n").append(this.nombre).append("\n");
		for(Nota n : notas) {
			sb.append(n).append("\n");
		}
		return sb.toString();
	}
	

	public int hashCode() {
		return Objects.hash(nombre, numNotas);
	}

	public boolean equals(Object obj) {
		boolean iguales = this==obj;
		
		if(!iguales && obj!=null && obj instanceof Bloc) {
			Bloc otroBloc = (Bloc) obj;
			iguales=this.nombre!=null && !this.nombre.isEmpty() && otroBloc.nombre!=null 
					&& !otroBloc.nombre.isEmpty() && this.nombre.equals(otroBloc.nombre);
		}
		
		return iguales;
	}

	public String ordenarBloc() {
		Arrays.sort(this.notas, new OrdenarBloc());
		return Arrays.toString(this.notas);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
