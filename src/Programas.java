public class Programas {

    //ATRIBUTOS

    private String nomPrograma,versPrograma;
    private double espacioReqProgram,memRamReqPrograma;
    private boolean instalado;

    //CONSTRUCTORES

    public Programas(String nomPrograma, String versPrograma, double espacioReqProgram, double memRamReqPrograma,boolean instalado) {
        this.nomPrograma = nomPrograma;
        this.versPrograma = versPrograma;
        this.espacioReqProgram = espacioReqProgram;
        this.memRamReqPrograma = memRamReqPrograma;
        this.instalado = instalado;
    }
    //METODOS
    private void startProgram(){
        System.out.println(" EL PROGRAMA HA INICIADO. ");
    }

    //GETTERS Y SETTERS


    public String getNomPrograma() {
        return nomPrograma;
    }

    public void setNomPrograma(String nomPrograma) {
        this.nomPrograma = nomPrograma;
    }

    public String getVersPrograma() {
        return versPrograma;
    }

    public void setVersPrograma(String versPrograma) {
        this.versPrograma = versPrograma;
    }

    public double getEspacioReqProgram() {
        return espacioReqProgram;
    }

    public void setEspacioReqProgram(double espacioReqProgram) {
        this.espacioReqProgram = espacioReqProgram;
    }

    public double getMemRamReqPrograma() {
        return memRamReqPrograma;
    }

    public void setMemRamReqPrograma(double memRamReqPrograma) {
        this.memRamReqPrograma = memRamReqPrograma;
    }

    public boolean isInstalado() {
        return instalado;
    }

    public void setInstalado(boolean instalado) {
        this.instalado = instalado;
    }
}