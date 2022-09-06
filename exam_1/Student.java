public class Student { 
    // Character attributes 
    String surname; 
    String firstName;
    char middleInitial;
    String dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome; 


    // Character method
    public void sayMyStudentNumber() {
       System.out.println("my Student Number is " + studentNumber);
    } 
    public void sayMyEmailAddress() {
       System.out.println("My Email Address " + studentEmailAddress);
    } 
    public void AmIAwesome() {
       System.out.println("Am I Awesome " + iAmAwesome);
    } 
  
    }  
