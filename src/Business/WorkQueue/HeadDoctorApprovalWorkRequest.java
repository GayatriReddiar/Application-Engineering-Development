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
public class HeadDoctorApprovalWorkRequest extends WorkRequest{
    
    private ArrayList<Employee> empList;
    private String date;
    private HealthEventWorkRequest workRequest;

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public HealthEventWorkRequest getWorkRequest() {
        return workRequest;
    }

    public void setWorkRequest(HealthEventWorkRequest workRequest) {
        this.workRequest = workRequest;
    }

    
    @Override
    public String toString() {
        String docName = getSender().getEmp().getEmpName();
        return docName+" ";
    }
    
}
