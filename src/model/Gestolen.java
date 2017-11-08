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
		super.setNummerPlaat(voertuig.getNummerPlaat());
		super.setMerk(voertuig.getMerk());
	}

	@Override
	public boolean getGeseind() {
		return super.getNummerPlaat().isGeseind();
	}

	@Override
	public void setGeseind(boolean geseind) {
		super.getNummerPlaat().setGeseind(geseind);
	}
}
