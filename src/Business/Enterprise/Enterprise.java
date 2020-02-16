 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise extends Organization{
    
    //Attributes definition for enterprise
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    //Getter for org directory
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    //EnterpriseType enum definition
    public enum EnterpriseType{
        HealthCare("HealthCare"), NGO("NGO"), StudentCommunityBuilder("StudentCommunityBuilder"), Agencies("Agencies");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }

    //Getter and setter for enterprise type
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    //Constructor definition of enterprise
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }

    
}
