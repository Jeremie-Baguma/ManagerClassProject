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

public class Manager extends Person {
    private static int managerIdCounter = 1; // Counter for auto-generating managerId
    private int managerId;
    private int actionNumber;


    public Manager(String username, String password) {
        super(username, password);
        this.managerId = managerIdCounter++; // Auto-generate managerId
        this.actionNumber = 0; // Set actionNumber to 0
    }


    public int getActionNumber() {
        return actionNumber;
    }

    public void setActionNumber(int actionNumber) {
        this.actionNumber = actionNumber;
    }

    public int getManagerId() {
        return managerId;
    }


    @Override
    public String toString() {
        return super.toString() + ", ManagerID: " + managerId;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Manager) {
            Manager other = (Manager) obj;

            return (this.getUsername().equals(other.getUsername()) && this.getPassword().equals(other.getPassword())) ||
                    (this.managerId == other.managerId && this.getPassword().equals(other.getPassword()));
        }
        return false;
    }

    public static void main(String[] args) {

        Manager manager1 = new Manager("user1", "pass123");
        Manager manager2 = new Manager("user2", "pass123");


        System.out.println(manager1);
        System.out.println(manager2);


        System.out.println(manager1.equals(manager2));
        System.out.println(manager1.equals(manager1));
    }
}
