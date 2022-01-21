public class Ejecutable {
    public static void main(String[] args) {
        Inicializar();
    }

    private static void Inicializar() {
        Ordenador o1 = new Ordenador(" NEWPC", 8.0, 500.0);
        SistemaOperativo s1 = new SistemaOperativo(" WINDOWS 10 ", "1.0", " C-S", true, 50.0, 2.0);
        Programas p1 = new Programas("Valorant","2.0",10.0,1.0,false);
        Programas p2  = new Programas("Minecraft","5.0",5.0,0.5,false);
        Programas p3 = new Programas("Battlefield","3.0",40.0,0.3,false);
        o1.ordenadorEncendido();
        if (o1.isPcoff() == false) {
            s1.onSO(p1,o1,p2,p3,s1);
        }
    }
}