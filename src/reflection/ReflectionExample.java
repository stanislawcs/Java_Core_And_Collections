package reflection;

public class ReflectionExample {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        ReflectionChecker rc = new ReflectionChecker();
        Rabbit rabbit  = new Rabbit();

        rc.showClassName(rabbit);
        rc.showClassFields(rabbit);
        rc.showClassMethods(rabbit);

        rc.showFieldsAnnotations(rabbit);

        Object clone = rc.createNewObject(rabbit);

        rc.showClassName(clone);

    }
}
