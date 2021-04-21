package instruction;
import computer.*;

public abstract class ArithmeticInstruction implements Instruction {
	protected Operand operandA;
	protected Operand operandB;
	protected Adress adress;
	protected String instructionName;
	
	
	@Override
	public void execute(Memory memory, ProgramCounter pc) {
		Word wordA = operandA.getWord(memory);
		Word wordB = operandB.getWord(memory);
		Word result = operation(wordA, wordB);
		int index = adress.getIndex();
		memory.write(index, result);
		pc.increment();
	}
	protected abstract Word operation(Word wordA, Word wordB);
	
	public String toString() {
		return instructionName + " " + operandA.toString() + " " + operandB.toString() + " " + adress.toString();
	}
}
