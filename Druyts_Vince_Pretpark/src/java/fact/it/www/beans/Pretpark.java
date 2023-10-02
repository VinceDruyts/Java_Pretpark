/* Dit is een onderdeel van het project voor Applicatieontwikkeling in Java
 * Druyts Vince
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.beans;
import java.util.ArrayList;
/**
 *
 * @author Vince_Druyts
 */
public class Pretpark {
    private String naam;
    private int aantalBezoekers;
    private ArrayList<Attractie> attracties = new ArrayList<>();

    public Pretpark(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public ArrayList<Attractie> getAttracties() {
        return attracties;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    
    public int getAantalAttracties(){
        return attracties.size();
    }
    
    public void voegAttractieToe(Attractie attractie){
        attracties.add(attractie);
    }
    
    public Attractie zoekAttractieOpNaam(String naam){
        for(Attractie attractie: attracties){
            if(attractie.getNaam().equals(naam)){
                return attractie;
            }
        }
        return null;
    }
    
    public void registreerBezoeker(Bezoeker bezoeker){
        aantalBezoekers++;
        bezoeker.setPretparkcode(aantalBezoekers);
    }
}
