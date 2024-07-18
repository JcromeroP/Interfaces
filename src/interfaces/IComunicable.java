package interfaces;

//Las interfaces no tienen constructores
//Las interfaces solo pueden tener atributos de final(constantes), publicas, staticas pero no pueden tener getter y setter al igual que una clase abstracta
//Las clases abstractas si tienen constructores
public interface IComunicable {

    //La clase que implemente esta interfaz estará obligada a usar este método
    void comunicarse();
}
