import acm.program.*;

public class Punto_2_parcialMurcia extends ConsoleProgram {
	private static final long serialVersionUID = 1L;
	
	public void run () {
		String test = readLine ("Enter a Binary string: ");
		int lengthTest = test.length();
		int parameter = 0;
		while (parameter != lengthTest) {
			char A = test.charAt(parameter);
			if (A!= '1' && A != '0') {
				println ("ERROR: invalid binary string "+test);
				break;
			}
			parameter ++;
		}
	}

}
