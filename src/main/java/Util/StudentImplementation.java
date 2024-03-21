package Util;

import Model.Student;

import java.util.ArrayList;

public interface StudentImplementation {
    int insertData(Student s);
    public int updateData(Student s);

    public int deleteData(Student s);

    public ArrayList<Student> displayData();


}
