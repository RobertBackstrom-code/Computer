package program;
import java.util.ArrayList;
import instruction.Instruction;

public abstract class Program extends ArrayList<Instruction> {
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < this.size(); i++) {
			sb.append(i + " ");
			sb.append(this.get(i).toString() + "\n");
		}
		return sb.toString();
	}
}
