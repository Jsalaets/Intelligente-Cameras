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
public class NietVerzekerd extends VoertuigDecorator {
	
	private Voertuig nVoertuig;
	
	public NietVerzekerd (IVoertuig voertuig) {
		this.nVoertuig = (Voertuig) voertuig;
		
		nVoertuig.getNummerPlaat();
		nVoertuig.getMerk();
		
	}
	

	@Override
	public String toString() {
		return super.toString().concat(", en is geseind want niet Verzekerd");
	}
}
