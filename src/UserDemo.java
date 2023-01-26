public class UserDemo {
    public static void main(String[] args) {
        User karen = new User("Karen", 22);
        User artur = new User("Artur", 35);
        User hayk = new User("Hayk", 24);
        User mark = new User("Mark", 30);
        User grig = new User("Grig", 29);

        User[] users = {karen, artur, hayk, mark, grig};

        System.out.println(findByName("Mark",users));


    }


    public static User findByName(String targetName, User[] arr) {
        User target = new User();


        for (User v : arr) {
            if (v.getName().equals(targetName)) {
                target = v;
            }
        }

        if (target.getAge() != 0) {
            return target;
        } else {

            //if user is not found will be printed no name and age -1
            target.setName("No name");
            target.setAge(-1);
            return target;
        }
    }

}
