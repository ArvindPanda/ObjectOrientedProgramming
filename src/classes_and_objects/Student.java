package classes_and_objects;


public class Student {
     int rollNumber;
    String name;
   private static int numStudents;
   public static int getNumStudents(){
       return numStudents;
   }






    public Student(String name, int rollNumber){
         this.name = name;
        this.rollNumber =rollNumber;
        numStudents++;
    }
    public void print(){
        System.out.println(name+ " : " + rollNumber);
        System.out.println(this);
    }
}
