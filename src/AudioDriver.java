/**
 * Matthew Moore AudioDriver.java A driver for testing AudioPlayer
 */

public class AudioDriver {

  public static void main(String args[]) {
    AudioPlayer audioPlayer = new AudioPlayer("Audio Name", "Specification");
    audioPlayer.setProductionNumber(1);
    audioPlayer.stop();
    System.out.println(audioPlayer);
  }
}
