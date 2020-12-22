package am.picsart.lesson14;

public class Main {

    public static void main(String[] args){

        QuestionService qs = new QuestionService("src\\am\\picsart\\lesson14\\file.txt");
        qs.printQuestion("basic");
    }


}
