/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.WorkQueue.EducationEventWorkRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author raunak
 */
public class Employee {
    //Attributes definition for student entity
    private String empName;
    private int empID;
    private int managerID;
    private static int count = 1;
    private ArrayList<Integer> quizScores;
    private Map<String, Integer> quizScoreList;
    private ArrayList<EducationEventWorkRequest> quizWorkRequest;

    //Constructor definition of student 
    public Employee() {
        empID = count;
        count++;
        this.quizScores = new ArrayList();
        this.quizWorkRequest = new ArrayList();
        this.quizScoreList = new HashMap<String,Integer>();
    }

    //Getters and setters definition

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public ArrayList<Integer> getQuizScores() {
        return quizScores;
    }

    public void setQuizScores(ArrayList<Integer> quizScores) {
        this.quizScores = quizScores;
    }

    public Map<String, Integer> getQuizScoreList() {
        return quizScoreList;
    }

    public void setQuizScoreList(Map<String, Integer> quizScoreList) {
        this.quizScoreList = quizScoreList;
    }

    public ArrayList<EducationEventWorkRequest> getQuizWorkRequest() {
        return quizWorkRequest;
    }

    public void setQuizWorkRequest(ArrayList<EducationEventWorkRequest> quizWorkRequest) {
        this.quizWorkRequest = quizWorkRequest;
    }

    //Overriding toString method of Object class
    @Override
    public String toString() {
        return empName;
    }
    
    
}
