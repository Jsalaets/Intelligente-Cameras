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
public abstract class VoertuigDecorator implements IVoertuig{

	private IVoertuig voertuig;
	
	public VoertuigDecorator(IVoertuig ivoertuig) {
		this.voertuig = ivoertuig;
	}
	
	public void setGeseind(boolean geseind) {
		voertuig.setGeseind(geseind);
	}	
	
	public boolean getGeseind() {
		return voertuig.getGeseind();
	}
	
	public Locatie getLocatie() {
		return voertuig.getLocatie();
	}
	
	@Override
	public String toString() {
		return voertuig.toString();
	}
}
