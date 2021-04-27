package Homework;

public class CourseManager(){
    public void AddtoCourse(Course course){
      System.out.println("Eğitmen:" + course.instructor);
      System.out.println("Kurs:" + course.name + "\nBaşarıyla Eklendi");
    
    public void DeletetoCourse(Course course){
      System.out.println("Eğitmen:" + course.instructor);
      System.out.println("Kurs:" + course.name + "\nBaşarıyla Silindi");
    }
   
      
    }
}
