package wait.notifyall.backup;

/**
 * 书本上的备份服务
 * @author: xianzhixianzhixian
 * @date: 2019-01-03 22:05
 */
public class BackupServiceInBook {

    volatile private boolean prevIsA = false;

    synchronized public void backupA(){
        try {
            while (prevIsA == true){
                this.wait();
            }
            for (int i = 0; i< 5; i++){
                System.out.println("★★★★★");
            }
            prevIsA = false;
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void backupB(){
        try {
            while (prevIsA == false){
                this.wait();
            }
            for (int i = 0; i< 5; i++){
                System.out.println("☆☆☆☆☆");
            }
            prevIsA = true;
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
