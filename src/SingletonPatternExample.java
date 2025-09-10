import java.io.Serial;
import java.io.Serializable;

public class SingletonPatternExample implements Serializable, Cloneable {

    private static SingletonPatternExample instance;

    /**
     * Private constructor to prevent instantiation from outside the class.
     * This ensures that only one instance of SingletonPatternExample can exist.    
     * This constructor throws an exception if an instance already exists,
     * enforcing the singleton property.
     * This is to prevent reflection-based instantiation.
     * @throws IllegalArgumentException if an instance already exists.
     */
    private SingletonPatternExample() {
        if(instance != null) {
            throw new IllegalArgumentException("SingletonPatternExample is already instantiated");
        }
    }

    /**
     * Method to provide a global point of access to the SingletonPatternExample instance.
     * This method uses double-checked locking to ensure that the instance is created
     * only when it is needed and to avoid synchronization overhead after the instance is created.
     * This is thread-safe and ensures that only one instance is created even in a multi-threaded environment.
     * @return the single instance of SingletonPatternExample
     */
    public static SingletonPatternExample getInstance() {
        if (instance == null) {
            synchronized (SingletonPatternExample.class) {
                if (instance == null) {
                    instance = new SingletonPatternExample();
                }
            }
        }
        return instance;
    }

    /**
     * Method to demonstrate the functionality of the SingletonPatternExample.
     * This method can be called to show that the singleton instance is working as expected.
     */
    public void display() {
        System.out.println("This is a Singleton Pattern");
    }

    /**
     * This method is used to ensure that the singleton instance is preserved during serialization.
     * When the object is deserialized, this method returns the singleton instance,
     * ensuring that the singleton property is maintained.
     * @return the singleton instance of SingletonPatternExample
     */
    @Serial
    protected Object readResolve() {
        return getInstance();
    }

    /**
     * This method is overridden to prevent cloning of the singleton instance.
     * If cloning is attempted, it will throw a CloneNotSupportedException,
     * ensuring that the singleton property is maintained.
     * @return nothing, as cloning is not supported
     * @throws CloneNotSupportedException if cloning is attempted
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Clone not supported");
    }
}
