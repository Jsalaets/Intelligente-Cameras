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
	
	public Gestolen (IVoertuig voertuig) {
		super(voertuig);			
	}
	

	public void setGeseind(boolean geseind) {
		super.setGeseind(geseind);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + ", en is geseind want Gestolen";
	}	
}
