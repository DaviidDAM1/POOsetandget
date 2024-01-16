package automovilgs;

public class automovil_mainsg {

	public static void main(String[] args) {
		automovil david = new automovil();
	david.setmarca(david.getmarca());
	david.settipo(david.gettipo());
	david.setpotencia(david.getpotencia());
	System.out.println("el automovil es de la marca " + david.getmarca());
	System.out.println("el automovil es del tipo " + david.gettipo());
	System.out.println("la potencia del automovil es " + david.getpotencia());
		
		
		
	}

}
