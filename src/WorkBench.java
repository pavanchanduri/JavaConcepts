public class WorkBench {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Sam");
        Student s2 = new Student(1, "John");

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}