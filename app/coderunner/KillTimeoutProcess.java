package coderunner;

public class KillTimeoutProcess extends Thread {
    private final Process process;
    private final int seconds;

    KillTimeoutProcess(Process process, int seconds) {
        this.process = process;
        this.seconds = seconds;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(seconds * 1000);
            process.destroy();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
