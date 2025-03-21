package beginnerlevel.AnnotationForMarkImportantMethods;

import java.lang.reflect.Method;
// Creating class ImportantMethodsClass to mark important methods using Custom annotation
public class ImportantMethodsClass
{
    @ImportantMethod(level = "HIGH")
    public void criticalOperation()
    {
        System.out.println("Critical Operation");
    }

    @ImportantMethod(level = "MEDIUM")
    public void importantOperation()
    {
        System.out.println("Important Operation");
    }

    public static void main(String[] args) throws Exception
    {
        // Creating object of the class
        ImportantMethodsClass obj = new ImportantMethodsClass();
        // Calling methods of the class
        obj.criticalOperation();
        obj.importantOperation();

        Method[] methods = ImportantMethodsClass.class.getMethods();
        for (Method method : methods)
        {
            if (method.isAnnotationPresent(ImportantMethod.class))
            {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method : " + method.getName() + ", Level : " + annotation.level());
            }
        }
    }
}

