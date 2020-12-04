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
	
	public static int localizarVacio(int tam, String mContacto[][]) {
		
		for (int i = 0; i <= tam; i++ ) {
			if (mContacto[i][0].equals("_")) {
				
				return i;
				
			}	
		}
		return -1;
	}
	
	public static int modContacto(String parametro, String mContacto[][], boolean eliminar ) {
		// Esta funcion realiza Buscar, Editar y Eliminar.
		// Falla en algo no estoy seguro en que.
		for (int i = 0; i < mContacto.length; i++) {
			for (int j = 0; j < mContacto[i].length; j++) {
				
				if (mContacto[i][j].equals(parametro)) {
					
					if (eliminar = true) {
						
						mContacto[i][0]="_";
						mContacto[i][1]="_";
					}
					return i;
				}		
			}
		}
		return -1;
	}
	
	public static void mostrarLista(String mContacto[][]) {
		
		for (int i = 0; i < mContacto.length; i++) {
			for (int j = 0; j < mContacto[i].length; j++) {
				if (!mContacto[i][j].equals("_"))
				System.out.print(mContacto[i][j]);
					
			}
			System.out.println();
		}
			
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leer = new Scanner(System.in);
		
		int tam = 10, boton = 0, buscar = 0;
		
		boolean eliminar = false; 
		
		String parametro;
		
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
				
				buscar = localizarVacio(tam, mContacto);
				
				System.out.println("Introduce el nombre del contacto");
				mContacto[buscar][0] = leer.next();
				System.out.println("Introduce el telefono del contacto");
				mContacto[buscar][1] = leer.next();
				
				break;
				
			case 2:
				
				eliminar = true;
				
				System.out.println("Introduce el nombre o telefono de el contacto que quieres editar");
				parametro = leer.next();
				
				
				buscar = modContacto(parametro, mContacto, eliminar);
				
				System.out.println("Introduce el nuevo nombre del contacto");
				mContacto[buscar][0] = leer.next();
				System.out.println("Introduce el telefono del contacto");
				mContacto[buscar][1] = leer.next();
				
				
				
				break;
				
			case 3:
				
				eliminar = true;
				
				System.out.println("Introduce el nombre o telefono de el contacto que quieres eliminar");
				parametro = leer.next();
				
				
				buscar = modContacto(parametro, mContacto, eliminar);
				
				break;
				
			case 4:
				
				mostrarLista(mContacto);
				
				break;
				
			case 5:
				
				eliminar = false;
				
				System.out.println("Introduce el nombre o telefono de el contacto que estas buscando");
				parametro = leer.next();
				
				buscar = modContacto(parametro, mContacto, eliminar);
				
				System.out.println("Su nombre es " + mContacto[buscar][0]);
				System.out.println("Su telefono es " + mContacto[buscar][1]);
				break;
				
			default:
				boton = 0;
			break;
			
			}
			
		}
		while(boton != 0);
	}

}
