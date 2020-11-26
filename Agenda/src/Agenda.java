import java.util.Scanner;


public class Agenda {
	
	public static void inicializarMatriz(String mContacto[][]) {
		
		for (int i = 0; i < mContacto.length; i++) {
			for (int j = 0; j < mContacto[i].length; j++) {
				
				mContacto[i][j] = "_";
					
			}
		}
	}
	
	public static void mostrarMenu() {
		
		
		System.out.println("    ____________________________________________       ");
		System.out.println("   |                                            |      ");
		System.out.println("   |          M.I.S  C.O.N.T.A.C.T.O.S          |      ");
		System.out.println("   |____________________________________________|      ");
		System.out.println("                                                       ");
		System.out.println("    ___________________      ___________________       ");
		System.out.println("   |    |              |    |    |              |      ");
		System.out.println("   | 1. |    AÑADIR    |    | 2. |    EDITAR    |      ");
		System.out.println("   |____|______________|    |____|______________|      ");
		System.out.println("                                                       ");
		System.out.println("    ___________________      ___________________       ");
		System.out.println("   |    |              |    |    |              |      ");
		System.out.println("   | 3. |   ELIMINAR   |    | 4. |    LISTA     |      ");
		System.out.println("   |____|______________|    |____|______________|      ");
		System.out.println("                                                       ");
		System.out.println("    ___________________      ___________________       ");
		System.out.println("   |    |              |    |    |              |      ");
		System.out.println("   | 5. |    BUSCAR    |    | 0. |    SALIR     |      ");
		System.out.println("   |____|______________|    |____|______________|      ");
		
	}
	
	public static int localizarVacio(int joker, int tam, String mContacto[][]) {
		
		for (int joker = 0; joker <= tam; joker++ ) {
			if (mContacto[joker][0].equalsIgnoreCase("_")) {
				
				return joker;
				
			}	
		}
	}
	
	public static int modContacto() {
		
		
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leer = new Scanner(System.in);
		
		int tam = 10, boton = 0, joker = 0;
		
		boolean eliminar = false; 
		
		String mContacto[][] = new String[tam][2]; 
		
		inicializarMatriz(mContacto);
		
		//Buscar Contacto
		
		//Salir del programa
		
		do {
			
			mostrarMenu();
			
			System.out.println("¿Qué desea hacer?");
			boton = leer.nextInt();
			
			
			
			
			
			
			
			switch (boton) {
			case 1:
				
				joker = localizarVacio(joker, tam, mContacto);
				
				System.out.println("Introduce el nombre del contacto");
				mContacto[joker][0] = leer.next();
				System.out.println("Introduce el telefono del contacto");
				mContacto[joker][1] = leer.next();
				
				break;
				
			case 2:
				
				eliminar = true;
				
				System.out.println("Introduce el nombre o telefono de el contacto que quieres editar");
				
				
				modContacto();
				
				System.out.println("Introduce el nuevo nombre del contacto");
				mContacto[joker][0] = leer.next();
				System.out.println("Introduce el telefono del contacto");
				mContacto[joker][1] = leer.next();
				
				
				
				break;
				
			case 3:
				
				
				
				
				
				break;
				
			case 4:
				
				
				
				
				
				
				break;
				
			case 5:
				
				
				
				
				
				break;
				
			default:
				boton = 0;
			break;
			
			
			
			}
			
			
			
			
		}
		while(boton != 0);
		
		
	}

}
