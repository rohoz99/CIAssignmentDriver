import org.joda.time.DateTime;
import java.util.ArrayList;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class Main {


    public static void main(String [] args){

        ArrayList<Student> students = new ArrayList<Student>(100);
        ArrayList<Module> modules = new ArrayList<Module>(100);
        ArrayList<Course> courses = new ArrayList<Course>(100);

        DateTimeFormatter dateFormat = DateTimeFormat.forPattern ("dd-MM-yy");


        String student1Name = "Rohin Joseph";
        int student1Age = 21;
        DateTime student1DOB = new DateTime(1999,1,29,0,0);
        int student1Id = 17461856;


        String student2Name = "Indiana Jones";
        int student2Age = 45;
        DateTime student2DOB = new DateTime(1967,3,11,0,0);
        int student2Id = 17893289;

        String student3Name = "Darth Vader";
        int student3Age = 67;
        DateTime student3DOB = new DateTime(1969,9,18,0,0);
        int student3Id = 18920122;

        String student4Name = "Gavin Harris";
        int student4Age = 65;
        DateTime student4DOB = new DateTime(1975,8,12,0,0);
        int student4Id = 12390937;


        String module1Name = "Machine Learning";
        String module2Name ="Graphics and Image Processing";
        String module3Name = "Software Engineering";
        String module4Name = "Artificial Intelligence";
        String module5Name = "Information Retrieval";

        String module1Id = "CT417";
        String module2Id = "CT439";
        String module3Id = "CT489";
        String module4Id = "CT433";
        String module5Id = "CT421";

        String course1Name = "Computer Science";
        DateTime course1StartDate = new DateTime(2021,8,12,0,0);
        DateTime course1EndDate = new DateTime(2024,6,25,0,0);


        String course2Name = "Data Science";
        DateTime course2StartDate = new DateTime(2022,8,16,0,0);
        DateTime course2EndDate = new DateTime(2023,6,13,0,0);


        Course course1 = new Course(course1Name,course1StartDate,course1EndDate);
        Course course2 = new Course(course2Name,course2StartDate,course2EndDate);


        courses.add(course1);
        courses.add(course2);


        Student student1 = new Student(student1Name,student1Age,student1DOB,student1Id);

        Student student2 = new Student(student2Name,student2Age,student2DOB,student2Id);

        Student student3 = new Student(student3Name,student3Age,student3DOB,student3Id);

        Student student4 = new Student(student4Name,student4Age,student4DOB,student4Id);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        Module module1 = new Module(module1Name,module1Id);
        Module module2 = new Module(module2Name,module2Id);
        Module module3 = new Module(module3Name,module3Id);
        Module module4 = new Module(module4Name,module4Id);
        Module module5 = new Module(module5Name,module5Id);

        modules.add(module1);
        modules.add(module2);
        modules.add(module3);
        modules.add(module4);
        modules.add(module5);


        students.get(0).setStudentCourses(courses.get(1));
        students.get(1).setStudentCourses(courses.get(0));
        students.get(2).setStudentCourses(courses.get(1));
        students.get(3).setStudentCourses(courses.get(0));

        students.get(0).setStudentMods(modules.get(1));
        students.get(0).setStudentMods(modules.get(0));
        students.get(1).setStudentMods(modules.get(3));
        students.get(1).setStudentMods(modules.get(0));
        students.get(2).setStudentMods(modules.get(2));
        students.get(3).setStudentMods(modules.get(4));

        modules.get(0).setCourseList(courses.get(0));
        modules.get(1).setCourseList(courses.get(0));
        modules.get(2).setCourseList(courses.get(1));
        modules.get(3).setCourseList(courses.get(0));
        modules.get(4).setCourseList(courses.get(1));
        modules.get(4).setCourseList(courses.get(0));



        modules.get(0).setStudentList(students.get(0));
        modules.get(1).setStudentList(students.get(0));
        modules.get(1).setStudentList(students.get(1));
        modules.get(2).setStudentList(students.get(2));
        modules.get(3).setStudentList(students.get(3));
        modules.get(4).setStudentList(students.get(2));
//        modules.get(4).setStudentList(students.get(4));



        courses.get(0).setModules(modules.get(1));
        courses.get(0).setModules(modules.get(2));
        courses.get(0).setModules(modules.get(3));
        courses.get(1).setModules(modules.get(3));
        courses.get(1).setModules(modules.get(4));
        courses.get(1).setModules(modules.get(0));

        courses.get(0).setStudents(students.get(1));
        courses.get(0).setStudents(students.get(2));
        courses.get(0).setStudents(students.get(3));
        courses.get(1).setStudents(students.get(0));


        System.out.println(">>>>>>>>>>>>>>Student Details<<<<<<<<<<<<<" +"\n");

        for (Student student : students)
        {
            System.out.println("Name:" +student.getStudentName() +"\n" +"Age"+student.getStudentAge() +"\n"
                    +"Date Of Birth:" +student.getDOB() + "\n" +"Id:" +student.getStudentID() +"\n" + "Username:" +student.getStudentUsername() + "\n");


            for (Course course : student.getStudentCourses()){
                System.out.println("Course Name:" +course.getCourseName() + "\n" + "Start Date:" +course.getStartDate() + "\n"+
                        "End Date:" +course.getEndDate()+"\n");



                for(Module module: student.getStudentMods()){
                    System.out.println("Module Name: " +module.getModName() +"\n"+ "Module Id:" +module.getModId()+ "\n");

                }

            }

        }
        System.out.println(">>>>>>>>>>>>>>Courses Details<<<<<<<<<<<<<" +"\n");

        for (Course course: courses){
            System.out.println("Name of Course: " +course.getCourseName()+"\n"+ "Course StartDate" +course.getStartDate()+"\n"+ "Course EndDate" +course.getEndDate() +"\n");

            for (Module module: course.getModules()){
                System.out.println("Module Name:" +module.getModName() +"\n" + "Module Id:" +module.getModId() +"\n");

               for (Student student: course.getStudents()) {
                   System.out.println("Name:" +student.getStudentName() +"\n" +"Age"+student.getStudentAge() +"\n"
                           +"Date Of Birth:" +student.getDOB() + "\n" +"Id:" +student.getStudentID() +"\n" + "Username:" +student.getStudentUsername() + "\n");
               }

            }




        }

        System.out.println(">>>>>>>>>>>>>>Modules Details<<<<<<<<<<<<<" +"\n");
        for(Module module: modules){
            System.out.println("Name:"+module.getModName()+"\n" +"Module Id:" +module.getModId() +"\n");

            for(Student student: module.getListOfStudents()){
                System.out.println("Name:" +student.getStudentName() +"\n" +"Age"+student.getStudentAge() +"\n"
                        +"Date Of Birth:" +student.getDOB() + "\n" +"Id:" +student.getStudentID() +"\n" + "Username:" +student.getStudentUsername() + "\n");

            }

            for (Course course: module.getListOfCourses()){

                System.out.println("Name of Course: " +course.getCourseName()+"\n"+ "Course StartDate" +course.getStartDate()+"\n"+ "Course EndDate" +course.getEndDate() +"\n");

            }

        }

    }



}
