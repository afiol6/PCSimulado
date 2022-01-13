import java.util.Scanner;

public class Ordenador {
    //ATRIBUTOS

    private String nomOrdenador;
    private double memRamOrdenador;
    private double hddOrdenador;
    private SistemaOperativo soOrdenador;

    private int opcionOrdenador;

    Scanner sc = new Scanner(System.in);

    //CONSTRUCTORES


    public Ordenador(String nomOrdenador, double memRamOrdenador, double hddOrdenador) {
        this.nomOrdenador = nomOrdenador;
        this.memRamOrdenador = memRamOrdenador;
        this.hddOrdenador = hddOrdenador;

    }
    //METODOS

    public void ordenadorEncendido(){
        System.out.println(" Choose the option you want " + '\n' + '\n'
                + " OPTION 0 : INSTALL OS " +'\n'+  '\n' + " OPTION 1 : POWER OFF ");
        sc.nextInt();
        switch (opcionOrdenador){
            case 0 : setSoOrdenador(soOrdenador);
            break;
            case 1: System.out.println(" TURNING OFF... ");
            break;

        }
    }

    @Override
    public String toString() {
        return " COMPUTER " + '\n'
                + " COMPUTER NAME : " + nomOrdenador + '\n'
                + " RAM : " + memRamOrdenador
                + " HDD : " + hddOrdenador
                + " OPERATIVE SYSTEM : " + soOrdenador;
    }

    //GETTERS Y SETTERS

    public String getNomOrdenador() {
        return nomOrdenador;
    }

    public void setNomOrdenador(String nomOrdenador) {
        this.nomOrdenador = nomOrdenador;
    }

    public double getMemRamOrdenador() {
        return memRamOrdenador;
    }

    public void setMemRamOrdenador(double memRamOrdenador) {
        this.memRamOrdenador = memRamOrdenador;
    }

    public double getHddOrdenador() {
        return hddOrdenador;
    }

    public void setHddOrdenador(double hddOrdenador) {
        this.hddOrdenador = hddOrdenador;
    }

    public SistemaOperativo getSoOrdenador() {
        return soOrdenador;
    }

    public void setSoOrdenador(SistemaOperativo soOrdenador) {
        this.soOrdenador = soOrdenador;
    }
}
