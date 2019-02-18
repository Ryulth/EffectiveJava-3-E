package chapter6;
import java.lang.annotation.*;
import java.lang.reflect.*;

/* marker annotation */
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker { }

class Marker {
    /* annotate the method using marker.
     *  Notice that no { } is needed
     */
    //@Vehicle2
    @MyMarker
    public static void myMethod(Object obj) {
        System.out.println(obj.getClass());
        try {

            Method m = obj.getClass().getMethod("myMethod");

            /* specify if the annotation is present */
            if(m.isAnnotationPresent(MyMarker.class))
                System.out.println("MyMarker is present");

        } catch(NoSuchMethodException exc) {

            System.out.println("Method not found..!!");
        }
    }

    public static void main(String args[])
    {
        myMethod(new Marker());
    }
}

