/**
 * 
 */
package model;

/**
 * @author jeroe
 * @date 7 nov. 2017
 * @project Intelligente Cameras
 * @purpose
 */
public class Gestolen extends Voertuig {

	public Gestolen (IVoertuig voertuig) {
		super(voertuig.getLocatie());
		this.setNummerPlaat(voertuig.getNummerPlaat());
		this.setMerk(voertuig.getMerk());
		
	}

	@Override
	public boolean getGeseind() {
		return this.getNummerPlaat().isGeseind();
	}

	@Override
	public void setGeseind(boolean geseind) {
		this.getNummerPlaat().setGeseind(geseind);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString().concat(", en is geseind want Gestolen");
	}
	
	
}
