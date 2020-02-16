/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author reddy
 */
public class StudentApprovalWorkRequest extends WorkRequest{
    
    private ArrayList<Employee> employeeList;
    private String date;
    private EducationEventWorkRequest eventRequest;
    
    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public EducationEventWorkRequest getEventRequest() {
        return eventRequest;
    }

    public void setEventRequest(EducationEventWorkRequest eventRequest) {
        this.eventRequest = eventRequest;
    } 
    
    @Override
    public String toString() {
        String employeeName = getSender().getEmp().getEmpName();
        return employeeName+" ";
    }
    
}
