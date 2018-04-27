import acm.program.*;

public class Suma extends ConsoleProgram {
	private static final long serialVersionUID = 1L;

	public void run () {
		println ("Ingreses Dos Numeros El programa returnara La suma de los dos.");
		double x = readDouble ("Ingrese un Numero: ");
		double y = readDouble ("Ingrese un Numero: ");
		println (x+" + "+ y +" = ");
		println (x+y);
	}
}
