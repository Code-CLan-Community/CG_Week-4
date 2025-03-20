package universitymanagementsystem;

import java.util.ArrayList;
import java.util.List;

// Base class representing different course types
abstract class CourseCategory {
    private final String courseTitle;

    public CourseCategory(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseTitle() {
        return courseTitle;
    }
}

// Specific course categories
class ExamBasedCourse extends CourseCategory {
    public ExamBasedCourse(String courseTitle) {
        super(courseTitle);
    }
}

class AssignmentBasedCourse extends CourseCategory {
    public AssignmentBasedCourse(String courseTitle) {
        super(courseTitle);
    }
}

class ResearchBasedCourse extends CourseCategory {
    public ResearchBasedCourse(String courseTitle) {
        super(courseTitle);
    }
}

// Generic class for managing courses
class CourseManager<T extends CourseCategory> {
    private final List<T> courseList = new ArrayList<>();

    public void addCourse(T course) {
        courseList.add(course);
    }

    public List<T> getCourseList() {
        return courseList;
    }
}

// Utility class to display courses
class UniversityCourseManager {
    public static void displayCourses(List<? extends CourseCategory> courses) {
        for (CourseCategory course : courses) {
            System.out.println("Offered Course: " + course.getCourseTitle());
        }
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        // Create and add courses
        CourseManager<ExamBasedCourse> examCourses = new CourseManager<>();
        examCourses.addCourse(new ExamBasedCourse("Mathematics 101"));
        examCourses.addCourse(new ExamBasedCourse("Physics 202"));

        CourseManager<ResearchBasedCourse> researchCourses = new CourseManager<>();
        researchCourses.addCourse(new ResearchBasedCourse("AI Research Methods"));
        researchCourses.addCourse(new ResearchBasedCourse("Quantum Computing"));

        // Display all courses
        UniversityCourseManager.displayCourses(examCourses.getCourseList());
        UniversityCourseManager.displayCourses(researchCourses.getCourseList());
    }
}
