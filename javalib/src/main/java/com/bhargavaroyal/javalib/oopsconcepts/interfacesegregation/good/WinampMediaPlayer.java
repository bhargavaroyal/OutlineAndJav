package com.bhargavaroyal.javalib.oopsconcepts.interfacesegregation.good;

/**
 *  
 *  So Winamp Media player only implements Audio Media Player. 
 *
 */
public class WinampMediaPlayer implements AudioMediaPlayer {

	@Override
	public void playAudio() {
		System.out.println(" Playing audio........");
		
	}

}