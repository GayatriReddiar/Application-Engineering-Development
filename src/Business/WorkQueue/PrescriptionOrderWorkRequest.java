/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author reddy
 */
public class PrescriptionOrderWorkRequest extends WorkRequest{
    
    String ngoName;
    String healthCampName;
    String date;
    String childName;
    int childAge;
    String details;

    public String getNgoName() {
        return ngoName;
    }

    public void setNgoName(String ngoName) {
        this.ngoName = ngoName;
    }

    public String getHealthCampName() {
        return healthCampName;
    }

    public void setHealthCampName(String healthCampName) {
        this.healthCampName = healthCampName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public int getChildAge() {
        return childAge;
    }

    public void setChildAge(int childAge) {
        this.childAge = childAge;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
    @Override
    public String toString() {
        return ngoName+" ";
    }
    
}
