import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class SingletonPatternTest {


    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {

        // Test Singleton Pattern with multithreading
       Runnable task = () -> {
           SingletonPatternExample.getInstance().display();
       };

       Thread thread1 = new Thread(task); // Create multiple threads to test singleton instance
       Thread thread2 = new Thread(task); // Ensure that only one instance is created
       Thread thread3 = new Thread(task); // Each thread should access the same instance

       thread1.start(); // Start threads
       thread2.start();
       thread3.start();

       try{
           thread1.join(); // Wait for threads to finish
           thread2.join(); // Ensure that all threads have completed execution
           thread3.join(); // This ensures that the main thread waits for the completion of all threads
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

       SingletonPatternExample clonedInstance = (SingletonPatternExample) SingletonPatternExample.getInstance().clone();
       System.out.println("Cloned instance hash code: " + clonedInstance.hashCode());

        // Test Singleton Pattern with reflection
       SingletonPatternExample instance1 = SingletonPatternExample.getInstance();
       SingletonPatternExample instance2 = null;
         
       // Attempt to create a new instance using reflection
       // This should not create a new instance, but rather return the existing one
       try{
           Constructor<SingletonPatternExample> declaredConstructor = SingletonPatternExample.class.getDeclaredConstructor();
           declaredConstructor.setAccessible(true);
           instance2 = declaredConstructor.newInstance();
       } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
           throw new RuntimeException(e);
       }

       System.out.println(instance1.hashCode());
       System.out.println(instance2.hashCode());

       //Serialize SPE instance
       SingletonPatternExample instance = SingletonPatternExample.getInstance();
       ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.json"));
       oos.writeObject(instance);
       oos.close();

       ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.json"));
       instance2 = (SingletonPatternExample) ois.readObject();
       ois.close();

       System.out.println(instance.hashCode());
       System.out.println(instance2.hashCode());

       instance = SingletonPatternExample.getInstance();
       System.out.println(instance.hashCode());
       instance2 = (SingletonPatternExample) instance.clone();
       System.out.println(instance2.hashCode());
    }
}
