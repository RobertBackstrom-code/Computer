package instruction;

import computer.Adress;
import computer.Operand;
import computer.Word;

public class Mul extends ArithmeticInstruction {
	
	public Mul(Operand operandA, Operand operandB, Adress adress) {
		this.operandA = operandA;
		this.operandB = operandB;
		this.adress = adress;
		this.instructionName = "Mul";
	}

	@Override
	protected Word operation(Word wordA, Word wordB) {
		Word result = wordA.mul(wordB);
		return result;
	}
	
}
