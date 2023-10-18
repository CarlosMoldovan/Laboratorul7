package ex1;

import java.util.Random;

public class RandomOutTask implements Task {
    private String message;
    private int randomNumber;

    public RandomOutTask(String message) {
        this.message = message;
        Random random = new Random();
        randomNumber = random.nextInt(100);
    }

    @Override
    public void execute() {
        
         
        System.out.println(message + " " + randomNumber);
    }
}