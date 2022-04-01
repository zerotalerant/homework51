package Model;

public class Subscribe {
    private Integer id;
    public Subscribes subscribes;
    private Users users;

    public Integer getId ()
    {
        return id;
    }

    public void setId ( Integer id )
    {
        this.id = id;
    }

    public Subscribes getSubscribes ()
    {
        return subscribes;
    }

    public void setSubscribes ( Subscribes subscribes )
    {
        this.subscribes = subscribes;
    }

    public Users getUsers ()
    {
        return users;
    }

    public void setUsers ( Users users )
    {
        this.users = users;
    }
}
