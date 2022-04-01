package Model;

import java.sql.Time;

public class Subscribes {
    private Integer id;
    private Time subsribeDate;
    private Time endOfSubscribe;
    private Lesson lesson;
    private Teacher teacher;
    private Subscribe subscribe;

    public Integer getId ()
    {
        return id;
    }

    public void setId ( Integer id )
    {
        this.id = id;
    }

    public Time getSubsribeDate ()
    {
        return subsribeDate;
    }

    public void setSubsribeDate ( Time subsribeDate )
    {
        this.subsribeDate = subsribeDate;
    }

    public Time getEndOfSubscribe ()
    {
        return endOfSubscribe;
    }

    public void setEndOfSubscribe ( Time endOfSubscribe )
    {
        this.endOfSubscribe = endOfSubscribe;
    }

    public Lesson getLesson ()
    {
        return lesson;
    }

    public void setLesson ( Lesson lesson )
    {
        this.lesson = lesson;
    }

    public Teacher getTeacher ()
    {
        return teacher;
    }

    public void setTeacher ( Teacher teacher )
    {
        this.teacher = teacher;
    }

    public Subscribe getSubscribe ()
    {
        return subscribe;
    }

    public void setSubscribe ( Subscribe subscribe )
    {
        this.subscribe = subscribe;
    }
}
