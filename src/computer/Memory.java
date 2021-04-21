package computer;

public abstract class Memory {
	
	protected Word[] memory;
	
	public Word read(int index) {
		return memory[index];
	}
	
	public void write(int index, Word word) {
		memory[index] = word;
	}
	
}
