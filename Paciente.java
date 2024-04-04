public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String sintoma;
    private char codigodeEmergencia;

    public Paciente(String nombre, String sintoma, char codigoEmergencia) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.codigodeEmergencia = codigoEmergencia;
    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    
    /** 
     * @return String
     */
    public String getSintoma() {
        return sintoma;
    }

    
    /** 
     * @return char
     */
    public char getCodigoEmergencia() {
        return codigodeEmergencia;
    }

    
    /** 
     * @param otro
     * @return int
     */
    @Override
    public int compareTo(Paciente otro) {
        return Character.compare(this.codigodeEmergencia, otro.codigodeEmergencia);
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return nombre + ", " + sintoma + ", " + codigodeEmergencia;
    }
}

