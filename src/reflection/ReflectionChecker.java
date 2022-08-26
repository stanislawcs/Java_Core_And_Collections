package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionChecker {
    public void showClassName(Object obj) {

        //получение экземпляра типа Class с помомщью метода getClass() у любого экземпляра любого класса
        //таже можно получить экземпляр класса Class вот так ИмяКласса.class

        Class clas = obj.getClass();
        System.out.println(clas.getName());

//        Class clas1 = Object.class;
//        System.out.println(clas1.getName());

    }

    public void showClassFields(Object obj) {
        Class clazz = obj.getClass();
        //получение всех полей класса
        Field[] field = clazz.getFields();
        for (Field f : field) {
            System.out.println(f);
        }

        //получение одного поля класса
        try {
            System.out.println(clazz.getField("name"));
        } catch (NoSuchFieldException e) {
            System.out.println("Поле не было найдено");
        }
        //получение полей любых модификаторов доступа
        Field[] field1 = clazz.getDeclaredFields();
        for (Field f1 : field1) {
            System.out.println(f1);
        }



    }

    public void showClassMethods(Object obj) {
        Class clazz = obj.getClass();
        //получение методов объекта/класса
        Method[] methods = clazz.getMethods();
        for (Method meth : methods) {
            System.out.println(meth);
        }

    }

    public void showFieldsAnnotations(Object obj) {
        Class clazz = obj.getClass();
        //получение аннотаций на полях
        Field[] field = clazz.getDeclaredFields();

        for (Field f : field) {
            Annotation[] annotations = f.getAnnotations();

            for (Annotation annotation : annotations) {
                System.out.println(f.getName() + ": " + annotation.toString());
            }

        }

    }


//создание объекта неизвестного ранее класса
    //если будет непустой констуктор то выюросится исключение
    public Object createNewObject(Object object) throws InstantiationException, IllegalAccessException {
        Class clazz = object.getClass();
        return clazz.newInstance();

    }

}
