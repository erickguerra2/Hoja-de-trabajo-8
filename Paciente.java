public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String sintoma;
    private char codigodeEmergencia;

    public Paciente(String nombre, String sintoma, char codigoEmergencia) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.codigodeEmergencia = codigoEmergencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSintoma() {
        return sintoma;
    }

    public char getCodigoEmergencia() {
        return codigodeEmergencia;
    }

    @Override
    public int compareTo(Paciente otro) {
        return Character.compare(this.codigodeEmergencia, otro.codigodeEmergencia);
    }

    @Override
    public String toString() {
        return nombre + ", " + sintoma + ", " + codigodeEmergencia;
    }
}

