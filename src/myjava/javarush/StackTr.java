package javarush;
public class StackTr
{
    public static void main(String[] args) throws Exception
    {
        System.out.println(method1());
    }

    public static String method1()
    {
        method2();
        //�������� ��� ��� ���
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println(name);
        return name;
    }

    public static String method2()
    {
        method3();
        //�������� ��� ��� ���
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println(name);
        return name;
    }

    public static String method3()
    {
        method4();
        //�������� ��� ��� ���
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println(name);
        return name;
    }

    public static String method4()
    {
        method5();
        //        �������� ��� ��� ���
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println(name);
        return name;
    }

    public static String method5()
    {
        //�������� ��� ��� ���
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            String name = stackTraceElements[2].getMethodName();
        System.out.println(name);
        return name;


    }
}