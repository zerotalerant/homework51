package Model;

import java.sql.Time;
import java.time.LocalTime;

public class Teacher {
    private Integer id;
    private String firstName;
    private String secondName;
    private Time workingHours;
    private String phonenumber;

    public Integer getId ()
    {
        return id;
    }

    public void setId ( Integer id )
    {
        this.id = id;
    }

    public String getFirstName ()
    {
        return firstName;
    }

    public void setFirstName ( String firstName )
    {
        this.firstName = firstName;
    }

    public String getSecondName ()
    {
        return secondName;
    }

    public void setSecondName ( String secondName )
    {
        this.secondName = secondName;
    }

    public Time getWorkingHours ()
    {
        return workingHours;
    }

    public void setWorkingHours ( Time workingHours )
    {
        this.workingHours = workingHours;
    }

    public String getPhonenumber ()
    {
        return phonenumber;
    }

    public void setPhonenumber ( String phonenumber )
    {
        this.phonenumber = phonenumber;
    }
}
