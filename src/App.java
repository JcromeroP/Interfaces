public class App {

    //Una clase puede extender de una sola clase abstracta pero puede implementar varias interfaces
    public static void main(String[] args) throws Exception {
        
        Delfin delfin = new Delfin("Adolfina");
        Pulpo pulpo = new Pulpo("Gonzales", 8);

        delfin.nadar();
        delfin.comunicarse();
        delfin.alimentar();

        pulpo.nadar();
        pulpo.comunicarse();
        pulpo.alimentar();
    }
}
