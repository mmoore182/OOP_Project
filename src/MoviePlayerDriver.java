/**
 * Matthew Moore
 * MoviePlayerDriver.java
 * A driver for testing MoviePlayer
 */

public class MoviePlayerDriver {
  public static void testMoviePlayer() {
    MoviePlayer mp = new MoviePlayer("DBPOWER MK101", new Screen("800x1900", 40, 22), MonitorType.LCD);
    mp.screen.resolution = "720x480";
    mp.screen.refreshrate = 40;
    mp.screen.responsetime = 22;
    System.out.println(mp);
  }
}
