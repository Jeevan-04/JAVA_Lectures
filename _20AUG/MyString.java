package _20AUG;

public class MyString {
    public static void main(String[] args) {
        String s1 = "java";
        char ch[] = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String s2 = new String(ch);
        String s3 = new String("example");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("Hello".substring(2, 5));

        String s4 = "Hello";
        String s5 = "World";
        System.out.println(s4.concat(s5));

        String s6="Learn Share Learn";
        System.out.println(s6.indexOf("Share"));

        System.out.println("Play");

        //
        System.out.println(s6.indexOf("ea",3));

        //Equals ->returning boolean
        System.out.println("world".equals("world"));
        System.out.println("World".equals("world"));


        System.out.println("World".equalsIgnoreCase("world"));

        String s7="hello";
        String s8="hello";
        String s9="meklo";
        String s10="hemlo";
        String s11="flag";
        String s12="";

        System.out.println(s7.compareTo(s8));
        System.out.println(s7.compareTo(s9));
        System.out.println(s7.compareTo(s10));
        System.out.println(s7.compareTo(s11));
        System.out.println(s7.compareTo(s12)); //here length wil be printed
        System.out.println(s12.compareTo(s7)); //here length wil be calculated

        String s13= "Book";
        String s14= "book";
        String s15= "look";
        String s16= "abc";
        String s17= "BEEN";

        System.out.println(s13.compareToIgnoreCase(s14));
        System.out.println(s13.compareToIgnoreCase(s15));
        System.out.println(s13.compareToIgnoreCase(s16));
        System.out.println(s13.compareToIgnoreCase(s17));

        String s18="Hello";
        System.out.println(s18.toLowerCase());

        String s19="HeLLo";
        System.out.println(s19.toUpperCase());

        String s20=" Learn Share Learn ";
        System.out.println(s20.trim());

        String s21="fadaf";
        System.out.println(s21.replace('f','r'));

        String s22 ="hello";
        char []ch1=s22.toCharArray();
        for(int i=0;i<ch1.length;i++)
        {
            System.out.print(ch1[i]+" ");
        }
        System.out.println();
        String result = String.join(" ","Alpha","Beta","Gamma");
        System.out.println(result);

        result = String.join(", ","John","ID#: 569","E-mail: John@HerbSchildt.com");
        System.out.println(result);


        String s23="Welcome to Java world";
        int count=0;
        for(int i=0;i<=s23.length()-1;i++)
        {
            if(s23.charAt(i)=='o')
            {
                count++;
            }
        }
        System.out.println("Frequency of t is:"+count);


        StringBuilder s24=new StringBuilder("Hello WOrld");
        System.out.println(s24);
        StringBuilder reverseS24 = s24.reverse();
        System.out.println("Reverse String=  "+reverseS24);
        System.out.println("Modified StringBuilder= "+s24);

        StringBuilder s25=new StringBuilder();
        System.out.println("Capacity of StringBuilder= "+s25.capacity());

        s25.append("Hello");
        s25.append(" ");
        s25.append("world!");
        System.out.println(s25.toString());

        s25.insert(6,"beautiful");
        System.out.println(s25.toString());

        StringBuilder s26=new StringBuilder("Hello");
        s26.replace(1,3,"Java");
        System.out.println("After replace() string= "+s26.toString());

        StringBuilder s27= new StringBuilder("hello");
        s27.delete(1,3);
        System.out.println(s27);

        StringBuilder s28=new StringBuilder();
        System.out.println(s28.capacity());
        s28.append("Hello");
        System.out.println(s28.capacity());

        s28.append("Java is my favourite language");
        System.out.println(s28.capacity());

        
    }
}
