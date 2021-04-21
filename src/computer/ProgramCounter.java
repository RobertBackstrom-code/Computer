package computer;

public class ProgramCounter {
	private int pc;
	
	public ProgramCounter() {
		this.pc = 0;
	}
	
	public int getCount() {
		return pc;
	}
	
	public void setCount(int count) {
		this.pc = count;
	}
	
	public void increment() {
		this.pc++;
	}
}
