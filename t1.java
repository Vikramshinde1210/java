import java.util.*;
import java.io.*;


public class t1 {
    public static void main(String[] args) throws Exception {
        int n;
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        ArrayList < String > a = new ArrayList < String > ();
        FileOutputStream fout = new FileOutputStream("Spells.txt");
        ObjectOutputStream s = new ObjectOutputStream(fout);

        HashMap < Character, ArrayList < String >> hm = new HashMap < Character, ArrayList < String >> ();
        do {
            System.out.println("Enter name:");
            s1 = sc.nextLine();
            char c = s1.charAt(0);
            if (hm.containsKey(c)) {
                a = hm.get(c);
                a.add(s1);
                hm.replace(c, a);
            } else {
                ArrayList < String > temp = new ArrayList < String > ();
                temp.add(s1);
                hm.put(c, temp);
            }
            System.out.println("Press 1 to continue");
            n = sc.nextInt();
            sc.nextLine();
        } while (n != 0);
        System.out.println(hm);
        s.writeObject(hm);
        System.out.println("Words Written to the file Successfully...!");
        System.out.println("Reading data from the file/deserialization");
        FileInputStream fin = new FileInputStream("Spells.txt");
        ObjectInputStream st = new ObjectInputStream(fin);
        HashMap < Character, ArrayList < String >> ht = new HashMap < Character, ArrayList < String >> ();
        ht = (HashMap < Character, ArrayList < String >> ) st.readObject();

        for (Map.Entry m: ht.entrySet()) {
            System.out.println(m.getKey() + "    " + m.getValue());
        }
    }
}