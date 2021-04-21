package computer;

public abstract class Word implements Operand {
	
	protected Number value;
	
	public abstract boolean isEqual(Word word) throws ClassCastException;
	
	public abstract Word mul(Word word) throws ClassCastException;
	
	public abstract Word add(Word word) throws ClassCastException;
	
	public  Number getValue() {
		return this.value;
	}
	
	public String toString() {
		return this.getValue().toString();
	}
}
