package com.duwei.multythread.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 此例相当于生产者消费者模型？
 * 利用Local的{@link Lock#lock}方法加锁，{@link Lock#unlock()}解锁
 * {@link Condition#await()} and {@link Condition#signal()}实现对对应锁的唤醒
 */
public class ConditionDemo {
    final Lock lock = new ReentrantLock();//锁对象
    final Condition writeCondition = lock.newCondition();//写线程条件
    final Condition readCondition = lock.newCondition();//读线程条件

    final Object[] items = new Object[100];//缓存队列
    int putptr/*写索引*/, takeptr/*读索引*/, count/*队列中存在的数据个数*/;

    public void put(Object x) throws InterruptedException {
        lock.lock();
        try {
            while (count == items.length)//如果队列满了
                writeCondition.await();//阻塞写线程
            items[putptr] = x;//赋值
            if (++putptr == items.length)
                putptr = 0;//如果写索引写到队列的最后一个位置了，那么置为0
            ++count;//个数++
            readCondition.signal();//唤醒读线程
        } finally {
            lock.unlock();
        }
    }

    public Object take() throws InterruptedException {
        lock.lock();
        try {
            while (count == 0)//如果队列为空
                readCondition.await();//阻塞读线程
            Object x = items[takeptr];//取值
            if (++takeptr == items.length)
                takeptr = 0;//如果读索引读到队列的最后一个位置了，那么置为0
            --count;//个数--
            writeCondition.signal();//唤醒写线程
            return x;
        } finally {
            lock.unlock();
        }
    }

}
