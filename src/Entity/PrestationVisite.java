package Entity;

public class PrestationVisite {
    private TypePrestation leTypePrestation;
    private int nombresActes;

    public PrestationVisite(TypePrestation leTypePrestation, int nombresActes) {
        this.leTypePrestation = leTypePrestation;
        this.nombresActes = nombresActes;
    }

    public TypePrestation getLeTypePrestation() {
        return leTypePrestation;
    }

    public int getNombresActes() {
        return nombresActes;
    }
}
