package Test.GestionTournee;

import Entity.*;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class GestionTourneeTest {

    private Tournee tournee;
    private GestionTournee gestionTournee;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Inseminateur inseminateur = new Inseminateur("Jean", "Moule-Oude", "0661210243","j.moule", "azerty1234");
        this.tournee = new Tournee(new Date(), 50, inseminateur);

        Adherent adherent1 = new Adherent("aaa", "bbb", "0661210243", "-22.9812", "2.8857");
        Visite visite1 = new Visite(adherent1, "20:00");
        TypePrestation typePrestation1 = new TypePrestation(50, "Lavage");
        TypePrestation typePrestation2 = new TypePrestation(250, "Vaccin");
        visite1.ajouterPrestationVisite(typePrestation1, 2);
        visite1.ajouterPrestationVisite(typePrestation2, 1);

        Adherent adherent2 = new Adherent("aaa", "bbb", "0661210243", "-22.9812", "2.8857");
        Visite visite2 = new Visite(adherent1, "20:00");
        TypePrestation typePrestation3 = new TypePrestation(50, "Lavage");
        TypePrestation typePrestation4 = new TypePrestation(250, "Vaccin");
        visite2.ajouterPrestationVisite(typePrestation3, 2);
        visite2.ajouterPrestationVisite(typePrestation4, 1);

        this.tournee.ajouterVisite(visite1);
        this.tournee.ajouterVisite(visite2);

        this.gestionTournee = new GestionTournee(tournee);
    }

    @org.junit.jupiter.api.Test
    void CATourneeTypePrestation() {
        TypePrestation typePrestation = new TypePrestation(50, "Lavage");
        assertEquals(200, this.gestionTournee.CATourneeTypePrestation(typePrestation));
    }

    @org.junit.jupiter.api.Test
    void CATournee() {
        assertEquals(700, this.gestionTournee.CATournee());
    }
}