
public class Logger {

	private Logger() {
		
	}

	private static Logger instancia = null;
	
	public static synchronized Logger getInstance() {
		if(instancia == null)
			instancia = new Logger();
		return instancia;
	}
		
	public void registrarLog(String dados) {
		System.out.println("Vou registrar o log: " + dados);
	}
}
