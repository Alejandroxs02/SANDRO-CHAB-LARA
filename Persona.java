public class Persona{
	String nombre;
	int matricula;

	public Persona(String nombre, int matricula){
	this.nombre = nombre;
	this.matricula = matricula;
	}

	public void imprimir(){
	System.out.println("nombre: " + nombre + +""+"matricula:" + matricula);
	}
}
