class Message {
    String text;
    Message(String text) {
        this.text = text;
    }
   public String toString() {
        return text;
   }
}
class SMS extends Message {
    String recipientContact;
    SMS(String text,String recipientContact) {
        super(text);
        this.recipientContact = recipientContact;
    }
    public String toString() {
        return text+recipientContact;
    }
}
class Email extends Message{
    String sender;
    String receiver;
    String subject;
    Email(String text,String sender,String receiver,String subject)
    {
        super(text);
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
    }
    public String toString() {
        return text+sender+receiver;
    }

}

public class Task2 {
    public static void main(String[] args){
        SMS msg = new SMS("memon kia hal hanfrc327kNJU7 ","031213645");
        Email e=new Email("Hello, Eid Mubarakh ","Saifullah","Abdullad","Eid Festival");
        System.out.println( msg.toString());
        System.out.println(e.toString());
    }
}
