package com.bhargavaroyal.javalib.oopsconcepts.interfacesegregation.bad;

/**
 * VLC Media player  implements Media player.
 *  Perfect, LSP is not violated here.
 * 
 * @author tirthalp
 */
public class VlcMediaPlayer implements MediaPlayer {
	@Override
	public void playAudio() {
		System.out.println(" Playing audio ..........");
		
	}

	@Override
	public void playVideo() {
		System.out.println(" Playing video ..........");
		
	}
}