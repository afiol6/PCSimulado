import java.util.ArrayList;
import java.util.Scanner;

public class SistemaOperativo {

    //ATRIBUTOS

    private String nomSO,versionSO,arquitecturaSO;
    private boolean onlyCommandsSO;
    private double espacioReqSO,memRamReqSO, memRamAvaiable,diskSpaceAvaiable;
    private ArrayList InstalledPrograms;
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

    public void onSO(Ordenador o,Programas p){
        boolean SALIR=false;
        while (SALIR == false) {

            System.out.println(" THE OPERATIVE SYSTEM IS ON! " + '\n' +'\n'
                    + " CHOOSE AN OPTION " + '\n' +'\n'
                    + " OPTION 0 : SEE SYSTEM INFO " + '\n'
                    + " OPTION 1 : INSTALL A PROGRAM " + '\n'
                    + " OPTION 2 : SEE FREE RAM & SPACE AVAIABLE " + '\n'
                    + " OPTION 3 : UNINSTALL A PROGRAM " + '\n'
                    + " OPTION 4 : SEE INSTALLED PROGRAMS " + '\n'
                    + " OPTION 5 : TURN OFF THE COMPUTER ");
            opcionSO = sc.nextInt();
            switch (opcionSO) {
                case 0:
                    systemInfo(o);
                    break;
                case 1:
                    installProgram(p, o);
                    break;
                case 2:
                    memRamAvaiable(o);
                    break;
                case 4:
                    seePrograms();
                    break;
                case 5:
                    SALIR = true;
                    System.out.println(" TURNING OFF COMPUTER... ");

                    break;
            }
        }
    }
    private void seePrograms(){
        for (int i=0;i<this.InstalledPrograms.size();i++){
            System.out.println(InstalledPrograms.get(i));
        }
    }
    private void installProgram(Programas p,Ordenador o){
        diskSpaceAvaiable =o.getHddOrdenador() - p.getEspacioReqProgram();
        this.InstalledPrograms.add(p);
    }

    private void memRamAvaiable(Ordenador o){
        memRamAvaiable = (o.getMemRamOrdenador()-this.getMemRamReqSO());
        diskSpaceAvaiable = o.getHddOrdenador()-this.getEspacioReqSO();
        System.out.println(memRamAvaiable + " GB RAM FREE " + '\n' + diskSpaceAvaiable + " GB AVAIABLE SPACE");
    }

    private void systemInfo(Ordenador o){
        System.out.println(o.toString() + this);

    }

    @Override
    public String toString() {
        return " OPERATIVE SYSTEM : " + nomSO +
                '\n' + " OPERATIVE SYSTEM VERSION : "
                + versionSO + '\n';

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