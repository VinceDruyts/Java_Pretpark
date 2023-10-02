/* Dit is een onderdeel van het project voor Applicatieontwikkeling in Java
 * Druyts Vince
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.beans;

/**
 *
 * @author Vince_Druyts
 */
public class Persoon {
    private String voornaam;
    private String familienaam;

    public Persoon() {
    }

    public Persoon(String voornaam, String familienaam) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public void setFamilienaam(String familienaam) {
        this.familienaam = familienaam;
    }
    
    public String toString(){
        return familienaam.toUpperCase() + " " + voornaam.toLowerCase();
    }
}
