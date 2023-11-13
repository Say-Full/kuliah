import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesLinkedList
{
    public static void main(String[] args)
    {
        SingleLinkedList list = new SingleLinkedList();

        /*
        Node text1 = new Node();
        Node text2 = new Node();

        text1.setNgrams("Flying aircraft");
        text2.setNgrams("Flying duck");

        list.insertNode(text1);
        list.insertNode(text2);

        // Pertama masuk terakhir keluar (FILO)
        System.out.print("Linked list awal : ");
        list.display();

        list.deleteNode(0);
        System.out.print("\nLinked list setelah delete : ");
        list.display();
        */

        try {
            File myFile = new File("input.txt");
            Scanner fileReader = new Scanner(myFile);

            while(fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                Node temp = new Node();
                temp.setNgrams(data);
                list.insertNode(temp);
            }
            fileReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Terjadi kesalahan : " + e.getMessage());
            e.printStackTrace();
        }
        list.display();
    }    
}
