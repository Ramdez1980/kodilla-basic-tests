import java.sql.SQLOutput;

public class UserProcessor {

    private Users[] users;

    public UserProcessor(Users[] users) {
        this.users = users;
    }

    private double average() {
        double sum = 0;
        for (int i = 0; i < users.length; i++ ) {
            sum += users[i].getAge();
        }
        return sum/ users.length;
    }

    public void print() {
        double average = average();
        for(int i = 0; i < users.length; i++) {
            if (users[i].getAge() < average) {
                System.out.println(users[i].getName());
            }
        }

    }
}
