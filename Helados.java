import acm.program.*;

public class Helados extends ConsoleProgram {
	private static final long serialVersionUID = 1L;

	public void run () {
		println ("Selecciona un sabor de helado, el programa te dira si hay disponibles");
		println ("1) Limon");
		println ("2) Vainilla");
		println ("3) Chocolate");
		int X = readInt ("Ingrese una opcion: ");
		switch (X) {
		case 1:{
			println ("Si hay helados disponibles de limon");
			break;
		}
		case 2:{
			println ("no hay helados disponibles de vainilla");
			break;
		}
		case 3: {
			println ("no hay helado disponible de chocolate");
			break;
		}
		default:{
			println ("no existe esta opcion");
			break;
		}
	}
}
}

