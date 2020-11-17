package am.picsart.lesson4.first_task.model;

public class Referee extends Human {
    private boolean isMainReferee;

    public Referee(String firstName, String lastName, int age) {
        super(firstName, lastName, age);

    }

    public boolean isMainReferee() {
        return isMainReferee;
    }

    public void setMainReferee(boolean mainReferee) {
        isMainReferee = mainReferee;
    }

    @Override
    public String toString() {
        return super.toString() +
                "isMainReferee=" + isMainReferee;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        if (isMainReferee) System.out.println("He is main referee");
    }


}
