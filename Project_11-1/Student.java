
/**
 * A student object that can hold a score, first name, and last name
 *
 * Dean Kammerer
 * 10/7/2020
 */
public class Student
{
 private String firstName;
 private String lastName;
 private double score;

//Constructor Method
public Student(String firstName, String lastName, double score){
    this.firstName = firstName;
    this.lastName = lastName;
    this.score = score;
}


//  Getter methods
public String getFullName(){
    return (this.firstName + " " + this.lastName);
}

public String getFirstName(){
    return (this.firstName);
}

public String getLastName(){
   return (this.lastName);
}

public double getScore(){
    return this.score;
}

//Setter methods
public void setFullName(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
}

public void setFirstName(String firstName){
    this.firstName = firstName;
}

public void setLastName(String lastName){
    this.lastName = lastName;
}

public void setScore(double score){
    this.score = score;
}

//Display method
public void displayStudentInfo(){
    System.out.println(this.lastName + ", " + this.firstName + ": " + this.score);
}

}