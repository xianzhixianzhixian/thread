package wait.notifyall.backup;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-03 21:56
 */
public class ThreadB extends Thread {

    private BackupService backupService;

    public ThreadB(BackupService backupService) {
        this.backupService = backupService;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            backupService.backupB();
        }
    }
}
