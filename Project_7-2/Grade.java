
/**
 * A class that both holds and converts the numeric grade information given by the user
 *
 * Dean Kammerer
 * 9/21/2020
 */
public class Grade
{
       int grade = 0;
       String letterGrade = "";

    public Grade(){
    }
    
    public Grade(int number){
        grade = number;
    }
    
    public void setNumber(int number){
        grade = number;
    }
    
    public int getNumber(){
        return grade;   
    }
    
    public String getLetter(){
        
        if(grade > 88){
            letterGrade = "A";
        }else if(grade > 80){
            letterGrade = "B";
        }else if(grade > 67){
            letterGrade = "C";
        }else if(grade > 60){
            letterGrade = "D";
        }else{
            letterGrade = "F";
        }
        return letterGrade;
    }
    
    
}
