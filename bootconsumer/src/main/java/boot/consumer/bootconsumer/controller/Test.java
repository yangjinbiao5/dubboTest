package boot.consumer.bootconsumer.controller;

import org.springframework.util.StringUtils;

import java.io.*;
import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.BiConsumer;

/**
 * @Version 1.0
 * @Author yangjinbiao
 * @Date 2019/10/22 4:53
 */
public class Test  {

    public static void main(String[] args) throws IOException {
        Tickets tickets = new Tickets(10);
        Thread thread1 =new Thread(new Consumer(tickets),"thread1");
        thread1.start();
        Thread thread2 = new Thread(new Producer(tickets),"thread2");
        thread2.start();

    }

}

