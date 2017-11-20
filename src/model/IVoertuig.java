/**
 * 
 */
package model;

/**
 * @author jeroen salaets
 * @date 6 nov. 2017
 * @project Intelligente Cameras
 * @purpose
 */
public interface IVoertuig {
	
	public void setGeseind(boolean geseind);
	public boolean getGeseind();
	public Locatie getLocatie();
	
}
