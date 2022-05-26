package dz_Threads2;

public class myThread extends Thread {
    @Override
    public void run() {
        System.out.println("Результат работы " + (this.getId() - 15) + " потока равна = " + Main.calcSum());
    }
}
