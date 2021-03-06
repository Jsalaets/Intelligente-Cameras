/**
 * 
 */
package view;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Factory.ActorFactory;

import generator.Randomizer;
import model.Camera;
import model.Dispatch;
import model.IVoertuig;
import model.Patrouille;

/**
 * @author jeroen salaets
 * @date 6 nov. 2017
 * @project Intelligente Cameras
 * @purpose view class to run program
 */

public class TestIntelligenteCameras {
	public static LinkedList<IVoertuig> voertuigen;
	public static LinkedList<Camera> cameras;
	public static LinkedList<Patrouille> patrouilles;
	public static LinkedList<IVoertuig> gedetecteerd;
	public static LinkedList<IVoertuig> geseind;
	public static Dispatch dispatch;
	
	public static Logger LOGGER = LogManager.getLogger(TestIntelligenteCameras.class.getName());

	public static void main(String[] args) {
		// basic data initialisatie
		voertuigen = Randomizer.getVoertuigen();
		cameras = Randomizer.getCameras();
		patrouilles = Randomizer.getPatrouilles();
		gedetecteerd = new LinkedList<IVoertuig>();
		geseind = new LinkedList<IVoertuig>();
		dispatch = (Dispatch) ActorFactory.createActor(ActorFactory.DISPATCH,Randomizer.getLocatie());

		configureerData();
		printBasicData();
		simuleerAchtervolging();
	}

	/**
	 * 	 achtervolging simuleren
	 */
	private static void simuleerAchtervolging() {
		LOGGER.info(System.lineSeparator() + System.lineSeparator() + "De achtervolging wordt ingezet: ");
		registreerPatrouilles(patrouilles);
		detecteerVoertuigen(cameras, voertuigen);
		LOGGER.info(System.lineSeparator() + System.lineSeparator() + "De volgende Voertuigen werden achtervolgd: {}", dispatch.getGesignaleerd());
	}

	/**
	 * 	configureren van basic data
	 */
	private static void configureerData() {
		dispatch.setCameras(cameras);
		for (int i = 0; i < 10; i++) {
			geseind.add(Randomizer.seinGestolenVoertuig(voertuigen));
			geseind.add(Randomizer.seinNietVerzekerdVoertuig(voertuigen));
		}
		dispatch.setGeseind(geseind);
	}

	/**
	 * 	Afprinten gegevens
	 */
	private static void printBasicData() {
		LOGGER.info(System.lineSeparator() + System.lineSeparator() + "De volgende Dispatch werd gegenereerd: {}", dispatch);
		LOGGER.info(System.lineSeparator() + System.lineSeparator() + "De volgende Voertuigen werden gegenereerd: {}",	voertuigen);
		LOGGER.info(System.lineSeparator() + System.lineSeparator() + "De volgende Patrouilles werden gegenereerd: {}", patrouilles);
		LOGGER.info(System.lineSeparator() + System.lineSeparator() + "De volgende Cameras werden gegenereerd: {}", dispatch.getCameras());
		LOGGER.info(System.lineSeparator() + System.lineSeparator() + "De volgende Voertuigen werden geseind: {}", dispatch.getGeseind());
	}

	/**
	 * Welke voertuigen werden door een camera opgemerkt
	 * @param cameras
	 * @param voertuigen
	 */
	private static void detecteerVoertuigen(LinkedList<Camera> cameras,	LinkedList<IVoertuig> voertuigen) {
		ListIterator<IVoertuig> listVoertuigen = voertuigen.listIterator();
		ListIterator<Camera> listCameras = cameras.listIterator();
		IVoertuig voertuig;
		Camera camera;
		while (listCameras.hasNext()) {
			camera = listCameras.next();
			while (listVoertuigen.hasNext()) {
				voertuig = listVoertuigen.next();
				if (camera.getLocatie().equals(voertuig.getLocatie())) {
					gedetecteerd.add(voertuig);
					if (voertuig.getGeseind()) {
						dispatch.signaleer(voertuig);
					}
				}
			}
			
		}
		if (!dispatch.getGesignaleerd().isEmpty()) {
			dispatch.notifyObservers();
		}
		
		LOGGER.info(System.lineSeparator() + System.lineSeparator() + "De volgende Voertuigen werden door cameras gedetecteerd: {}", gedetecteerd);
	}

	/**
	 * Enkel beschikbare patrouilles kunnen worden ingezet voor een achtervolging
	 * @param patrouilles
	 */
	private static void registreerPatrouilles(LinkedList<Patrouille> patrouilles) {

		CopyOnWriteArrayList<Patrouille> copyList = new CopyOnWriteArrayList<Patrouille>(patrouilles);
		// CopyOnWriteArrayList wordt gebruikt ter vervanging van LinkedList 
		//om de onderliggende elementen te kunnen wijzigen.
		ListIterator<Patrouille> list = copyList.listIterator();
		Patrouille patrouille;
		int i = 0;
		while (list.hasNext()) {
			patrouille = list.next();
			if (i++ % 3 == 0) {
				dispatch.registerObserver(patrouille); //registreert elke 3de patrouille				
			}
		}
	}
}