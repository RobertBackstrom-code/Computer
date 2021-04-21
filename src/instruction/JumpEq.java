package instruction;

import computer.*;

public class JumpEq implements Instruction {
	private int pcJumpTo;
	private Operand operandA, operandB;
	
	public JumpEq(int pcJumpTo, Operand operandA, Operand operandB) {
		this.pcJumpTo = pcJumpTo;
		this.operandA = operandA;
		this.operandB = operandB;
	}
	@Override
	public void execute(Memory memory, ProgramCounter pc) {
		if(operandA.getWord(memory).isEqual(operandB.getWord(memory))) {
			pc.setCount(pcJumpTo);
		} else {
			pc.increment();
		}
	}
	
	public String toString() {
		return "JEQ " + pcJumpTo + " " + operandA.toString() + " " + operandB.toString();
	}
}
