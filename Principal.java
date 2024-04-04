/** 
 * Erick Guerra 23208
 * gue23208@uvg.edu.gt
 * Hoja-de-trabajo-8
 * Lenguaje: Java
 *  Un sistema de colas con prioridad para atender pacientes en la emergencia de un hospital.
 */
import java.util.PriorityQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
    private PriorityQueue<Paciente> colaPacientes;

    public Principal() {
        colaPacientes = new PriorityQueue<>();
    }

    
    /** 
     * @param archivo
     */
    public void cargarPacientes(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(", ");
                if (datos.length == 3) {
                    colaPacientes.offer(new Paciente(datos[0], datos[1], datos[2].charAt(0)));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void atenderPacientes() {
        while (!colaPacientes.isEmpty()) {
            Paciente paciente = colaPacientes.poll();
            System.out.println("atendiendo a: " + paciente);
        }
    }

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Principal hospital = new Principal();
        hospital.cargarPacientes("pacientes.txt");
        hospital.atenderPacientes();
    }
}
