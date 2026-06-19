public class MessagePrinter {
    public void printMessage(String name){
        System.out.println("Hello "+ name);
    }
    public static void main(String[] args) {
        MessagePrinter m = new MessagePrinter();
        m.printMessage("dulara");
    }
}
