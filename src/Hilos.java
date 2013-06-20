
public class Hilos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread hilo1 = new Thread(new TareaImprimir("tarea 1"));
		Thread hilo2 = new Thread(new TareaImprimir("tarea 2"));
		Thread hilo3 = new Thread(new TareaImprimir("tarea 3"));
		
		System.out.println("Subprocesos creados, iniciando tareas...");
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
		System.out.println("Tareas iniciadas, termina principal...");
	}

}
