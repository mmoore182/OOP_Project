/**
 * Matthew Moore
 * AudioPlayer.java
 */

public class AudioPlayer extends Product implements MultimediaControl {

  String audioSpecification;
  ItemType mediaType;

  /**
   * Constructor takes and sets name field
   * Also takes string for audioSpecification and sets default
   * value for mediaType
   */

  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = ItemType.Audio;
  }

  public void play() {
    System.out.println("Playing");
  }

  public void stop() {
    System.out.println("Stop");
  }

  public void previous() {
    System.out.println("Previous");
  }

  public void next() {
    System.out.println("Next");
  }

  @Override
  public String toString() {
    return super.toString()
        + "Audio Spec: " + audioSpecification + "\n"
        + "Type: " + mediaType + "\n";
  }
}
