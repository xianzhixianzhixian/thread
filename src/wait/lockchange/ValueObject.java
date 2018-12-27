package wait.lockchange;

import java.util.ArrayList;
import java.util.List;

/**
 * 在使用wait/notify时，wait等待的条件发生变化的情况，并不是wait等待的锁发生变化的情况
 * @author: xianzhixianzhixian
 * @date: 2018-12-27 20:41
 */
public class ValueObject {
    public static List<String> list = new ArrayList<>();
}
