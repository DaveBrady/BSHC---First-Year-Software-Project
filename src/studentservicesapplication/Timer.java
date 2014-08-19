/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservicesapplication;

/**
 *
 * @author x12112267
 */
public class Timer {
    private int year;
    private String month;
    private String day;
    private String hour;
    private String min;
    private int sec;
    
    public Timer(){
        year = 2013;
        month = new String();
        day = new String();
        hour = new String();
        min = new String();
        sec = 0;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
    
    
}




