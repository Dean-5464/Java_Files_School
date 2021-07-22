import java.text.NumberFormat;
/**
 * The main class for the Student Scores Application
 *
 * Dean Kammerer
 * 10/7/2020
 */
public class StudentsScores
{
public static void main(String[] args){
    
    System.out.println("Welcome to the Student Scores Application.");
    printBlank();
    
    //Get the amount of students being entered
    int studentCount = Console.getInt("Please enter the number of students: ");
    printBlank();
    
    //Student array
    Student[] students = new Student[studentCount];
    
    //Get the data for each student
    for (int i = 0; i < studentCount; i++){
        
        System.out.println("Student " + (i + 1));
        String firstName = Console.getString("First Name: ");
        String lastName = Console.getString("Last Name: ");
        double score = Console.getDouble("Score: ");
        printBlank();
        students[i] = new Student(firstName, lastName, score);
    }
    
    //Average score variables
    double averageScore = 0;
    double totalScore = 0;
    
    //Print the student info in array
    for(Student s : students) {
    s.displayStudentInfo();
    totalScore += s.getScore();
}
    
    //average score calculation
    averageScore = totalScore / studentCount;
    
    //Formats the final score to two decimal places
    java.text.NumberFormat averageScoreFormat = java.text.NumberFormat.getNumberInstance();
    averageScoreFormat.setMaximumFractionDigits(2);
    
    //Display formatted average score
    printBlank();
    System.out.println("Average Score: " + averageScoreFormat.format(averageScore));
    
}

//Prints a blank line
public static void printBlank(){
    System.out.println("");
}
}
