package computer;

/*public abstract class Word<E> implements Operand{
	protected E value;
	
	public abstract boolean isEqual(Word<E> word);
		
	public abstract Word<E> mul(Word<E> word);
	
	public abstract Word<E> add(Word<E> word);
	
	public E getValue() {
		return value;
	}
	
	public String toString() {
		return value.toString();
	} 
}*/

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
