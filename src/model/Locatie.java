/**
 * 
 */
package model;

/**
 * @author jeroe
 * @date 6 nov. 2017
 * @project Intelligente Cameras
 * @purpose
 */
public class Locatie
{//triviale properties en methods van een Locatie
    // instance variables - 
    private String locatie;

    /**
     * Constructor for objects of class Locatie
     */
    public Locatie(String locatie)
    {
        // initialize instance variables
        setLocatie(locatie);
    }
    public void setLocatie(String locatie){
        this.locatie = locatie;
    }
    public String getLocatie(){
        return locatie;
    }

    public boolean equals(Locatie locatie){
    	return this.locatie.equals(locatie.getLocatie());
    }
    
    @Override
    public String toString(){
    	return getLocatie();
    }
}

