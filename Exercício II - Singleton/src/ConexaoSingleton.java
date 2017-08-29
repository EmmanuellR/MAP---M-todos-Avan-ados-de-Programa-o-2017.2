import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoSingleton {
	private static ConexaoSingleton umaIntancia;
	/* Metodo construtor da classe (ConexaoSingleton) é colocado como privado, pois 
	 * não pode permitir que tenha acesso a esse metodo para criar a
	 * classe quantas vezes quiser.
	 */
	private ConexaoSingleton () {    
	}
	
    public static Connection con = null;
    /* Criou o metodo statico, que ele ativa o metodo construtor,
	 * que irá retornar a propria classe.
	 * Se ja estiver preenchida, ele retorna a mesma instancia.
	 * Assim não corre risco de duplicar, caso já esteja instanciada.
	 */
    public static ConexaoSingleton Conectar() throws ClassNotFoundException {
		if (umaIntancia == null){
			System.out.println("Conectando ao banco...");
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1/banco","usuario","senha");
	            System.out.println("Conectado.");
	        } catch(SQLException e) {
	              System.out.println(e);
	              throw new RuntimeException(e);
	          }
			}
		return umaIntancia;
        
    }

	public static ConexaoSingleton getUmaIntancia() {
		return umaIntancia;
	}

	public static void setUmaIntancia(ConexaoSingleton umaIntancia) {
		ConexaoSingleton.umaIntancia = umaIntancia;
	}

}
