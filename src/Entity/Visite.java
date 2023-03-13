package Entity;

import java.util.ArrayList;

public class Visite {
    private Adherent leAdherent;
    private ArrayList<PrestationVisite> lesPrestationsVisite;
    private String heure;

    public Visite(Adherent leAdherent, String heure) {
        this.leAdherent = leAdherent;
        this.heure = heure;
        this.lesPrestationsVisite = new ArrayList<>();
    }

    public String getHeure() {
        return heure;
    }

    public float montantAFacture(){
        float montant = 0;
        for (PrestationVisite prestationVisite: getLesPrestationsVisite()){
            montant += prestationVisite.getNombresActes() * prestationVisite.getLeTypePrestation().getPrixForfaitaire();
        }
        return montant;
    }


    public ArrayList<PrestationVisite> getLesPrestationsVisite() {
        return lesPrestationsVisite;
    }

    public void ajouterPrestationVisite(TypePrestation typePrestation, int nombresActes) {

        PrestationVisite prestationVisite = new PrestationVisite(typePrestation, nombresActes);
        lesPrestationsVisite.add(prestationVisite);
    }

    public Adherent getLeAdherent() {
        return leAdherent;
    }
}
