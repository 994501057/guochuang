package global.config;

public class ConfigConstants {
	/** DB GROUP KEY*/
	public static final String DBUSERGROPU = "dbUserGroup";
	/** COMMA */
	public static final String COMMA = ",";
	/** JDBC CONFIG KEY (driverClassName)*/
	public static final String JDBCDRIV = "jdbc.driverClassName.";
	/** JDBC CONFIG KEY (url)*/
	public static final String JDBCURL  = "jdbc.url.";
	/** JDBC CONFIG KEY (username)*/
	public static final String JDBCUSER = "jdbc.username.";
	/** JDBC CONFIG KEY (password)*/
	public static final String JDBCPASS = "jdbc.password.";
	/** JDBC DEFAULT USER ID*/
	public static final String JDBCDEFUSER = "posgresql";
	/** JDBC DEFAULT USER ID*/
	public static final String JDBCMYSQL = "mysql";
	/** POST */
	public static final String POST = "POST";
	
	/** COOKIE MAX AGE */
	public static final Integer COOKIEMAXAGE = new Integer(3600);
	/** MAX MUM SESSIONS */
	public static final int MAXIMUMSESSIONS = 100;
}
