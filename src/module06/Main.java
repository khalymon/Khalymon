package module06;

public class Main {
    public static final int SIZE = 8;

    public static void printUsers(User[] users){
        if(users == null){
            System.out.println("Array of users is empty.");
            return;
        }
        else{
            for(int i=0; i<users.length; i++){
                System.out.println(users[i].toString());
            }
            System.out.println("======================");
        }
    }

    public static void printLongs(long[] longs){
        if(longs == null){
            System.out.println("Array of IDs is empty.");
            return;
        }
        else {
            for(int i=0; i<longs.length;i++){
                System.out.print(longs[i]+" ");
            }
            System.out.println();
            System.out.println("======================");
        }
    }

    public static User[] users = new User[SIZE];
    public static UserUtils utils = new UserUtils();

    static {


        users[0] = new User(0        , "Andrew0", "Smith", 200, 1000);
        users[1] = new User(12345601L,      null, "Smith", 200, 1000);
        users[2] = new User(12345602L, "Andrew2",    null, 200, 1000);
        users[3] = new User(12345603L, "Andrew3", "Smith",   0, 1000);
        users[4] = new User(12345604L, "Andrew4", "Smith", 200,    0);
        users[5] = new User(12345605L, "Andrew5", "Smith", 200, 1000);
        users[6] = new User(12345606L, "Andrew6", "Smith", 200, 1000);
        users[7] = new User(12345606L, "Andrew7", "Smith", 200, 1000);
    }

    public static void main(String[] args) {
        User[] usersTmp;
        long[] longs;

        System.out.println("Users[] initial state:");
        printUsers(users);

        users = utils.deleteEmptyUsers(users);
        System.out.println("Users[] after deleteEmptyUsers():");
        printUsers(users);

        longs = utils.getUsersId(users);
        System.out.println("Users[] IDs:");
        printLongs(longs);

        users = utils.paySalaryToUsers(users);
        System.out.println("paySalaryToUsers() done:");
        printUsers(users);

        usersTmp = utils.usersWithConditionalBalance(users, 1200);
        System.out.println("usersWithConditionalBalance() 1200:");
        printUsers(usersTmp);


        users = utils.uniqueUsers(users);
        System.out.println("uniqueUsers():");
        printUsers(users);
    }
}
