package sample;

public class CongressHearing {

  private  String congressBody;
  private  String hearingTitle;
  private  String hearingLocation;
  private  String hearingDate;

  public enum Ofdaytime {
    AM, PM
  }
private Ofdaytime hearingdt;

  public CongressHearing(String congressBody, String hearingTitle, String hearingLocation,
                         String hearingDate, Ofdaytime hearingdt) {
    this.congressBody = congressBody;
    this.hearingTitle = hearingTitle;
    this.hearingLocation = hearingLocation;
    this.hearingDate = hearingDate;
    this.hearingdt = hearingdt;
  }

  public String getCongressBody() {
    return congressBody;
  }

  public void setCongressBody(String congressBody) {
    this.congressBody = congressBody;
  }

  public String getHearingTitle() {
    return hearingTitle;
  }

  public void setHearingTitle(String hearingTitle) {
    this.hearingTitle = hearingTitle;
  }

  public String getHearingLocation() {
    return hearingLocation;
  }

  public void setHearingLocation(String hearingLocation) {
    this.hearingLocation = hearingLocation;
  }

  public String getHearingDate() {
    return hearingDate;
  }

  public void setHearingDate(String hearingLocation) {
    this.hearingDate = hearingDate;
  }
}
