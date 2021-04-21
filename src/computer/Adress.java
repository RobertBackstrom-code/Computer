package computer;

public class Adress implements Operand {
	private int index;
	
	public Adress(int index) {
		this.index = index;
	}
	
	@Override
	public Word getWord(Memory memory) {
		return memory.read(index);
	}

	public int getIndex() {
		return index;
	}
	
	public String toString() {
		return "[" + index + "]";
	}

}
