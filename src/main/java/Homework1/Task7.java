package Homework1;

public class Task7 {
    public void continueTask() {
        int i;
        for (i = 1; i <= 100; i++) {
            if (i >= 54 && i <= 74) {
                continue;
            }
            System.out.println(i);
        }
    }
}
