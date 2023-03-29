package mockPOO.memoryStorage;

public class MemoryStorageException extends Exception {

	public MemoryStorageException() {
	}

	public MemoryStorageException(String message) {
		super(message);
	}

	public MemoryStorageException(Throwable cause) {
		super(cause);
	}

	public MemoryStorageException(String message, Throwable cause) {
		super(message, cause);
	}

	public MemoryStorageException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
