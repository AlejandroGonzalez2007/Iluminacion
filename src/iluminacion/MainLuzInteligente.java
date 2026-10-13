package iluminacion;

public class MainLuzInteligente {
    static void main() {
        LuzInteligente luz1= new LuzInteligente();
        LuzInteligente luz2= new LuzInteligente();

        luz1.setIdLuz("A001");
        luz1.setNivelBrillo(80);

        luz2.setIdLuz("A002");
        luz2.setNivelBrillo(67);

        luz1.Encender();
        luz1.AjustarBrillo(99);

        luz2.Apagar();

        System.out.println("===LUZ 1====");
        luz1.MostrarEstado();

        luz2.Encender();
        luz2.AjustarBrillo(30);

        luz1.Apagar();

        System.out.println("===LUZ 2====");
        luz2.MostrarEstado();

    }
}
