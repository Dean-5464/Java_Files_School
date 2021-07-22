public class Student {
    
    private String firstName;
    private String lastName;
    private String major;
    private int age;
    
    public Student() { }        //default constructor
       
    public Student(String f, String l, String m , int a) {
        firstName = f;
        lastName = l;
        major = m;
        age = a;
    }
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String newName) {
        firstName = newName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String newName){
        lastName = newName;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String newMajor) {
        major = newMajor;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
    
    public String displayStudent() {
        String student = "";
        student += "Student Information\n";
        student += "Name:\t" + firstName + " " + lastName + "\n";
        student += "Major:\t" + major + "\n";
        student += "Age:\t" + age + "\n";
        student += "";
        return student; 
    }
}
