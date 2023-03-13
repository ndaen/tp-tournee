package Entity;

import java.util.ArrayList;
import java.util.Date;

public class Tournee {

    private Date date;
    private ArrayList<Visite> lesVisites;
    private int kmRealise;
    private Inseminateur leInsiminateur;

    public Tournee(Date date, int kmRealise, Inseminateur leInsiminateur) {
        this.date = date;
        this.kmRealise = kmRealise;
        this.leInsiminateur = leInsiminateur;
    }

    public Date getDate() {
        return date;
    }

    public ArrayList<Visite> getLesVisites() {
        return lesVisites;
    }

    public int getKmRealise() {
        return kmRealise;
    }

    public Inseminateur getLeInsiminateur() {
        return leInsiminateur;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setKmRealise(int kmRealise) {
        this.kmRealise = kmRealise;
    }

    public void ajouterVisite(Visite visite){
        this.lesVisites.add(visite);
    }
}
