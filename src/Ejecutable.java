public class Ejecutable {
    public static void main(String[] args) {
        Inicializar();
    }

    private static void Inicializar() {
        Ordenador o1 = new Ordenador(" NEWPC",8.0,500.0);
        SistemaOperativo s1 = new SistemaOperativo(" WINDOWS 10 ","1.0"," C-S",true,15.0,2.0);
        o1.ordenadorEncendido();
        s1.onSO(o1);
    }

}
