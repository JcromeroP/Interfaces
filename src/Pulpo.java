import interfaces.IAlimentable;
import interfaces.IComunicable;

//Se puede implementar más de 1 interfaz
public class Pulpo extends CriaturasMarinas implements IComunicable, IAlimentable{

    int cantTentaculos;

    public Pulpo(String nombre, int cantTentaculos){
        super(nombre);
        this.cantTentaculos = cantTentaculos;
    }

    @Override
    void nadar() {
        System.out.println(nombre + " está nadando con sus " + cantTentaculos + "tentánculos");            
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " saluda con sus " + cantTentaculos + "tentáculos");    
    }

    @Override
    public void alimentar() {
        System.out.println("Estamos alimentando con peces a " + nombre);
    }

    

}
