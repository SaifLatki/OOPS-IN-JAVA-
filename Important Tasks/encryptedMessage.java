import java.util.Scanner;
class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String msg="", enc = "";

        while (num!= 4) {
            System.out.println("1. Send a Secure and Encrypted Message\n" +
                    "\n" +
                    "2. View Encrypted message\n" +
                    "\n" +
                    "3. Decrypt and view the Original Message (Password Protected)\n" +
                    "\n" +
                    "4. Exit");
            System.out.println("Enter your choice: ");
            num = sc.nextInt();
            if (num == 1) {
                System.out.println("Enter the message you want to encrypt: ");
                sc.nextLine();
                msg = sc.next();
                char c[] = new char[msg.length()];
                for (int i = 0; i < msg.length(); i++) {
                    c[i] = msg.charAt(i);
                    c[i] += 5;
                }
                for (int i = 0; i < c.length; i++) {
                    enc += Character.toString(c[i]);
                }

            } else if (num == 2) {
                System.out.println("Encrypted message is : " + enc);

            } else if (num == 3) {
                System.out.println("Enter the password: ");
                String pass = sc.next();
                if (pass.equals( "ABC786")) {
                    System.out.println("Decrypted message is : " + msg);
                }
                else
                {
                    System.out.println("Wrong Password");
                }
            }
        }
    }
}

