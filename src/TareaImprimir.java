import java.util.Random;


public class TareaImprimir implements Runnable {

	private final int tiempoActividad;
	private final String nombretarea;
	private final static Random generador = new Random();
	
	public TareaImprimir(String n){
		nombretarea = n;
		tiempoActividad = generador.nextInt(5000);
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.printf("%s va estar inactivo durante %d milisegundos. \n",nombretarea,tiempoActividad);
			Thread.sleep(tiempoActividad);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.printf("%s %s \n",tiempoActividad,"termino en forma prematura, debido a la interrupcion");
		}
		System.out.println("Termino su actividad, "+nombretarea);
		
	}

}
