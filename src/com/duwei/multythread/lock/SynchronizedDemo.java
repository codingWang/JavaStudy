package com.duwei.multythread.lock;

/**
 * 对象锁 VS 类锁
 */
public class SynchronizedDemo {
    /**
     * 对象锁
     */
    static class ObjectLock {
        public void test1() {
            synchronized (this) {
                int i = 5;
                while (i-- > 0) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ie) {
                    }
                }
            }
        }

        public synchronized void test2() {
            int i = 5;
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                }
            }
        }

        public static void main(String[] args) {
            ObjectLock myt2 = new ObjectLock();
            Thread test1 = new Thread(() -> myt2.test1(), "test1");
            Thread test2 = new Thread(() -> myt2.test2(), "test2");
            test1.start();
            test2.start();
//         TestRunnable tr=new TestRunnable();
//         Thread test3=new Thread(tr);
//         test3.start();
        }
    }

    /**
     * 类锁
     */
    static class ClazzLock {
        public void test1() {
            synchronized (ClazzLock.class) {
                int i = 5;
                while (i-- > 0) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ie) {
                    }
                }
            }
        }

        /**
         * 静态方法属于类
         */
        public static synchronized void test2() {
            int i = 5;
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                }
            }
        }

        public static void main(String[] args) {
            final ClazzLock myt2 = new ClazzLock();
            Thread test1 = new Thread(() -> myt2.test1(), "test1");
            Thread test2 = new Thread(() -> ClazzLock.test2(), "test2");
            test1.start();
            test2.start();
        }
    }

    /**
     * 对象锁和类锁
     */
    static class ObjectClazzLock {
        public synchronized void test1() {
            int i = 5;
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                }
            }
        }

        public static synchronized void test2() {
            int i = 5;
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                }
            }
        }

        public static void main(String[] args) {
            final ObjectClazzLock myt2 = new ObjectClazzLock();
            Thread test1 = new Thread(() -> myt2.test1(), "test1");
            Thread test2 = new Thread(() -> ObjectClazzLock.test2(), "test2");
            test1.start();
            test2.start();
        }
    }
}
