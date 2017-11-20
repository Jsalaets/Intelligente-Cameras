/**
 * 
 */
package model;

/**
 * @author jeroen salaets
 * @date 7 nov. 2017
 * @project Intelligente Cameras
 * @purpose
 */
public class NietVerzekerd extends VoertuigDecorator {
	
	
	public NietVerzekerd (IVoertuig voertuig) {
		super(voertuig);
	}
	
	
	public void setGeseind(boolean geseind) {
		super.setGeseind(geseind);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", en is geseind want niet Verzekerd";
	}
}
