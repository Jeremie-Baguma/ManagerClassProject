//Create Manager class, it should extend Person, it should have extra managerId (auto generate) and actionNumber( set zero when you created the object so it should assign 0 in the constructor)
//Required extra functions: getActionNumber, setActionNumber and getManagerID
// Overide toString again and print extra managerID
//override equals function and check if username and password matchs or managerIDand password match.  IF any of cases are correct we will return true

public class Person {
    private String username;
    private String password;


    public Person(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Username: " + username;
    }
}

