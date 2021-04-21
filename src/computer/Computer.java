package computer;
import program.Program;

public class Computer {
	private Memory memory;
	private Program program;
	
	
	public Computer(Memory memory) {
		this.memory = memory;
	}
	
	public void load(Program program) {
		this.program = program;
	}
	
	public void run() {
		ProgramCounter pc = new ProgramCounter();
		while(pc.getCount() != -1) {
			program.get(pc.getCount()).execute(memory, pc);
		}
	}
}
