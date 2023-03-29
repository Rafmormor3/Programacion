package blocNotas.jacaranda.bloc;

public class BlocException extends Exception{

	public BlocException() {
		super();
	}

	public BlocException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BlocException(String message, Throwable cause) {
		super(message, cause);
	}

	public BlocException(String message) {
		super(message);
	}

	public BlocException(Throwable cause) {
		super(cause);
	}


}
