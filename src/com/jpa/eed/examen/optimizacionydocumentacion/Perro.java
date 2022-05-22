package com.jpa.eed.examen.optimizacionydocumentacion;

public class Perro extends Mascota {
	private static final String GUAUUUUUUUUUU = "GUAUUUUUUUUUU";
  private int age;
	public Perro(String name, int age) throws EdadErroneaException {
		super();
    setAge(age);
		this.name = name;
	}

	public void setAge(int age) throws EdadErroneaException {
		if (age < 0)
			throw new EdadErroneaException("La edad no puede ser negativa, o valor nulo.");
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public String ladrar() {
		return GUAUUUUUUUUUU;
	}

}
