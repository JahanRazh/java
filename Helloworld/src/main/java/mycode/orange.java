package mycode;

public class orange {
    private String friendName;

    public void getName(String name) {
        friendName = name;
    }

    public String setName() {
        return friendName;
    }

    public void say() {
        System.out.println("Your friend's name is " + setName());
    }

 
}
