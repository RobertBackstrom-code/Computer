package computer;

public abstract class Memory<E> {
	
	protected Word<E>[] memory;
	
	public Word<E> read(int index) {
		return memory[index];
	}
	
	public void write(int index, Word<E> word) {
		memory[index] = word;
	}
	
}
