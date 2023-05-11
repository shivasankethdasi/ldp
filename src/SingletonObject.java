package singleton;

public class SingletonObject {
    private static SingletonObject objInstance = null;
    private SingletonObject() {}

    public static SingletonObject getInstance() {
        if(objInstance == null) {
            synchronized (SingletonObject.class) {
                if(objInstance == null) {
                    return objInstance;
                }               objInstance = new SingletonObject();
                }
            }
        }

}
