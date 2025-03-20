package softwaremanagementsystem;

import java.util.ArrayList;
import java.util.List;

// Abstract class representing job roles
abstract class JobPosition {
    private final String positionName;

    public JobPosition(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionName() {
        return positionName;
    }
}

// Specific job roles
class SoftwareEngineer extends JobPosition {
    public SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobPosition {
    public DataScientist() {
        super("Data Scientist");
    }
}

class ProductManager extends JobPosition {
    public ProductManager() {
        super("Product Manager");
    }
}

// Generic resume class
class Resume<T extends JobPosition> {
    private final T jobPosition;

    public Resume(T jobPosition) {
        this.jobPosition = jobPosition;
    }

    public T getJobPosition() {
        return jobPosition;
    }
}

// Utility class for processing resumes
class ResumeProcessor {
    // Fixed wildcard type to avoid warnings
    public static void processResumes(List<? extends JobPosition> resumes) {
        for (JobPosition position : resumes) {
            System.out.println("Processing resume for: " + position.getPositionName());
        }
    }
}

public class SoftwareManagement {
    public static void main(String[] args) {
        // Create and add resumes for different roles
        List<SoftwareEngineer> softwareEngineerResumes = new ArrayList<>();
        softwareEngineerResumes.add(new SoftwareEngineer());

        List<DataScientist> dataScientistResumes = new ArrayList<>();
        dataScientistResumes.add(new DataScientist());

        // Process resumes for each role
        ResumeProcessor.processResumes(softwareEngineerResumes);
        ResumeProcessor.processResumes(dataScientistResumes);
    }
}
