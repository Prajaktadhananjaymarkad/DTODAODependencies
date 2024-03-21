package Util;

import Model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp1 {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        operation();
    }
    private static void operation(){
        boolean status=true;
        while (status){
        System.out.println("------------------");
        System.out.println("1: SAVE DATA      ");
        System.out.println("2: UPDATE DATA    ");
        System.out.println("3: DELETE DATA    ");
        System.out.println("4: DISPLAY DATA   ");
        System.out.println("5: EXIT           ");
        System.out.println("ENTER YOUR CHOICE ");
        System.out.println("------------------");
        int choice= sc.nextInt();
        switch (choice){
            case 1:
                saveData();
                break;
            case 2:
                updateData();
                break;
            case 3:
                deleteData();
                break;
            case 4: 
                displayData();
                break;
            case 5:
                System.out.println("THANK YOU FOR VISITING !!!");
                status=false;
                break;
            default:
                System.out.println("INVALID CHOICE");
                break;
        }

        }
    }
    private static  void saveData(){
        System.out.println("ENTER YOUR NAME");
        sc.nextLine();
        String fullName= sc.nextLine().toUpperCase();
        System.out.println("ENTER YOUR ADDRESS");
        String address= sc.nextLine().toUpperCase();
        System.out.println("ENTER YOUR PERCENTAGE");
        double percentage=sc.nextDouble();

        Student s1=new Student();
        s1.setStudentName(fullName);
        s1.setStudentAddress(address);
        s1.setStudentPercentage(percentage);

        StudentImplementation dao=new DAO();
        int result=dao.insertData(s1);
        if (result>0){
            System.out.println(result+" DATA INSERTED SUCCESSFULLY");
        }
        else {
            System.out.println("SOMETHING WENT WRONG !");
        }
    }
    private static void updateData(){
        System.out.println("ENTER ROLL NUMBER");
        int rollNo= sc.nextInt();
        System.out.println("ENTER PERCENTAGE");
        double per=sc.nextDouble();

        Student s1=new Student();
        s1.setStudentRollNuber(rollNo);
        s1.setStudentPercentage(per);

        StudentImplementation dao=new DAO();
        int result= dao.updateData(s1);
        if (result>0){
            System.out.println(result+" DATA UPDATED SUCCESSFULLY");
        }
        else {
            System.out.println("SOMETHING WENT WRONG !");
        }
    }
    private static void deleteData(){
        System.out.println("ENTER ROLL NUMBER");
        int rollNo=sc.nextInt();

        Student s1=new Student();
        s1.setStudentRollNuber(rollNo);

        StudentImplementation dao=new DAO();
        int result= dao.deleteData(s1);
        if (result>0){
            System.out.println(result+" DATA DELETED SUCCESSFULLY");
        }
        else {
            System.out.println("SOMETHING WENT WRONG !");
        }
    }
    
    private static void displayData(){
        StudentImplementation s1=new DAO();
        ArrayList<Student> students=s1.displayData();
            for (Student s:students){
                System.out.print(s.getStudentRollNuber()+"\t");
                System.out.print(s.getStudentName()+"\t");
                System.out.print(s.getStudentAddress()+"\t");
                System.out.print(s.getStudentPercentage()+"\t");
                System.out.println();
            }
    }
    
}
