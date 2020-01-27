package main.java.composite;

public abstract class DanceComponent {
	
	public void add(DanceComponent danceComponent) throws DanceOperationException {
		throw new DanceOperationException("Operation not allowed");
	}
	
	public void remove(DanceComponent danceComponent) throws DanceOperationException {
		throw new DanceOperationException("Operation not allowed");
	}

	public DanceComponent get(int position) throws DanceOperationException {
		throw new DanceOperationException("Operation not allowed");
	}
	
	public String getMoveName() throws DanceOperationException {
		throw new DanceOperationException("Operation not allowed");
	}
	
	public String getMoveDescription() throws DanceOperationException {
		throw new DanceOperationException("Operation not allowed");
	}
	
	public int getMoveLevel() throws DanceOperationException {
		throw new DanceOperationException("Operation not allowed");
	}
	
	public void printInfo() throws DanceOperationException {
		throw new DanceOperationException("Operation not allowed");
	}
}
