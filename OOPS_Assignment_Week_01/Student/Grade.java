public class Grade{
    public static void main(String [] args){
        Student s1= new Student("Ali");
        s1.inputGrades();
        System.out.println("Average of "+ s1.getName()+" is: "+ s1.getAverage());
        System.out.println(s1);
    }
}