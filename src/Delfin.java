import interfaces.IAlimentable;
import interfaces.IComunicable;

public class Delfin extends CriaturasMarinas implements IComunicable, IAlimentable {

    public Delfin(String nombre) {
        super(nombre);
    }

    @Override
    void nadar() {
        System.out.println(nombre + " está nadando en velocidad con su cola y saltando sobre el agua");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " emite sonidos y chasquidos para comunicarse");
    }

    @Override
    public void alimentar() {
        System.out.println("Le dimos de comer una galleta a" + nombre);
    }

}
