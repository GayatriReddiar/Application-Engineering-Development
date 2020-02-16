/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    //Attribute definition for enterprise directory
    private ArrayList<Enterprise> enterpriseList;
    
    //Constructor definition of enterprise directory
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Getter and setter for enterpriseList
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    //Create different enterprises
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.HealthCare){
            enterprise=new HealthCareEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        if(type==Enterprise.EnterpriseType.NGO){
            enterprise=new NGOEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        if(type==Enterprise.EnterpriseType.Agencies){
            enterprise=new AgenciesEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        if(type==Enterprise.EnterpriseType.StudentCommunityBuilder){
            enterprise=new StudentCommunityBuildersEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
    
    //Deleting enterprise from the list of enterprises
    public void deleteEnterprise(Enterprise e) { 
        enterpriseList.remove(e);
    }
    
}
