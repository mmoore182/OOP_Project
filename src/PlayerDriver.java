/**
 * Matthew Moore PlayerDriver.java A driver for testing both MoviePlayer and Audioplayer
 */

public class PlayerDriver {

  public static void testPlayer() {
    MoviePlayer mp = new MoviePlayer("DBPOWER MK101", new Screen("720x480", 40, 20), MonitorType.LCD);

    AudioPlayer ap = new AudioPlayer("Pyle PDV156BK", "Specification");

    System.out.println(mp);
    System.out.println(ap);

    ap.next();
    ap.play();
    ap.previous();
    ap.stop();
    mp.next();
    mp.play();
    mp.previous();
    mp.stop();

    System.out.println("=====================");
  }
}
