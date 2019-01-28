package ocp.concurrency.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CabService implements Runnable{
    CyclicBarrier cyclicBarrier;

    public CabService(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try{
            System.out.println("+++++++++++" + Thread.currentThread().getName() + " had arrived");
            System.out.println();
            try{
                cyclicBarrier.await();
            }catch (BrokenBarrierException ex){
                ex.printStackTrace();
            }
            System.out.println("*************" + Thread.currentThread().getName() + " is going to board the cab");

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
