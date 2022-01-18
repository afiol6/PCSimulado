public class Ejecutable {
    public static void main(String[] args) {
        Inicializar();
    }

    private static void Inicializar() {
        Ordenador o1 = new Ordenador(" NEWPC", 8.0, 500.0);
        SistemaOperativo s1 = new SistemaOperativo(" WINDOWS 10 ", "1.0", " C-S", true, 15.0, 2.0);
        Programas p1 = new Programas("Google Chrome","2.0",1.0,0.8);
        o1.ordenadorEncendido();
        if (o1.pcoff == false) {
            s1.onSO(o1,p1);

        }
    }
}