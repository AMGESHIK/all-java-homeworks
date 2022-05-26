package dz_Threads;

public class CalcThread extends Thread {
  /*  @Override
    public void run() {
        int sum = 0;
        if (Main.pieceOfThreads * ((int) this.getId() - 15) + Main.pieceOfThreads <= Main.arr.length) {
            for (int i = Main.pieceOfThreads * ((int) this.getId() - 15);
                 i < Main.pieceOfThreads * ((int) this.getId() - 15) + Main.pieceOfThreads; i++) {
                sum += Main.arr[i];
            }
        } else {
            int z = Main.arr.length - Main.pieceOfThreads * ((int) this.getId() - 15);
            for (int i = Main.pieceOfThreads * ((int) this.getId() - 15); i < Main.pieceOfThreads * ((int) this.getId() - 15) + z; i++) {
                sum += Main.arr[i];
            }
        }
        System.out.println("Поток " + Thread.currentThread().getName() + " вывел результат:" + Integer.toString(sum));
        //Main.sums[Main.count] = sum;
    }*/
  private int from;
    private int to;


    public CalcThread(int from, int to) {

        this.from = from;
        this.to = to;

    }
    @Override
    public void run () {
        Main.sum = 0;
        for (int i = this.from; i <= this.to; i++) {
            if(i < Main.array.length)
                Main.sum += Main.array[i];
        }
        System.out.println("Поток " + Thread.currentThread().getName() + " вывел результат:" + Integer.toString(Main.sum));

    }
}
