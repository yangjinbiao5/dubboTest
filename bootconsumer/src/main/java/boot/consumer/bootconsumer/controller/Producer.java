package boot.consumer.bootconsumer.controller;

/**
 * @Version 1.0
 * @Author yangjinbiao
 * @Date 2019/10/23 12:26
 */
public class Producer implements Runnable {
    Tickets tickets=null;
    public Producer(Tickets tickets){
        this.tickets=tickets;
    }
    @Override
    public void run() {
        //如果存票数小于限定总量，则可以存入票
        while (tickets.getNumber()<tickets.getSize()){
            tickets.put();
        }
    }
}
