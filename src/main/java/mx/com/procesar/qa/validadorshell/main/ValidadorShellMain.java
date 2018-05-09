/**
 * 
 */
package mx.com.procesar.qa.validadorshell.main;

import org.apache.log4j.Logger;

/**
 * @author Gloria Pacheco Santiago
 *
 */
public class ValidadorShellMain {

	private static final Logger LOGGER = Logger.getLogger(ValidadorShellMain.class);

	/**
	 * @param args
	 *            Recibe como parametro la URL del archivo a validar
	 */
	public static void main(String[] args) {
		String archivo = args[0];
		LOGGER.info("Comienza lectura de archio " + archivo);
	}

}
