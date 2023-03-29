package blocNotas.jacaranda.notas;

import java.time.LocalDateTime;

import mock_POO.aplicacion.publicacion.Valorable;

public class NotaAlarma extends Nota implements Activable{

	private LocalDateTime fechaAlarma;
	private static final int MINUTOS_REPETIR_POR_DEFECTO=0;
	private int minutosRepetir;
	private boolean activado;
	
	public NotaAlarma(String texto, LocalDateTime fechaAlarma, boolean activado) {
		super(texto);
		this.fechaAlarma = fechaAlarma;
		this.activado = activado;
	}

	public NotaAlarma(String texto, LocalDateTime fechaAlarma, int minutosRepetir) {
		super(texto);
		this.fechaAlarma = fechaAlarma;
		this.minutosRepetir = minutosRepetir;
	}

	private void setFechaAlarma(LocalDateTime fechaAlarma) {
		this.fechaAlarma = fechaAlarma;
	}

	public static int getMinutosRepetirPorDefecto() {
		return MINUTOS_REPETIR_POR_DEFECTO;
	}

	@Override
	public void activar() {
		this.activado=true;
		
	}

	@Override
	public void desactivar() {
		this.activado=false;
	}

	public boolean isActivado() {
		return this.activado;
	}

	@Override
	public String toString() {
		return "NotaAlarma: " + "Nota:"+ super.toString()
				+ "\nfecha de la alarma: " + fechaAlarma + ", minutos para que se repita: " + minutosRepetir + ", activado: "
				+ activado;
	}
	
	
	
	
	

}
