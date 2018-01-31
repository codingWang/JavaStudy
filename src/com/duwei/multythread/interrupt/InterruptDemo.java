package com.duwei.multythread.interrupt;

import javafx.concurrent.Task;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * 线程中断相关Demo
 * <p>
 * https://www.ibm.com/developerworks/cn/java/j-jtp05236.html
 */
public class InterruptDemo {


    /**
     * 001:将中断异常向上抛出，外部调用者处理，告诉调用者这是一个堵塞方法
     */
    public static class TaskQueue {
        private static final int MAX_TASKS = 1000;

        private BlockingQueue<Runnable> queue
                = new LinkedBlockingQueue<Runnable>(MAX_TASKS);

        public void putTask(Runnable r) throws InterruptedException {
            queue.put(r);
        }

        public Runnable getTask() throws InterruptedException {
            return queue.take();
        }
    }

    /**
     * 002:在抛出异常之前进行清理操作,模拟匹配玩家游戏
     */
    public static class PlayerMatcher {
        private PlayerSource players;

        public PlayerMatcher(PlayerSource players) {
            this.players = players;
        }

        public void matchPlayers() throws InterruptedException {
            Player playerOne = null, playerTwo = null;
            try {
                while (true) {
                    // Wait for two players to arrive and start a new game
                    playerOne = players.waitForPlayer(); // could throw IE
                    playerTwo = players.waitForPlayer(); // could throw IE
                    startNewGame(playerOne, playerTwo);
                }
            } catch (InterruptedException e) {
                // If we got one player and were interrupted, put that player back
                if (playerOne != null)
                    players.addFirst(playerOne);
                // Then propagate the exception
                throw e;
            }
        }

        private void startNewGame(Player playerOne, Player playerTwo) {
        }

        private static class PlayerSource {
            public Player waitForPlayer() throws InterruptedException {
                return null;
            }

            public void addFirst(Player playerOne) {
            }
        }

        private static class Player {
        }
    }

    /**
     * 003:不可抛出的时候要捕获再中断
     */
    public static class TaskRunner implements Runnable {
        private BlockingQueue<Task> queue;

        public TaskRunner(BlockingQueue<Task> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    Task task = queue.take();//这里不能抛，只能try-catch
                    task.execute();
                }
            } catch (InterruptedException e) {
                // Restore the interrupted status
                Thread.currentThread().interrupt();
            }
        }

        private static class Task {
            public void execute(){}
        }
    }

}
