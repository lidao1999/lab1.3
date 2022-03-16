public class BufferApp {

    public static void main(String[] args) {
        Buffer b= new Buffer(50);
        Producer p= new Producer(b);
        new Thread(p).start();
        Consumer c=new Consumer(b);
        new Thread(c).start();
        System.out.println("“I’m not running");
    }
}
