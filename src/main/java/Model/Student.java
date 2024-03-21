package Model;
//DTO Class
public class Student {
    private int studentRollNuber;
    private String studentName;
    private String studentAddress;

    public int getStudentRollNuber() {
        return studentRollNuber;
    }

    public void setStudentRollNuber(int studentRollNuber) {
        this.studentRollNuber = studentRollNuber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public double getStudentPercentage() {
        return studentPercentage;
    }

    public void setStudentPercentage(double studentPercentage) {
        this.studentPercentage = studentPercentage;
    }

    private double studentPercentage;
}
