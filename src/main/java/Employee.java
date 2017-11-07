/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {
/**
 *
 */
    private String name;
    /**
     *
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param name1 asda
     * @param manager1 asda
     */
    public Employee(final String name1, final String manager1) {
        this.name = name1;
        this.manager = manager1;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param name1 asda
     */
    public void setName(final String name1) {
        this.name = name1;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param manager1 asda
     */
    public void setManager(final String manager1) {
        this.manager = manager1;
    }
}
