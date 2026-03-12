package ro.ase.cts.lazy;

public class Hotel {
    private String denumireHotel;
    private int nrCamere;
    private int nrCamereInchiriate;
    private int nrAngajati;

    public void afisareInchiriereCamera() {
        if(nrCamereInchiriate == nrCamere){
            System.out.println("Nu avem camere libere");
        }
        else {
            System.out.println("Camera a fost inchiriata cu succes");
            nrCamereInchiriate++;
        }
    }

    public void afisareDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hotelul se numeste ");
        sb.append(denumireHotel);
        sb.append(" are ");
        sb.append(nrCamere);
        sb.append(" camere, dintre care ");
        sb.append(nrCamereInchiriate);
        sb.append(" au fost inchiriate si are ");
        sb.append(nrAngajati);
        sb.append(" angajati.");
        System.out.println(sb.toString());
    }

    private static Hotel instance = null;

    private Hotel(String denumireHotel, int numarCamere, int numarAngajati) {
        this.denumireHotel = denumireHotel;
        this.nrCamere = numarCamere;
        this.nrCamereInchiriate = 0;
        this.nrAngajati = numarAngajati;
    }

    public static synchronized Hotel getInstance(String denumire, int nrCamere, int nrAngajati){
        if(instance == null){
            instance = new Hotel(denumire,nrCamere,nrAngajati);
        }
        return instance;
    }
}
