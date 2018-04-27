import acm.graphics.*;
import acm.program.*;

public class example_2 extends GraphicsProgram {
	private static final long serialVersionUID = 1L;
		/*String X = readLine ("Ingrese: ");
		char A = X.charAt(0);
		char B = 'G';
		if (A == B) {
			println ("true");
		}
		else if (A != B) {
			println ("False");
		}*/
		//----------------------------------------------------------------------
		
		public void run () {
			add (new GLine (20,20,20,150)); // linea Verical larga
			add (new GLine (100,20,20,20)); // linea Horizontal
			add (new GLine (4,150,150,150)); // base
			add (new GLine (100,50,100,20)); // Linea Vertical pequeña
			/*add (new GOval (87.5,50,25,25)); // cabeza
			add (new GLine (100,75,100,100)); // cuerpo
			add (new GLine (100,100,85,125)); // (100 pendiente,100 inicio,75 pendiente,135 limite) pierna izquierda
			add (new GLine (100,100,115,125)); // pierna derecha 
			add (new GLine (80,80,100,87.5)); // brazo izquierdo
			add (new GLine (100,87.5,120,80)); // Brazo derecho */

	//-------------------------------------------------------------------------------------------
			int P1 = 20; // P = Parametro Gline de letras
			int P2 = 180;
			int P3 = 30;
			int fail = 1; // el vaor que toma si falla (va fuera del while)
			String test = readLine ("Ingrese el test: ");
			int length = test.length();
			while (length != 0) {
				add (new GLine (P1,P2,P3,P2)); // (20 inicio en x, 160 inicio en y, 40 limite en x, 160 limite en y)
				P1 = P1 + 15;
				P3 = P1 + 10;
				length = length - 1;
			}
	//-----------------------------------------------------------------------------------------------------------
		while (true) {
			String letter = readLine ("Ingrese una letra: ");
			int index = test.indexOf(letter);
			println (index);
			int P = 20; // parametro de Glabel
			for (int E = index; index >= 0; index = index - 1) {
				if (index == 0) {
					add (new GLabel (letter),P,175);
					index = index - 1;
				}
				P = P + 15;
			}
			if (index != -1) {
				int indexAdd = index ++;
				int index2 = test.indexOf(letter, indexAdd);
				if (index2 != -1) {
					for (int F = index2; index2 >= 0; index2 = index2 - 1) {
						if (index2 == 0) {
							add (new GLabel (letter),P,175);
							index2 = index2 - 1;
						}
						P = P + 15;
					}
				}
			}
			
			
			if (index == -1) {
				fail ++;
				switch (fail) {
				case 1: {
					add (new GLine (100,50,100,20)); // Linea Vertical pequeña
					break;
					}
				case 2: {
					add (new GOval (87.5,50,25,25)); // cabeza
					break;
					}
				case 3: {
					add (new GLine (100,75,100,100)); // cuerpo
					break;
					}
				case 4: {
					add (new GLine (100,100,85,125)); // (100 pendiente,100 inicio,75 pendiente,135 limite) pierna izquierda
					break;
					}
				case 5: {
					add (new GLine (100,100,115,125)); // pierna derecha */
					break;
					}
				case 6: {
					add (new GLine (80,80,100,87.5)); // brazo izquierdo
					break;
				}
				case 7: {
					add (new GLine (100,87.5,120,80)); // Brazo derecho
					break;
				}
				}
			}
		}
	}
}
	


