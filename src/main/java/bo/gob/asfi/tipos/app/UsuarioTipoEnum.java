package bo.gob.asfi.tipos.app;

/**
 * Created by fernando on 10/10/16.
 */
public enum UsuarioTipoEnum
{
    PARVULARIO("3 a 5"),
	ESTUDIANTE ("6 a 17"),
	UNIVERSITARIO("17 a 25");

	 private String rango;

	 UsuarioTipoEnum(String rango) {
		 this.rango = rango;
	 }

	 public String rango() {
		 return rango;
	 }


	int getLowerBound() {
		switch (this) {
			case PARVULARIO:
				return 3;
			case ESTUDIANTE:
				return 6;
			case UNIVERSITARIO:
				return 17;
			default:
				throw new AssertionError("Unknown  " + this);
		}
	}

	int getYearsAs(int n) {
		switch (this) {
			case PARVULARIO:
				return n - 3;
			case ESTUDIANTE:
				return n - 6;
			case UNIVERSITARIO:
				return n - 17;
			default:
				throw new AssertionError("Unknown  " + this);
		}
	}
}
