/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> empList;
    private Employee emp;

    public EmployeeDirectory() {
        empList = new ArrayList();
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public Employee getEmp(int ID) {
        for(Employee e : getEmpList()){
            if(ID == e.getEmpID())
                emp = e;
        }
        return emp;
    }

    public Employee createEmp(String name, int managerID){
        Employee employee = new Employee();
        employee.setEmpName(name);
        employee.setManagerID(managerID);
        empList.add(employee);
        return employee;
    }
    
    public void deleteEmp(Employee e)
    {
        empList.remove(e);
    }
}