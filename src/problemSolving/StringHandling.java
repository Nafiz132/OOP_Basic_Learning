package problemSolving;

public class StringHandling {

    public static void main(String[] args) {

        System.out.println("String Handling :");
        String s = "This is the test string";
        System.out.println(s);
        System.out.println(s.charAt(0));
        char c[] = s.toCharArray();
        for (char t : c) {
            System.out.print(t + ":");
        }
        System.out.println("");
        char a[] = new char[6];
        System.out.println(s.substring(17, 23));
        s.getChars(17, 23, a, 0);
        for (char t : a) {
            System.out.print(t + ":");
        }
        System.out.println("");
        String s2 = new String(a);
        System.out.println(s2);
        String s3 = new String(c, 8, 3);
        System.out.println(s3);
        System.out.println(s3.equals("the"));
        System.out.println(s3.equals("THE"));
        System.out.println(s3.equalsIgnoreCase("THE"));
        System.out.println(s.startsWith(s2));
        System.out.println(s.endsWith(s2));
        System.out.println(s2.compareTo("string"));
        System.out.println(s2.compareTo("this"));
        System.out.println(s2.compareTo("is"));
        System.out.println(s.indexOf(s3));
        System.out.println(s.replace('s', 'x'));
        StringBuffer ss = new StringBuffer(s);
        System.out.println(ss);
        //s.setCharAt(17, 'S');
        ss.setCharAt(17, 'S');
        System.out.println(ss);
        ss.append("Buffer");
        System.out.println(ss);
        ss.replace(12, 16, "new");
        System.out.println(ss);
    }

}
