package computer;

public class LongWord extends Word<Long> {
	
	
	public LongWord(long value) {
		this.value = value;
	}

	@Override
	public Word<Long> getWord(Memory memory) {
		return this;
	}

	@Override
	public Word<Long> mul(Word<Long> word) {
		return new LongWord(this.value * word.value);
	}

	@Override
	public Word<Long> add(Word<Long> word) {
		return new LongWord(this.value + word.value);
	}

	@Override
	public boolean isEqual(Word<Long> word) {
		
		return this.value == word.value;
	}

}
