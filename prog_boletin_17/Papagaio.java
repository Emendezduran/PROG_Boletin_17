package prog_boletin_17;

/**
 *
 * @author emendezduran
 */
public class Papagaio extends Aves implements IPuedeVolar{

    @Override
    public void caminarCaminando() {
        System.out.println("Papagaio Caminando");
    }

    @Override
    public void volarVolando() {
        System.out.println("Papagaio Volando");
    }
    
}
