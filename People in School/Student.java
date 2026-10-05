public class Student extends Person {
    private String program;
    private int yearLevel;
   
    public void setProgram(String p) {
    this.program = p;
    }
    
    public String getProgram() {
    return program;
    }
    
    public void setyearLevel(int y) {
    this.yearLevel = y;
    }
    
    public int getyearLevel() {
    return yearLevel;
    }
}