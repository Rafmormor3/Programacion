package euromillon;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

import euromillon.exceptions.CombinacionException;

public class Combinacion {
	
	protected static final int VALOR_MINIMO=1;
	protected static final int VALOR_MAXIMO_NUMEROS=50;
	protected static final int VALOR_MAXIMO_ESTRELLAS=12;
	protected static final int TOTAL_NUMEROS=5;
	protected static final int TOTAL_ESTRELLAS=2;
	
	private Set<Integer> numeros;
	private Set<Integer> estrellas;
	
	
	public Combinacion(int n1, int n2, int n3, int n4, int n5, int e1, int e2) throws CombinacionException {
		super();
		this.numeros = new HashSet<>();
		this.numeros.add(n1);this.numeros.add(n2);this.numeros.add(n3);this.numeros.add(n4);this.numeros.add(n5);
		this.estrellas= new HashSet<>();
		this.estrellas.add(e1);this.estrellas.add(e2);
		
		if(this.numeros.size()!=TOTAL_NUMEROS || this.estrellas.size()!=TOTAL_ESTRELLAS || valoresValidos(this.numeros)== false || valoresValidos(this.estrellas)==false) {
			throw new CombinacionException("Valores no validos");
		}
	}
	
	public Combinacion(int[]numeros, int[]estrellas) throws CombinacionException {
		this(numeros[0],numeros[1], numeros[2],numeros[3],numeros[4],estrellas[0],estrellas[1]);
	}
	
	public Set<Integer> getNumeros() {
		return numeros;
	}
	public Set<Integer> getEstrellas() {
		return estrellas;
	}
	
	
	public int comprobarCombinacion(Combinacion c) {
		Set<Integer> num1 = new HashSet<>(numeros);
		Set<Integer> est1 = new HashSet<>(estrellas);
		
		num1.retainAll(this.numeros);
		est1.retainAll(this.estrellas);
		
		return num1.size()+est1.size();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(estrellas, numeros);
	}
	@Override
	public boolean equals(Object obj) {
		return this == obj || obj!=null && obj instanceof Combinacion && obj.hashCode()==this.hashCode();
	}
	
	@Override
	public String toString() {
		return "Numeros: " + numeros + " --> Estrellas: " + estrellas;
	}
	
	
	//AUX
	private boolean valoresValidos(Set<Integer> numeros) {
		Iterator<Integer> it = numeros.iterator();
		boolean res=true;
		while(it.hasNext() && res==true) {
			Integer sig = it.next();
			if((numeros.size()==TOTAL_ESTRELLAS && !(sig>=VALOR_MINIMO && sig<=VALOR_MAXIMO_ESTRELLAS)) 
					|| (numeros.size()==TOTAL_NUMEROS && !(sig>=VALOR_MINIMO && sig<=VALOR_MAXIMO_NUMEROS))) {
				res=false;
			}
		}
		return res;
	}
	
}
