package singleton;


import entity.User;

// Double Checked Locking based Java implementation of
// singleton design pattern
public class Singleton
{
//    private static volatile User obj  = null;
//
//    private Singleton() {}
//
//    public static User getInstance()
//    {
//        if (obj == null)
//        {
//            // To make thread safe
//            synchronized (Singleton.class)
//            {
//                // check again as multiple threads
//                // can reach above step
//                if (obj==null)
//                    obj = new User("singletonUser","Single","Ton");
//            }
//        }
//        return obj;
//    }
}

