/**
 * 
 */
package model;

import java.util.LinkedList;

/**
 * @author jeroe
 * @date 6 nov. 2017
 * @project Intelligente Cameras
 * @purpose
 */
public class Dispatch extends Actor {

	private LinkedList<Camera> cameras;
	private LinkedList<IVoertuig> geseind;
	
	public Dispatch(Locatie locatie) {
		super(locatie);
	}
	/**
	 * @return the cameras
	 */
	public LinkedList<Camera> getCameras() {
		return cameras;
	}
	/**
	 * @param cameras the cameras to set
	 */
	public void setCameras(LinkedList<Camera> cameras) {
		this.cameras = cameras;
	}
	/**
	 * @return the geseind
	 */
	public LinkedList<IVoertuig> getGeseind() {
		return geseind;
	}
	/**
	 * @param geseind the geseind to set
	 */
	public void setGeseind(LinkedList<IVoertuig> geseind) {
		this.geseind = geseind;
	}
	public void signaleer(IVoertuig voertuig) {
		// TODO Auto-generated method stub
		
	}
	public void registerObserver(Patrouille patrouille) {
		// TODO Auto-generated method stub
		
	}
	public Object getGesignaleerd() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
