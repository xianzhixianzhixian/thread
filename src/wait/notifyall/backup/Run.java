package wait.notifyall.backup;

/**
 * @author: xianzhixianzhixian
 * @date: 2019-01-03 22:00
 */
public class Run {

    public static void main(String[] args) {
        BackupService backupService = new BackupService();
        ThreadA[] threadAArray = new ThreadA[10];
        ThreadB[] threadBArray = new ThreadB[10];

        for (int i = 0; i < 10; i++) {
            threadAArray[i] = new ThreadA(backupService);
            threadAArray[i].start();
            threadBArray[i] = new ThreadB(backupService);
            threadBArray[i].start();
        }
    }
}
