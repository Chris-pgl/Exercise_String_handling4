public class Main {
    public static void main(String[] args) {

        String veryLongString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        veryLongString = veryLongString.replaceAll("um","HUM");

        System.out.println(veryLongString.indexOf("aliquip"));

        String sub1 = veryLongString.substring(0,200);
        String sub2 = veryLongString.substring(200);

        System.out.println(sub1.trim()+sub2.trim());

        boolean c = sub1.contains("est");
        boolean b = sub2.contains("est");

        boolean result = c^b;
        System.out.println(result);



    }

}