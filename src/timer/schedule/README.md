schedule(TimerTask task, Date time)的作用
<br/>
在指定的时间执行任务，如果指定时间早于当前时间则立即执行任务，如果指定时间晚于当前时间则等待到指定时间再执行任务


TimerTask类中的cancel()的作用
<br/>
TimerTask的cancel()方法cancel()方法作用是将自身从任务队列中清除，其它任务不受影响

Timer类的cancel()的作用
<br/>
Timer类中的cancel()方法的作用是将任务队列中的全部任务清空

schedule(TimerTask task, long delay)的作用
<br/>
以当前时间为参考，在此时间基础上延迟指定时间的毫秒数后执行一次TimerTask任务

schedule(TimerTask task, Date firstTime, long period)的作用
<br/>
在指定日期之后，按指定的间隔周期性地无限地执行某一任务

schedule(TimerTask task,long delay,long period)的作用
<br/>
以当前时间为参考，在此时间基础上延迟指定毫秒数，再以某一时间间隔无限次数地执行某一任务