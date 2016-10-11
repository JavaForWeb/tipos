package bo.gob.asfi.tipos.app;

/**
 * Created by alesanchez on 10/10/2016.
 */
public enum ClasesEnum {
    CIENCIASNATURALES("1er Periodo"),
    MATEMATICAS("2do Periodo"),
    EDUCACIONFISICA("3er Periodo");

    private String periodo;

    ClasesEnum(String periodo) {
        this.periodo = periodo;
    }

    public String periodo() {
        return periodo;
    }

}
