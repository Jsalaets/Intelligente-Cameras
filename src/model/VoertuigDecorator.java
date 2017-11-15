/**
 * 
 */
package model;

/**
 * @author jeroe
 * @date 13 nov. 2017
 * @project GitIntelligenteCameras
 * @purpose
 */
public class VoertuigDecorator implements IVoertuig{

	IVoertuig voertuig;
	
	public VoertuigDecorator() {
	}
	
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
	
}
