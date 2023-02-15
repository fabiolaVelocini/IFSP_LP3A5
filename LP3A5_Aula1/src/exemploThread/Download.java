package exemploThread;

public class Download extends Thread {

    private String url;

    public Download(String url) {
        this.url = url;
    }

    public void run() {
            System.out.println("Thread '" + url + "' executando");

            try {
                Thread.sleep(2500);
                System.out.println("Thread '" + url + "' terminou de executar");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

}

