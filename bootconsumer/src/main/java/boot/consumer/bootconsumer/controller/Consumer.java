package boot.consumer.bootconsumer.controller;

/**
 * @Version 1.0
 * @Author yangjinbiao
 * @Date 2019/10/23 12:33
 */
public class Consumer implements Runnable {
    Tickets tickets = null;

    public Consumer(Tickets tickets){
        this.tickets=tickets;
    }
    @Override
    public void run() {
        //如果售票数小于限定总量，则可以售票
        while (tickets.getI()<tickets.getSize()){
            tickets.sell();
        }
    }
}
