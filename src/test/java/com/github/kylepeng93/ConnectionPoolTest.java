package com.github.kylepeng93;

import com.github.kylepeng93.service.UserInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 线程池测试
 * https://kylepeng93.github.io
 *
 * @author pengkai
 * @date 2021-03-26 下午11:56
 */
@SpringBootTest
public class ConnectionPoolTest {
    @Autowired
    UserInfoService userInfoService;

    @Test
    public void useUpConnectionPoolTest() {
        for (int i = 0; i < 100; i++) {
            System.out.println("开始创建线程");
            new Thread(new DummyTask(i)).start();
        }
    }

    class DummyTask implements Runnable {
        private int id;
        public DummyTask(int i) {
            this.id = i;
        }
        @Override
        public void run() {
            System.out.println(userInfoService.getUserInfoById(1));
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.currentThread().wait(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("等待时间已经过去");
        }
    }

}
