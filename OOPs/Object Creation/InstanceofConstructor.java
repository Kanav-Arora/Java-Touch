/*

    Use of newInstance() method of Constructor class to create an object.

*/


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class InstanceofConstructor {
    String name;

    private InstanceofConstructor(String name)
    {
        this.name = name;
    }

    public static void main(String[] args) {

        try {
            Constructor<InstanceofConstructor> constructor = InstanceofConstructor.class.getDeclaredConstructor(String.class);

            InstanceofConstructor r = constructor.newInstance("Kanav");
            System.out.println(r.name);
        }  catch (InstantiationException e) {

            e.printStackTrace();
        }
        catch (NoSuchMethodException e) {

            e.printStackTrace();
        }

        catch (IllegalAccessException e) {

            e.printStackTrace();
        } catch (IllegalArgumentException e) {

            e.printStackTrace();
        } catch (InvocationTargetException e) {

            e.printStackTrace();
        }  catch (SecurityException e) {

            e.printStackTrace();
        }

    }


}
