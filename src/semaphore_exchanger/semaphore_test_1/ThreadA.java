package semaphore_exchanger.semaphore_test_1;

/**
 * @author HT
 * @version V1.0
 * @package semaphore_exchanger.Semaphore_Test_1
 * @date 2019-03-26 11:09
 */
public class ThreadA extends Thread{
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
