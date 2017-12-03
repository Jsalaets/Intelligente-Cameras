/**
 * 
 */
package model;

/**
 * @author jeroen salaets
 * @date 6 nov. 2017
 * @project Intelligente Cameras
 * @purpose NummerPlaat class
 */
public class NummerPlaat
{//triviale properties en methods van een Nummerplaat
    // instance variables 
    private boolean geseind;
    private String nummerPlaat;

    /**
     * Constructor for objects of class NummerPlaat
     */
    public NummerPlaat(String nummerPlaat)
    {
        // initialize instance variables
        this.nummerPlaat = nummerPlaat;
        this.geseind = false;
    }
	
    public void setGeseind(boolean geseind){
	    this.geseind = geseind;
	   }
    public boolean isGeseind(){
    		//enkel geseinde voertuigen/nummerplaten worden weerhouden door geïnteresseerden
    		//Er kunnen verschillende redenen zijn waarom een voertuig geseind staat
    		return geseind;
    	}
    @Override
    public String toString(){
    	return getNummerPlaat();
    }
	public String getNummerPlaat() {
		return nummerPlaat;
	}
	public void setNummerPlaat(String nummerPlaat) {
		this.nummerPlaat = nummerPlaat;
	}
}
