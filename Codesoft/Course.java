package Codesoft;
// student course registration System
//class course
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Course {
    private String courseCode;
    private String title;
    private String description;
    private int capacity;
    private String schedule;
    private List<Student> registeredStudents;

    public Course(String courseCode, String title, String description, int capacity, String schedule) {
        this.courseCode = courseCode;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
        this.registeredStudents = new ArrayList<>();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getSchedule() {
        return schedule;
    }

    public int getAvailableSlots() {
        return capacity - registeredStudents.size();
    }

    public boolean registerStudent(Student student) {
        if (registeredStudents.size() < capacity) {
            registeredStudents.add(student);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeStudent(Student student) {
        return registeredStudents.remove(student);
    }

    public List<Student> getRegisteredStudents() {
        return registeredStudents;
    }
}

//---------------------------------------------------------------//
//class Student  
    class Student {
    private String studentId;
    private String name;
    private List<Course> registeredCourses;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void registerCourse(Course course) {
        if (!registeredCourses.contains(course) && course.registerStudent(this)) {
            registeredCourses.add(course);
            System.out.println("Registration successful for course: " + course.getTitle());
        } else {
            System.out.println("Registration failed for course: " + course.getTitle());
        }
    }

    public void dropCourse(Course course) {
        if (registeredCourses.contains(course) && course.removeStudent(this)) {
            registeredCourses.remove(course);
            System.out.println("Dropped course: " + course.getTitle());
        } else {
            System.out.println("Failed to drop course: " + course.getTitle());
        }
    }
}


//---------------------------------------------------------------//
//course.Management class
class CourseManager {
    private List<Course> courses;
    private List<Student> students;

    public CourseManager() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void displayCourses() {
        System.out.println("Available Courses:");
        for (Course course : courses) {
            System.out.println(course.getCourseCode() + ": " + course.getTitle() +
                    " (Available Slots: " + course.getAvailableSlots() + ")");
        }
    }

    public Course findCourseByCode(String courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equalsIgnoreCase(courseCode)) {
                return course;
            }
        }
        return null;
    }

    public Student findStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equalsIgnoreCase(studentId)) {
                return student;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CourseManager courseManager = new CourseManager();

        // Adding some courses
        courseManager.addCourse(new Course("CS101", "Introduction to Computer Science", "Basics of computer science", 30, "MWF 9-10AM"));
        courseManager.addCourse(new Course("MATH101", "Calculus I", "Introduction to calculus", 25, "TTh 11-12:30PM"));
        courseManager.addCourse(new Course("ENG101", "English Literature", "Study of English literature", 20, "MWF 2-3PM"));

        // Adding some students
        Student student1 = new Student("S001", "Alice");
        Student student2 = new Student("S002", "Bob");
        courseManager.addStudent(student1);
        courseManager.addStudent(student2);

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Display Courses");
            System.out.println("2. Register for a Course");
            System.out.println("3. Drop a Course");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    courseManager.displayCourses();
                    break;
                case 2:
                    System.out.print("Enter Student ID: ");
                    String studentId = scanner.next();
                    Student student = courseManager.findStudentById(studentId);
                    if (student != null) {
                        System.out.print("Enter Course Code: ");
                        String courseCode = scanner.next();
                        Course course = courseManager.findCourseByCode(courseCode);
                        if (course != null) {
                            student.registerCourse(course);
                        } else {
                            System.out.println("Course not found.");
                        }
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Student ID: ");
                    studentId = scanner.next();
                    student = courseManager.findStudentById(studentId);
                    if (student != null) {
                        System.out.print("Enter Course Code: ");
                        String dropCourseCode = scanner.next();  // Change the variable name to avoid conflict
                        Course dropCourse = courseManager.findCourseByCode(dropCourseCode);
                        if (dropCourse != null) {
                            student.dropCourse(dropCourse);
                        } else {
                            System.out.println("Course not found.");
                        }
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

//---------------------------------------------------------------//
