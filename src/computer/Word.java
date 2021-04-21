package computer;

public abstract class Word<E> implements Operand{
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
}
