package Entity;

public class Adherent extends Personne{

    private String latitude;
    private String longitude;

    public Adherent(String nom, String prenom, String telPortable, String latitude, String longitude) {
        super(nom, prenom, telPortable);
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public String getCordGPS() {
        return latitude + ", " + longitude;
    }
}
