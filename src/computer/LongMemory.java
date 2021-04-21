package computer;

public class LongMemory extends Memory<Long>{
	
	public LongMemory(int size) {
		memory =  new LongWord[size];
	}
}
