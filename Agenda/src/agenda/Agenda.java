package agenda;



public class Agenda {
	contacto[] contactos;
	public Agenda(int tamaño) {
		this.contactos=new contacto[tamaño];
	}
	public void setcontactos(contacto c) {
		if (this.contactos==null) {
			this.contactos[0]=c;
		}
		else {
			int indice=busca_vacio_agenda();
			this.contactos[indice]=c;
		}
	}
	private int busca_vacio_agenda() {
		int indice=0;
		while(this.contactos[indice]!=null) {
			++indice;
		}
		return indice;
	}
	public void editar_contacto(String nombre, contacto c) {
		boolean contacto_libreta=false;
		for(int i=0;i<contactos.length&&!contacto_libreta;i++) {
			if(contactos[i].getNombre().equalsIgnoreCase(nombre)) {
				contactos[i]= c;
				System.out.print("contacto editado exitosamente");
				contacto_libreta=true;
			}	
	    }
		if(contacto_libreta==false) 
			System.out.print("contacto no existe en la libreta");
	
		
	}
	
	public void buscarcontacto(String nom) {
		boolean contactoencontrado=true;
		for(int i=0;i<contactos.length && contactoencontrado  ;i++) {
			if(contactos[i].getNombre().equalsIgnoreCase(nom)) {
				System.out.println("se encontro el contacto");
				System.out.println(contactos[i].getNombre() +" "+ contactos[i].getNumero()+" "+contactos[i].getEmail());
				contactoencontrado =false;
				
			}	
		}
		if(contactoencontrado==true) {
			System.out.print("contacto no registrado");
		}
		
	}
	public void eliminar_contactos(String nombre) {
		for(int i=0;i<contactos.length;i++) {
			if(contactos[i].getNombre().equalsIgnoreCase(nombre)) {
				contactos[i]=null;
				System.out.print("contacto eliminado");
				i=contactos.length;
			}	
	    }
	}
	
	

}



