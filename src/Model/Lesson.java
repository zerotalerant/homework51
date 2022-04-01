package Model;

public class Lesson {
    private Integer id;
    private String subjectName;
    private Teacher teacher;
    private Subscribes subscribes;

    public Integer getId ()
    {
        return id;
    }

    public void setId ( Integer id )
    {
        this.id = id;
    }

    public String getSubjectName ()
    {
        return subjectName;
    }

    public void setSubjectName ( String subjectName )
    {
        this.subjectName = subjectName;
    }

    public Teacher getTeacher ()
    {
        return teacher;
    }

    public void setTeacher ( Teacher teacher )
    {
        this.teacher = teacher;
    }

    public Subscribes getSubscribes ()
    {
        return subscribes;
    }

    public void setSubscribes ( Subscribes subscribes )
    {
        this.subscribes = subscribes;
    }
}
