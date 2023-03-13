package Entity;

import java.util.ArrayList;

public class GestionTournee {
    private Tournee laTournee;

    public GestionTournee(Tournee laTournee) {
        this.laTournee = laTournee;
    }

    public void ajouterVisite(Visite viste){
        this.laTournee.ajouterVisite(viste);
    }

    public ArrayList<Adherent> getAdherents(){
        ArrayList<Adherent> adherents = new ArrayList<>();
        for (Visite visite: this.laTournee.getLesVisites()) {
            adherents.add(visite.getLeAdherent());
        }
        return adherents;
    }

    public float CATourneeTypePrestation(TypePrestation typePrestation){
        float CAPrestation = 0;
        for (Visite visite: laTournee.getLesVisites()){
            for (PrestationVisite prestationVisite: visite.getLesPrestationsVisite()) {
                if (prestationVisite.getLeTypePrestation().getLibelle().compareTo(typePrestation.getLibelle()) == 0){
                    CAPrestation = visite.montantAFacture();
                }
            }
        }
        return 0;
    }

    public float CATournee(){
        float CA = 0;
        for (Visite visite: laTournee.getLesVisites()){
            CA += visite.montantAFacture();
        }
        return CA;
    }
}
