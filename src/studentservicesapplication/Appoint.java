/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservicesapplication;

/**
 *
 * @author x12112267
 * This is the the object called on by the appointments class.
 */
public class Appoint {
        private String name;
        private String studentID;
        private String email;
        private String service;
        
    
    public Appoint(){
        name = new String();
        studentID = new String();
        email =  new String();
        service = new String();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    
}
