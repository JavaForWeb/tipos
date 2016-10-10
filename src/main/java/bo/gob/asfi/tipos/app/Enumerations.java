package bo.gob.asfi.tipos.app;

import bo.gob.asfi.tipos.utils.Common;

/**
 * Created by fernando on 10/10/16.
 */
public class Enumerations
{
	public void run(String args[])
	{
		Common.displayTitle("Enumerations");

		System.out.println("varios ejemplos de enum\n");

		System.out.println(" UsuarioEnum.ACTIVE: " + UsuarioEnum.ACTIVE);
		System.out.println(" UsuarioEnum.INACTIVE: " + UsuarioEnum.INACTIVE);
		System.out.println(" UsuarioEnum.DELETED: " + UsuarioEnum.DELETED);

		System.out.println("");
		System.out.println(" UsuarioTipoEnum.ESTUDIANTE: " + UsuarioTipoEnum.ESTUDIANTE);
		System.out.println(" UsuarioTipoEnum.ESTUDIANTE: " + UsuarioTipoEnum.ESTUDIANTE.rango());
		System.out.println(" UsuarioTipoEnum.UNIVERSITARIO: " + UsuarioTipoEnum.UNIVERSITARIO);
		System.out.println(" UsuarioTipoEnum.UNIVERSITARIO: " + UsuarioTipoEnum.UNIVERSITARIO.rango());

		System.out.println("");
		System.out.println(" lowerbound of UsuarioTipoEnum.ESTUDIANTE: " + UsuarioTipoEnum.ESTUDIANTE.getLowerBound() );

		System.out.println("");
		System.out.println(" años como UsuarioTipoEnum.ESTUDIANTE: " + UsuarioTipoEnum.ESTUDIANTE.getYearsAs(15) );

		System.out.println("");
		for (UsuarioTipoEnum tipo : UsuarioTipoEnum.values()) {
			System.out.printf("%-20s %4d\n", tipo, tipo.getLowerBound() );
		}

	}

	public static void main(String[] args)
	{

		new Enumerations().run(args);
	}
}
