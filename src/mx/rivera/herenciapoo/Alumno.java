package mx.rivera.herenciapoo;

public class Alumno extends Persona{
  private String nameSchool;
  private double noteMaths;
  private double noteLanguage;
  private double noteHistory;

  public String getNameSchool() {
    return nameSchool;
  }

  public void setNameSchool(String nameSchool) {
    this.nameSchool = nameSchool;
  }

  public double getNoteMaths() {
    return noteMaths;
  }

  public void setNoteMaths(double noteMaths) {
    this.noteMaths = noteMaths;
  }

  public double getNoteLanguage() {
    return noteLanguage;
  }

  public void setNoteLanguage(double noteLanguage) {
    this.noteLanguage = noteLanguage;
  }

  public double getNoteHistory() {
    return noteHistory;
  }

  public void setNoteHistory(double noteHistory) {
    this.noteHistory = noteHistory;
  }
}
