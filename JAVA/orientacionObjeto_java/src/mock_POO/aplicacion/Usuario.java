package mock_POO.aplicacion;

import java.util.Objects;

import mock.comida.Plato;

public class Usuario {
	
	private String login;
	private String pass;
	
	
	public Usuario(String login, String pass) {
		super();
		this.login = login;
		this.pass = pass;
	}


	public String getLogin() {
		return login;
	}
	
	public boolean setPass(String viejo, String nuevo) {
		boolean res=false;
		if(nuevo!=null && !nuevo.isEmpty() && this.pass.equals(viejo) && nuevo!=null && !nuevo.isEmpty()) {
			this.pass=nuevo;
			res=true;
		}
		return res;
	}
	
	public boolean checkPass(String pass) {
		boolean res=false;
		if(pass!=null && !pass.isEmpty() && pass.equals(this.pass)) {
			res=true;
		}
		return res;
	}

	public int hashCode() {
		return Objects.hash(login, pass);
	}

	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		if(!sonIguales && obj!=null && obj instanceof Usuario) {
			Usuario otroUser = (Usuario) obj;
			sonIguales=otroUser.login != null && this.login!=null && this.login.equals(otroUser.login);
		}
		return sonIguales;
	}
	
	
	
	
	
	
}
