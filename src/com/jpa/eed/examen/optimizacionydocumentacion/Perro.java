package com.jpa.eed.examen.optimizacionydocumentacion;


/**
 * Esta clase simula el comportamiento de un perro.
 * @author javier
 *
 */


public class Perro extends Mascota {
  /**
   * Ladrido perro
   */
	private static final String GUAUUUUUUUUUU = "GUAUUUUUUUUUU";
	/**
	   * Parametro de la edad del perro
	   */
  private int age;
  /**
   * Crea un perro
   * @param String name
   * @param int age
   * @throws EdadErroneaException se lanza cuando la edad del perro es menor que 0.
   */
	public Perro(String name, int age) throws EdadErroneaException {
		super();
    setAge(age);
		this.name = name;
	}
	/**
	 * Asigna la edad del perro.
	 * @param int age
	 * @throws EdadErroneaException lanza cuando la edad es menor que 0.
	 */
	public void setAge(int age) throws EdadErroneaException {
		if (age < 0)
			throw new EdadErroneaException("La edad no puede ser negativa, o valor nulo.");
		this.age = age;
	}
	/**
	 * Método para obtener la edad del perro.
	 * @return this.age	 
	 */
	public int getAge() {
		return this.age;
	}
	/**
	 *  Método que hace ladrar al perro
     *   @return GUAUUUUUUUUUU
     */
	public String ladrar() {
		return GUAUUUUUUUUUU;
	}

}
