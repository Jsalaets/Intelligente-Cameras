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
public class NietVerzekerd extends Voertuig {
	
	public NietVerzekerd(IVoertuig voertuig) {
		super(voertuig.getLocatie());
		this.setNummerPlaat(voertuig.getNummerPlaat());
		this.setMerk(voertuig.getMerk());
	}
	
	@Override
	public boolean getGeseind() {
		return super.getNummerPlaat().isGeseind();
	}

	@Override
	public void setGeseind(boolean geseind) {
		super.getNummerPlaat().setGeseind(geseind);
	}
	@Override
	public String toString() {
		return super.toString().concat(", en is geseind want niet Verzekerd");
	}
}
