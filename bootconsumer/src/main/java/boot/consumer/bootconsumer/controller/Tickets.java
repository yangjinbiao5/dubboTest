package boot.consumer.bootconsumer.controller;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Version 1.0
 * @Author yangjinbiao
 * @Date 2019/10/23 12:16
 */

public class Tickets {
    //总票数
    private int size;
    //存票序号
    private int number=0;
    //售票序号
    private int i=0;
    //是否有待售的票
    private boolean available;

    public Tickets(int size){
        this.size=size;
    }

    public synchronized void put(){
        //有票在待售
        /*if (available){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
        System.out.println("生产票 "+ (++number));
        available = true;
    }

    public synchronized void sell(){

        /*if(!available){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
        if (available==true&& i<=number){
            System.out.println("卖票 "+(++i));
        }
        /*available=false;
        notifyAll();*/
        if (i==number){
            available = false;
        }
        //售票后唤醒存票线程

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


}
