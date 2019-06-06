package agenda;

public class contacto {
	//atributo
		String nombre;
		String numero;
		String email;
		
		public contacto(String _nombre, String _numero, String _email) {
			this.nombre=_nombre;
			this.numero=_numero;
			this.email=_email;
		}
		public contacto(String _nombre) {
			this.nombre=_nombre;
			this.numero="vacio";
			this.email="vacio";
		}
		public contacto(String _nombre, String _numero) {
			this.nombre=_nombre;
			this.numero=_numero;
			this.email= "vacio";
		}
		public String getNombre() {
			return this.nombre;
		}
		public void setnombre(String _nombre) {
			this.nombre = _nombre;
		}
		public String getNumero() {
			return this.numero;
		}
		public void setnumero(String _numero) {
			this.numero = _numero;
		}
		public String getEmail() {
			return this.email;
		}
		public void setemail(String _email) {
			this.email = _email;
		}
		
		public void DatosContacto() {
			System.out.println("Nombre: "+this.nombre);
			System.out.println("Numero: "+this.numero);
			System.out.println("Email: "+this.email);
		}
		public static float suma(float a,float b) {
			return a+b;
		}

}
