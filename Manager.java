public class Manager extends Person {
    private static int managerIdCounter = 1;
    private int managerId;
    private int actionNumber;


    public Manager(String username, String password) {
        super(username, password);
        this.managerId = managerIdCounter++;
        this.actionNumber = 0;
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
