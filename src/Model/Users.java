package Model;

public class Users {
    private Integer id;
    private String login;
    private String password;
    private String email;

    public Integer getId ()
    {
        return id;
    }

    public void setId ( Integer id )
    {
        this.id = id;
    }

    public String getLogin ()
    {
        return login;
    }

    public void setLogin ( String login )
    {
        this.login = login;
    }

    public String getPassword ()
    {
        return password;
    }

    public void setPassword ( String password )
    {
        this.password = password;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail ( String email )
    {
        this.email = email;
    }
}
