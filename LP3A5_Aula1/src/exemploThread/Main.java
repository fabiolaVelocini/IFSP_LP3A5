package exemploThread;

public class Main {

    public static void main(String [] args) {
        String[] urls = {
                "file1.txt",
                "file2.txt",
                "file3.txt",
                "file4.txt",
                "file5.txt",
                "file6.txt"
        };

        for(String url : urls) {
            Download download = new Download(url);
            //download.run();
            download.start(); //Inicia a thread
        }

    }

}
