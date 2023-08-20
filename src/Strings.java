public class Strings {
    public static void main(String[] args) {
        String name = " Anis ";
        String name1 = "Anis";
        String name3 = "ANIS";
        String lastName = "Siam";
        String text = "Hello from java class";

        String name2 = new String("Anis");

        System.out.println(name == name1);//Ref
        System.out.println(name.equals(name1));//value
        System.out.println("10".equals("10"));
        System.out.println(name == name2);
        System.out.println(name.equals(name2));

        System.out.println(name.equalsIgnoreCase(name3));
        int l = name.length();
        System.out.println(l);

        System.out.println(name);
        name = name.trim();

        System.out.println(name);

        String url = "https://firebasestorage.googleapis.com/v0/b/postagic-prod.appspot.com/o/images%2FprofilePics%2F0aDcVlqhvWMeXS9c8oNjrZRrvxL2?alt=media&token=c3de5ce9-f5fc-41b7-8ede-8b454a5d6429";
        System.out.println(url.contains("images"));


        System.out.println(name + " " + lastName);
        System.out.println(name.concat(" " + lastName));

        System.out.println(name.toUpperCase());

        String firstName = "Anis";
        String lastName1 = "Siam";

        String fullName = firstName.concat( " " + lastName1);
        System.out.println(fullName);
        System.out.println(fullName.toUpperCase());

        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf("s"));
        System.out.println(text.indexOf("a"));
        System.out.println(text.lastIndexOf("a"));
        System.out.println(text.charAt(2));

        String line = "Java";

        System.out.println(line.charAt(0));
        System.out.println(line.charAt(1));
        System.out.println(line.charAt(2));
        System.out.println(line.charAt(3));
    }
}
