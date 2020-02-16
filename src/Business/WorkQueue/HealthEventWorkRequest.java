/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author reddy
 */
public class HealthEventWorkRequest extends WorkRequest{
    
    private String ngoName;
    private String healthEventName;
    private String doctorCount;
    private String childrenCount;
    private String date;
    private String place;
    private String duration;
    private String notes;
    private String dueDate;
    
    private ArrayList<String> enterpriseList;
    private ArrayList<Employee> doctorList;
    private ArrayList<Employee> doctorWaitList;
    private ArrayList<Employee> prescribedChildList;
    private ArrayList<Employee> testedChildList;
    
    public HealthEventWorkRequest(){
    this.doctorList = new ArrayList();
    this.doctorWaitList = new ArrayList();
    this.enterpriseList = new ArrayList();
    this.prescribedChildList = new ArrayList();
    this.testedChildList = new ArrayList();
    }

    public String getDoctorCount() {
        return doctorCount;
    }

    public void setDoctorCount(String doctorCount) {
        this.doctorCount = doctorCount;
    }

    public String getChildrenCount() {
        return childrenCount;
    }

    public void setChildrenCount(String childrenCount) {
        this.childrenCount = childrenCount;
    }
    
    public String getNgoName() {
        return ngoName;
    }

    public void setNgoName(String ngoName) {
        this.ngoName = ngoName;
    }

    public String getHealthEventName() {
        return healthEventName;
    }

    public void setHealthEventName(String healthEventName) {
        this.healthEventName = healthEventName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public ArrayList<String> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<String> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public ArrayList<Employee> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Employee> doctorList) {
        this.doctorList = doctorList;
    }

    public ArrayList<Employee> getDoctorWaitList() {
        return doctorWaitList;
    }

    public void setDoctorWaitList(ArrayList<Employee> doctorWaitList) {
        this.doctorWaitList = doctorWaitList;
    }

    public ArrayList<Employee> getPrescribedChildList() {
        return prescribedChildList;
    }

    public void setPrescribedChildList(ArrayList<Employee> prescribedChildList) {
        this.prescribedChildList = prescribedChildList;
    }

    public ArrayList<Employee> getTestedChildList() {
        return testedChildList;
    }

    public void setTestedChildList(ArrayList<Employee> testedChildList) {
        this.testedChildList = testedChildList;
    }
    
    @Override
    public String toString() {
        return healthEventName+" ";
    }
    
}
