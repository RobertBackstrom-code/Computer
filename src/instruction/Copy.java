package instruction;

import computer.*;

public class Copy implements Instruction {
	private Operand op;
	private Adress adress;
	
	public Copy(Operand op, Adress adress) {
		this.op = op;
		this.adress = adress;
	}
	@Override
	public void execute(Memory memory, ProgramCounter pc) {
		Word word = op.getWord(memory);
		memory.write(adress.getIndex(), word);
		pc.increment();
	}
	
	public String toString() {
		return "CPY " + op.toString() + " " + adress.toString();
	}
}
