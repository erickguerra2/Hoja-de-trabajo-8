import org.junit.Test;
import static org.junit.Assert.*;

public class Pruebas {
    @Test
    public void testAddAndRemove() {
        VectorHeap<Paciente> heap = new VectorHeap<>();
        heap.add(new Paciente("Juan Perez", "fractura de pierna", 'C'));
        heap.add(new Paciente("Maria Ramirez", "apendicitis", 'A'));

        assertEquals("Maria Ramirez, apendicitis, A", heap.remove().toString());
        assertEquals("Juan Perez, fractura de pierna, C", heap.remove().toString());
    }
}
