package instruction;

import computer.*;

public class Add extends ArithmeticInstruction {
	
	public Add(Operand operandA, Operand operandB, Adress adress) {
		this.operandA = operandA;
		this.operandB = operandB;
		this.adress = adress;
		this.instructionName = "ADD";
	}

	@Override
	protected Word operation(Word wordA, Word wordB) {
		Word result = wordA.add(wordB);
		return result;
	}
	
}
