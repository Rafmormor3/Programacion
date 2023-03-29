package mockPOO.usuario;

import java.util.Objects;

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

	public boolean setPass(String pass, String nuevoPass) {
		boolean res=false;
		if(pass!=null && !pass.isEmpty() && this.pass.equals(pass)) {
			this.pass=nuevoPass;
			res=true;
		}
		return res;
	}
	
	public boolean checkPass(String pass) {
		return pass!=null && !pass.isEmpty() && this.pass.equals(pass)? true : false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(login, pass);
	}

	public boolean equals(Object obj) {
		boolean iguales= this==obj;
		
		if(!iguales && obj!=null && obj instanceof Usuario) {
			Usuario otro = (Usuario) obj;
			iguales= this.login!=null && !this.login.isEmpty() && otro.login!=null 
					&& !otro.login.isEmpty() && this.login.equals(otro.login);
		}
		return iguales;
	}
	
	
	
	
	
	
	
}
