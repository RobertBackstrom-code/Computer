package computer;

public class LongWord extends Word {

	public LongWord(long value) {
		this.value = value;
	}

	@Override
	public boolean isEqual(Word word) {
	LongWord other;
		
		if (word instanceof LongWord) {
			 other = (LongWord) word;			
		} else {
			throw new ClassCastException();
		}
		
		return this.value == other.value;
	}

	@Override
	public Word mul(Word word) {
	LongWord other;
		
		if (word instanceof LongWord) {
			 other = (LongWord) word;			
		} else {
			throw new ClassCastException();
		}
		
		Word result = new LongWord((long)this.value * (long)other.value);
		
		return result;
	}

	@Override
	public Word add(Word word) {
		LongWord other;
		
		if (word instanceof LongWord) {
			 other = (LongWord) word;			
		} else {
			throw new ClassCastException();
		}
		
		Word result = new LongWord((long)this.value + (long)other.value);
		return result;
	}

	
	@Override
	public Word getWord(Memory memory) {
		return this;
	}
	

}
