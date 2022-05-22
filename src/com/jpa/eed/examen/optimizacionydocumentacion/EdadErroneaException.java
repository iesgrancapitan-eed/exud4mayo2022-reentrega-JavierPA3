
package com.jpa.eed.examen.optimizacionydocumentacion;

/**
 * 
 * Esta clase lanza una excepcion si la edad es error.
 * @author javie
 *
 */
public class EdadErroneaException extends Exception {
  /**
   * Se crea edaderroneaException con un mensaje(message)
   *   @param String message
   */
	public EdadErroneaException(String message) {
		super(message);
	}
}
