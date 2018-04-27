import acm.program.*;

public class InchesToCentimeters extends ConsoleProgram {
	private static final long serialVersionUID = 1L;

	public void run () {
		println ("Ingresa un valor en pulgadas y un valor en pies, el programa te convertira");
		println ("los valores en centimetros y los sumara");
		double x = readDouble ("\nIngrese un numero en pulgadas: ");
		double y = readDouble ("Ingrese un numero en pies: ");
		double a = (x * 2.54);
		double b = (y * 30.58);
		println (x+" pies "+y+" pulgadas = \n"+(a+b)+" cm");
	}
}
