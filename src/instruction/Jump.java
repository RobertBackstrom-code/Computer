package instruction;

import computer.Memory;
import computer.ProgramCounter;

public class Jump implements Instruction {
	private int pcJumpTo;

	public Jump(int pcJumpTo) {
		this.pcJumpTo = pcJumpTo;
	}

	@Override
	public void execute(Memory memory, ProgramCounter pc) {
			pc.setCount(pcJumpTo);
	}
	
	public String toString() {
		return "JMP " + pcJumpTo;
	}
}
