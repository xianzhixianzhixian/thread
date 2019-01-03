package wait.notifyall.backup;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-03 21:56
 */
public class ThreadA extends Thread {

    private BackupService backupService;

    public ThreadA(BackupService backupService) {
        this.backupService = backupService;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            backupService.backupA();
        }
    }
}
