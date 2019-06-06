package agenda;

import java.util.Scanner;



public class principal {
	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		
		Agenda libreta= new Agenda(10);
		contacto mi_contacto;
		
		String nombre, telefono, email,newnombre,newtelefono,newemail;
		boolean band= true;
		int opcion;
		
		while(band==true) {
			System.out.println("[1]Añadir contacto");
			System.out.println("[2]Editar contacto");
			System.out.println("[3]Buscar contacto");
			System.out.println("[4]Eliminar contacto");
			System.out.println("[5]Listar contacto");
			System.out.println("[6]Finalizar programa");
			
			System.out.print(">elegir opcion: ");
			opcion=reader.nextInt();
			switch(opcion) {
			case 1:
				System.out.print("ingresar nombre contacto: ");
				nombre=reader.next();
				System.out.print("ingresar telefono contacto: ");
				telefono=reader.next();
				System.out.print("ingresar Email contacto: ");
				email=reader.next();
				
				mi_contacto= new contacto(nombre,telefono,email);
				libreta.setcontactos(mi_contacto);
				break;
			case 2 :
				System.out.print("ingresar nombre contacto actual: ");
				nombre=reader.next();
				System.out.print("ingresar nombre contacto nuevo: ");
				newnombre=reader.next();
				System.out.print("ingresar telefono contacto nuevo: ");
				newtelefono=reader.next();
				System.out.print("ingresar Email contacto nuevo: ");
				newemail=reader.next();
				mi_contacto= new contacto(newnombre,newtelefono,newemail);
				libreta.editar_contacto(nombre,mi_contacto);
				break;
			case 3 :
				System.out.print("ingresar nombre contacto: ");
				nombre=reader.next();
				libreta.buscarcontacto(nombre);
				break;
			case 4 :
				System.out.print("ingresar nombre contacto: ");
				nombre=reader.next();
				libreta.eliminar_contactos(nombre);
				break;
			case 5 : 
				
				
				break;
			case 6 : 
				band=false;
				
				break;
				
			}
			
			
			
		}

	}

}
