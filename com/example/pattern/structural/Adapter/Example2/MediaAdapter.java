package com.example.pattern.structural.Adapter.Example2;

public class MediaAdapter implements MediaPlayerAdapter{
	
	MediaPlayer mediaPlayer;
	
	
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("VLC")) {
			mediaPlayer = new VLCPlayer();
			mediaPlayer.play(fileName);
		}	
		else if(audioType.equalsIgnoreCase("MP4")||audioType.equalsIgnoreCase("MP3")) {
			mediaPlayer = new MP4Player();
			mediaPlayer.play(fileName);
		}
			
		
	}
	
	public static void main(String args[]) {
	MediaAdapter mAdapter = new MediaAdapter();
	mAdapter.play("VLC", "farfaraway.vlc");
	mAdapter.play("MP4", "mind me.mp3");
	mAdapter.play("MP3","beyond the horizon.mp4");
	
	}
}
