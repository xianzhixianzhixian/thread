package wait.notifyall.backup;

/**
 * 等待通知之交叉备份，10个线程将数据备份到A数据库，另外十个线程将数据备份到B数据库
 * @author: xianzhixianzhixian
 * @date: 2019-01-03 21:51
 */
public class BackupService {

    public String backupFlag = "A"; //备份标志，A则备份到A数据库，B则备份到B数据库

    synchronized public void backupA(){
        try {
            while (!backupFlag.equals("A")){
                //System.out.println(Thread.currentThread().getName()+" 等待备份A数据库");
                this.wait();
            }
            System.out.println(Thread.currentThread().getName()+" 将数据备份到A数据库");
            backupFlag = "B";
            this.notifyAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void backupB(){
        try {
            while (!backupFlag.equals("B")) {
                //System.out.println(Thread.currentThread().getName()+" 等待备份B数据库");
                this.wait();
            }
            System.out.println(Thread.currentThread().getName()+" 将数据备份到B数据库");
            backupFlag = "A";
            this.notifyAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
