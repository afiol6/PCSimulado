import java.util.ArrayList;
import java.util.Scanner;

public class SistemaOperativo {

    //ATRIBUTOS

    private String nomSO,versionSO,arquitecturaSO;
    private boolean onlyCommandsSO;
    private double espacioReqSO,memRamReqSO, memRamAvaiable,diskSpaceAvaiable;
    private ArrayList InstalledPrograms = new ArrayList();
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
    }

    //METODOS

    public void onSO(Programas p, Ordenador o,Programas p1,Programas p2,SistemaOperativo s){
        memRamAvaiable = (o.getMemRamOrdenador()-this.getMemRamReqSO());
        diskSpaceAvaiable = o.getHddOrdenador()-this.getEspacioReqSO();
        this.opcionSO = 0;
        boolean SALIR=false;
        while (SALIR == false)

        {

            System.out.println(" THE OPERATIVE SYSTEM IS ON! " + '\n' +'\n'
                    + " CHOOSE AN OPTION " + '\n' +'\n'
                    + " OPTION 0 : SEE SYSTEM INFO " + '\n'
                    + " OPTION 1 : INSTALL A PROGRAM " + '\n'
                    + " OPTION 2 : SEE FREE RAM & SPACE AVAIABLE " + '\n'
                    + " OPTION 3 : UNINSTALL A PROGRAM " + '\n'
                    + " OPTION 4 : SEE INSTALLED PROGRAMS " + '\n'
                    + " OPTION 5 : FORMAT PC " + '\n'
                    + " OPTION 6 : TURN OFF THE COMPUTER " + '\n');
            opcionSO = sc.nextInt();
            switch (opcionSO) {
                case 0:
                    systemInfo(o);
                    break;
                case 1:
                    selectProgramInstall(p,p1,p2);
                    break;
                case 2:
                    memRamAvaiable();
                    break;
                case 3:
                    SelectProgramUninstall(p,p1,p2);
                    break;
                case 4:
                    seePrograms();
                    break;
                case 5:
                    formatpc(s,o);
                    SALIR = true;
                    break;
                case 6:
                    SALIR = true;
                    System.out.println(" TURNING OFF COMPUTER... ");
                    break;
            }
        }
    }
    private void formatpc(SistemaOperativo s,Ordenador o){
        memRamAvaiable = memRamAvaiable + s.memRamReqSO;
        diskSpaceAvaiable = diskSpaceAvaiable + s.espacioReqSO;
        System.out.println(" FORMATING PC... ");
        o.ordenadorEncendido();

    }
    private void SelectProgramUninstall(Programas p,Programas p1,Programas p2){
        int opcionprograma;

        System.out.println("CHOOSE THE PROGRAM TO UNINSTALL : " + '\n'
                + p.getNomPrograma() + '\n'
                + p1.getNomPrograma() + '\n'
                + p2.getNomPrograma() + '\n');
        opcionprograma = sc.nextInt();
        switch (opcionprograma){
            case 1 :
                if (p.isInstalado() == true) {
                    this.InstalledPrograms.remove(p.getNomPrograma());
                    diskSpaceAvaiable = diskSpaceAvaiable + p.getEspacioReqProgram();
                    memRamAvaiable = memRamAvaiable + p.getMemRamReqPrograma();
                    System.out.println(" PROGRAM HAS BEEN UNINSTALLED SUCCESFULLY! " + '\n');
                }else System.out.println(" THE PROGRAM ISN'T INSTALLED");
                break;
            case 2 :
                if (p1.isInstalado() == true){
                    this.InstalledPrograms.remove(p1.getNomPrograma());
                    diskSpaceAvaiable = diskSpaceAvaiable + p1.getEspacioReqProgram();
                    memRamAvaiable = memRamAvaiable + p1.getMemRamReqPrograma();
                    System.out.println(" THE PROGRAM HAS BEEN UNINSTALLED SUCCESFULLY! " + '\n');
                } else System.out.println(" THE PROGRAM ISN'T INSTALLED");
                break;
            case 3 :
                if (p2.isInstalado() == true) {
                    this.InstalledPrograms.remove(p2.getNomPrograma());
                    diskSpaceAvaiable = diskSpaceAvaiable + p2.getEspacioReqProgram();
                    memRamAvaiable = memRamAvaiable + p2.getMemRamReqPrograma();
                    System.out.println(" THE PROGRAM HAS BEEN UNINSTALLED SUCCESFULLY! " + '\n');
                }else System.out.println(" THE PROGRAM ISN'T INSTALLED");
                break;
        }
    }
    private void seePrograms(){
        for (int i=0;i<this.InstalledPrograms.size();i++){
            System.out.println(this.InstalledPrograms.get(i));
            System.out.println(" ");

        }
    }

    private void memRamAvaiable(){

        System.out.println(memRamAvaiable + " GB RAM FREE " + '\n' + diskSpaceAvaiable + " GB AVAIABLE SPACE" +'\n');
    }

    private void systemInfo(Ordenador o){
        System.out.println(o.toString() + this);

    }
    private void selectProgramInstall(Programas p,Programas p1,Programas p2){
        int opcionprograma;

        System.out.println("CHOSE THE PROGRAM TO INSTALL :" + '\n'
                + " PROGRAM 1 : " + p.getNomPrograma() + '\n'
                + " PROGRAM 2 : " + p1.getNomPrograma() + '\n'
                + " PROGRAM 3 : " + p2.getNomPrograma() + '\n');
        opcionprograma = sc.nextInt();
        switch(opcionprograma){

            case 1 :
                p.setInstalado(true);
                this.InstalledPrograms.add(p.getNomPrograma());
                if (diskSpaceAvaiable > p.getEspacioReqProgram()) {
                    diskSpaceAvaiable = diskSpaceAvaiable - p.getEspacioReqProgram();
                    memRamAvaiable = memRamAvaiable - p.getMemRamReqPrograma();
                }else System.out.println(" NO SPACE TO INSTALL " + '\n');
                break;
            case 2 :
                p1.setInstalado(true);
                this.InstalledPrograms.add(p1.getNomPrograma());
                if (diskSpaceAvaiable > p1.getEspacioReqProgram()) {
                    diskSpaceAvaiable = diskSpaceAvaiable - p1.getEspacioReqProgram();
                    memRamAvaiable = memRamAvaiable - p1.getMemRamReqPrograma();
                }else System.out.println(" NO SPACE TO INSTALL " + '\n');
                break;
            case 3 :
                p2.setInstalado(true);
                this.InstalledPrograms.add(p2.getNomPrograma());
                if (diskSpaceAvaiable > p2.getEspacioReqProgram()) {
                    diskSpaceAvaiable = diskSpaceAvaiable - p2.getEspacioReqProgram();
                    memRamAvaiable = memRamAvaiable - p2.getMemRamReqPrograma();
                }else System.out.println(" NO SPACE TO INSTALL " + '\n');
        }
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