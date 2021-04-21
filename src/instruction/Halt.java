package instruction;

import computer.Memory;
import computer.ProgramCounter;

public class Halt implements Instruction {
	
	@Override
	public void execute(Memory memory, ProgramCounter pc) {
			pc.setCount(-1);
	}
	public String toString() {
		return "HLT";
	}
}
