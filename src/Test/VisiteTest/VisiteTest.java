package Test.VisiteTest;

import Entity.Adherent;
import Entity.PrestationVisite;
import Entity.TypePrestation;
import Entity.Visite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class VisiteTest {

    private Visite visite1;
    private Adherent adherent1;
    @BeforeEach
    void setUp() {
        Adherent adherent1 = new Adherent("aaa", "bbb", "0661210243", "-22.9812", "2.8857");
        this.visite1 = new Visite(adherent1, "20:00");
        TypePrestation typePrestation1 = new TypePrestation(50, "Lavage");
        TypePrestation typePrestation2 = new TypePrestation(250, "Vaccin");
        this.visite1.ajouterPrestationVisite(typePrestation1, 2);
        this.visite1.ajouterPrestationVisite(typePrestation2, 1);
    }

    @Test
    void montantAFacture() {
        assertEquals(350,this.visite1.montantAFacture());
    }
}