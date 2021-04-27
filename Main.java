package oopOdev;

public class Main {

	public static  main(String[] args) {  Course course1 = new course(1,"C#+AngulAr","Engin Demiroğ");

  Course course2 = new course(2,"Java+REACT");

  

  Course[] course = {course1,course2};

  for (Course course : courses){

    System.out.println("Kurs Adı:" + 

     course.name + "\n----------");

     

  CourseManager coursemanager = new coursemanager;

  courseManager.Add(course1);

  courseManager.Add(course);

  CourseManager.Delete();

    

    Category category = new category(1,"Programlama");

    

  }

}
