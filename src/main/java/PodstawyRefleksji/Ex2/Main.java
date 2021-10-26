package PodstawyRefleksji.Ex2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.NoSuchFileException;


public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException, NoSuchFileException, NoSuchFieldException {


        StudentExt studentExt = (StudentExt)
                Class.forName("reflection_api.StudentExt")
                        .getConstructor(String.class, String.class, Integer.class, String.class)
                        .newInstance("John", "Dorsz", 10, "Economies");
        System.out.println(studentExt);

        Field nameField = studentExt.getClass()
                .getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(studentExt, "Johnson");

        Field lastNameField = studentExt.getClass().getDeclaredField("lastname");
        lastNameField.setAccessible(true);
        lastNameField.set(studentExt, "Spring");

        String name = (String)
                studentExt.getClass().getMethod("getName").invoke(studentExt);
        System.out.println(name);

        String lastname = (String)
                studentExt.getClass().getMethod("getLastName").invoke(studentExt);
        System.out.println(lastname);

        String typOfStudies = (String)
                studentExt.getClass().getMethod("getTypeOfStudents").invoke(studentExt);
        System.out.println(typOfStudies);

        int index = (Integer)
                studentExt.getClass().getMethod("getIndex").invoke(studentExt);
        System.out.println(index);

    }
}
