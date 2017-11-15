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
public class Gestolen extends VoertuigDecorator {
	
	private Voertuig gVoertuig;
	
	public Gestolen (IVoertuig voertuig) {
		this.gVoertuig = (Voertuig) voertuig;
		
		gVoertuig.getNummerPlaat();
		gVoertuig.getMerk();
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString().concat(", en is geseind want Gestolen");
	}
	
	
}
