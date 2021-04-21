package instruction;

import computer.Adress;
import computer.Memory;
import computer.Operand;
import computer.ProgramCounter;

public class Print implements Instruction {
	
	private Operand op;
	
	public Print(Operand fac) {
		this.op = fac;
	}

	@Override
	public void execute(Memory memory, ProgramCounter pc) {
		System.out.println(op.getWord(memory).getValue());	
		pc.increment();
	}
	
	public String toString() {
		return "PRT " + op.toString();
	}
}
