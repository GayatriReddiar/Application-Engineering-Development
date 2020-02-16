/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {
    //Atrributes definition for user account
    private String uname;
    private String password;
    private WorkQueue queue;
    private Role role;
    private Employee emp;
   
    //Constructor definition
    public UserAccount() {
        queue = new WorkQueue();
    }
    
    //Getters and setters for user account attributes
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public WorkQueue getQueue() {
        return queue;
    }

    public void setQueue(WorkQueue queue) {
        this.queue = queue;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    } 
    
    //toString override method
    @Override
    public String toString() {
        return uname;
    }
 
}