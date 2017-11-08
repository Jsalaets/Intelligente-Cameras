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
public class Voertuig extends Actor implements IVoertuig{

	private NummerPlaat nummerPlaat;
	private String merk;
	private static int count = 0;
	
	public Voertuig(Locatie locatie) {

		super(locatie);
		setCounter(++count);
	}

	/**
	 * @return the nummerPlaat
	 */
	public NummerPlaat getNummerPlaat() {
		return nummerPlaat;
	}

	/**
	 * @param nummerPlaat the nummerPlaat to set
	 */
	public void setNummerPlaat(NummerPlaat nummerPlaat) {
		this.nummerPlaat = nummerPlaat;
	}

	/**
	 * @return the merk
	 */
	public String getMerk() {
		return merk;
	}

	/**
	 * @param merk the merk to set
	 */
	public void setMerk(String merk) {
		this.merk = merk;
	}

	/**
	 * @return the geseind
	 */
	public boolean getGeseind() {
		return this.getNummerPlaat().isGeseind();
	}

	/**
	 * @param geseind the geseind to set
	 */
	public void setGeseind(boolean geseind) {
		this.getNummerPlaat().setGeseind(geseind);
	}
	@Override
	public Locatie getLocatie() {
		return super.getLocatie();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString().concat(" met nummerplaat " + getNummerPlaat().toString() + ", en is van het merk " + getMerk());
		
	}
	
	
}
