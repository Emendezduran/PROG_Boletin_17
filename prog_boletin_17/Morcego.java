package prog_boletin_17;

/**
 *
 * @author emendezduran
 */
public class Morcego extends Mamifero implements IPuedeVolar {

    @Override
    public void caminarCaminando() {
        System.out.println("Morcego Caminando");
    }

    @Override
    public void volarVolando() {
        System.out.println("Morcego Volando");
    }

}
