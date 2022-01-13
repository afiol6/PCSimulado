import java.util.ArrayList;
import java.util.Scanner;

public class SistemaOperativo {

    //ATRIBUTOS

    private String nomSO,versionSO,arquitecturaSO;
    private boolean onlyCommandsSO;
    private double espacioReqSO,memRamReqSO;
    //private ArrayList Programas;
    private int opcionSO;

    Scanner sc = new Scanner(System.in);

    //CONSTRUCTORES

    public SistemaOperativo(String nomSO, String versionSO, String arquitecturaSO, boolean onlyCommandsSO, double espacioReqSO, double memRamReqSO) {
        this.nomSO = nomSO;
        this.versionSO = versionSO;
        this.arquitecturaSO = arquitecturaSO;
        this.onlyCommandsSO = onlyCommandsSO;
        this.espacioReqSO = espacioReqSO;
        this.memRamReqSO = memRamReqSO;
        //Programas = programas;
    }

    //METODOS

    public void onSO(Ordenador o){
        System.out.println(" THE OPERATIVE SYSTEM IS ON! " + '\n'
                + " CHOOSE AN OPTION " + '\n'
                + " OPTION 0 : SEE SYSTEM INFO " + '\n'
                + " OPTION 1 : INSTALL A PROGRAM " + '\n'
                + " OPTION 2 : SEE FREE RAM & SPACE AVAIABLE " + '\n'
                + " OPTION 3 : UNINSTALL A PROGRAM " + '\n'
                + " OPTION 4 : TURN OFF THE COMPUTER ");
        switch (opcionSO){
            case 0 :
                systemInfo(o);
            break;
        }
    }


    private void systemInfo(Ordenador o){
        System.out.println(o.toString());

    }
    //GETTERS Y SETTERS


    public String getNomSO() {
        return nomSO;
    }

    public void setNomSO(String nomSO) {
        this.nomSO = nomSO;
    }

    public String getVersionSO() {
        return versionSO;
    }

    public void setVersionSO(String versionSO) {
        this.versionSO = versionSO;
    }

    public String getArquitecturaSO() {
        return arquitecturaSO;
    }

    public void setArquitecturaSO(String arquitecturaSO) {
        this.arquitecturaSO = arquitecturaSO;
    }

    public boolean isOnlyCommandsSO() {
        return onlyCommandsSO;
    }

    public void setOnlyCommandsSO(boolean onlyCommandsSO) {
        this.onlyCommandsSO = onlyCommandsSO;
    }

    public double getEspacioReqSO() {
        return espacioReqSO;
    }

    public void setEspacioReqSO(double espacioReqSO) {
        this.espacioReqSO = espacioReqSO;
    }

    public double getMemRamReqSO() {
        return memRamReqSO;
    }

    public void setMemRamReqSO(double memRamReqSO) {
        this.memRamReqSO = memRamReqSO;
    }

}