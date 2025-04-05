public class TestStrings {

    public static void testStringBuilderConversion() {

        String str = "1"+"2"+"3"+"4"+"5"+"6"+"7"+"8"+"9";
        String str1 = str.concat(str);
        System.out.println(str1);
    }

    public static void main(String[] args) {

        testStringBuilderConversion();
    }
}
