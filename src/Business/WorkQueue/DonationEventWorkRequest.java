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
public class DonationEventWorkRequest extends WorkRequest{
    
    private String ngoName;
    private String eventName;
    private String category;
    private String fundingAmount;
    private String description;
    private String contactPerson;
    private String contactEmail;
    private String elevatorPitch;
    
    private ArrayList<String> enterpriseList;
    private ArrayList<Employee> agencyList;
    private ArrayList<Employee> agencyWaitList;
    
    public DonationEventWorkRequest(){
    this.agencyList = new ArrayList();
    this.agencyWaitList = new ArrayList();
    this.enterpriseList = new ArrayList();
    }

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFundingAmount() {
        return fundingAmount;
    }

    public void setFundingAmount(String fundingAmount) {
        this.fundingAmount = fundingAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getElevatorPitch() {
        return elevatorPitch;
    }

    public void setElevatorPitch(String elevatorPitch) {
        this.elevatorPitch = elevatorPitch;
    }

    public ArrayList<String> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<String> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public ArrayList<Employee> getAgencyList() {
        return agencyList;
    }

    public void setAgencyList(ArrayList<Employee> agencyList) {
        this.agencyList = agencyList;
    }

    public ArrayList<Employee> getAgencyWaitList() {
        return agencyWaitList;
    }

    public void setAgencyWaitList(ArrayList<Employee> agencyWaitList) {
        this.agencyWaitList = agencyWaitList;
    }
    
    //Overriding toString method of Object class to return string
    @Override
    public String toString() {
        return eventName+" ";
    }
    
}
