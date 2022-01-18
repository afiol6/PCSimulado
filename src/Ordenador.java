import java.util.Scanner;

public class Ordenador {
    //ATRIBUTOS

    private String nomOrdenador;
    private static double memRamOrdenador;
    private double hddOrdenador;
    private SistemaOperativo soOrdenador;

    private int opcionOrdenador;
    public boolean pcoff;

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
        opcionOrdenador = sc.nextInt();
        switch (opcionOrdenador){

            case 0 :
                pcoff=false;
                setSoOrdenador(soOrdenador);


            break;

            case 1 :
                System.out.println(" TURNING OFF PC... ");
                pcoff = true;
            break;


        }
    }


    @Override
    public String toString() {
        return " COMPUTER SPECS " + '\n' +'\n'
                + " COMPUTER NAME : " + nomOrdenador + '\n'
                + " RAM : " + memRamOrdenador +'\n'
                + " HDD : " + hddOrdenador + '\n';
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
