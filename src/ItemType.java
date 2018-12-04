/**
 * Matthew Moore
 * Itemtype.java is an enum containing the 4 item types along with their corresponding codes.
 **/

public enum ItemType {
  Audio("AU"),
  Visual("VI"),
  AudioMobile("AM"),
  VideoMobile("VM");

  String code;

  ItemType(String code) {
    this.code = code;
  }
}