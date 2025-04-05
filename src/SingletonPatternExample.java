import java.io.Serial;
import java.io.Serializable;

public class SingletonPatternExample implements Serializable, Cloneable {

    private static SingletonPatternExample instance;

    private SingletonPatternExample() {
        if(instance != null) {
            throw new IllegalArgumentException("SingletonPatternExample is already instantiated");
        }
    }

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

    public void display() {
        System.out.println("This is a Singleton Pattern");
    }

    //This method is called during de-serialize process which will return the singleton class instance
    @Serial
    protected Object readResolve() {
        return getInstance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Clone not supported");
    }
}
