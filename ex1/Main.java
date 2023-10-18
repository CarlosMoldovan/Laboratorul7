package ex1;

public class Main {
    public static void main(String[] args) {
        Task outTask = new OutTask("Afara ploua");
        Task randomOutTask = new RandomOutTask("Număr aleatoriu generat:");
        Task counterOutTask = new CounterOutTask();

        outTask.execute();
        randomOutTask.execute();
        counterOutTask.execute();
        counterOutTask.execute();
    }
}

