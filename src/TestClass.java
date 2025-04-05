import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class TestClass {


    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {

//        Runnable task = () -> {
//            SingletonPatternExample.getInstance().display();
//        };
//
//        Thread thread1 = new Thread(task);
//        Thread thread2 = new Thread(task);
//        Thread thread3 = new Thread(task);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//
//        try{
//            thread1.join();
//            thread2.join();
//            thread3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        SingletonPatternExample instance1 = SingletonPatternExample.getInstance();
//        SingletonPatternExample instance2 = null;
//
//        try{
//            Constructor<SingletonPatternExample> declaredConstructor = SingletonPatternExample.class.getDeclaredConstructor();
//            declaredConstructor.setAccessible(true);
//            instance2 = declaredConstructor.newInstance();
//        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(instance1.hashCode());
//        System.out.println(instance2.hashCode());

        //Serialize SPE instance
//        SingletonPatternExample instance = SingletonPatternExample.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.json"));
//        oos.writeObject(instance);
//        oos.close();
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.json"));
//        SingletonPatternExample instance2 = (SingletonPatternExample) ois.readObject();
//        ois.close();
//
//        System.out.println(instance.hashCode());
//        System.out.println(instance2.hashCode());

//        SingletonPatternExample instance = SingletonPatternExample.getInstance();
//        System.out.println(instance.hashCode());
//        SingletonPatternExample instance2 = (SingletonPatternExample) instance.clone();
//        System.out.println(instance2.hashCode());

//        // Find Max, Second Max, Min and Second Min elements in an Array
//        int[] arr = {5,7,9,18,20,-9,12,-3,6,13,-10};
//
//        int min = Integer.MAX_VALUE;
//        int secondMin =Integer.MAX_VALUE;
//
//        int max = Integer.MIN_VALUE;
//        int secondMax =Integer.MIN_VALUE;
//
//        for(int j:arr) {
//            if(j > max) {
//                secondMax = max;
//                max = j;
//            } else if(j > secondMax) {
//                secondMax = j;
//            }
//        }
//
//        for (int j : arr) {
//            if (j < min) {
//                secondMin = min;
//                min = j;
//            } else if (j < secondMin) {
//                secondMin = j;
//            }
//        }
//
//        System.out.println(max+" "+secondMax);
//        System.out.println(min+" "+secondMin);
    }
}
