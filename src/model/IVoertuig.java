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
public interface IVoertuig {
	public NummerPlaat getNummerPlaat();
	public void setNummerPlaat(NummerPlaat nummerPlaat);
	public String getMerk();
	public void setMerk(String merk);
	public boolean getGeseind();
	public void setGeseind (boolean geseind);
	Locatie getLocatie();
}
