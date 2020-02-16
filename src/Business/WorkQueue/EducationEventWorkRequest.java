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
public class EducationEventWorkRequest extends WorkRequest{
    //Attributes definition for Education Event Work Request
    private String ngoName;
    private String eventName;
    private String instructorRequired;
    private String date;
    private String place;
    private String topic;
    private String duration;
    private String notes;
    private String dueDate;
    
    private ArrayList<String> enterpriseList;
    private ArrayList<Employee> studentList;
    private ArrayList<Employee> studentWaitList;
    
    //Constructor definition of Education Event 
    public EducationEventWorkRequest(){
    this.studentList = new ArrayList();
    this.studentWaitList = new ArrayList();
    this.enterpriseList = new ArrayList();
    }

    //Getters and setters definition for the class attributes
    public String getNgoName() {
        return ngoName;
    }

    public void setNgoName(String ngoName) {
        this.ngoName = ngoName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getInstructorRequired() {
        return instructorRequired;
    }

    public void setInstructorRequired(String instructorRequired) {
        this.instructorRequired = instructorRequired;
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

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
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

    public ArrayList<Employee> getStudentList() {
        System.err.print("getting");
        return studentList;
    }

    public void setStudentList(ArrayList<Employee> empList) {
        this.studentList = empList;
    }

    public ArrayList<Employee> getStudentWaitList() {
        return studentWaitList;
    }

    public void setStudentWaitList(ArrayList<Employee> empWaitList) {
        this.studentWaitList = empWaitList;
    }

    
    //Overriding toString method of Object class to return string
    @Override
    public String toString() {
        return eventName+" ";
    }
    
}
