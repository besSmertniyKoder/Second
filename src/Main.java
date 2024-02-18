import java.io.FileWriter;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
//        String s1 = "hello ";
//        String s2 = "java";
//        System.out.println(s1 + s2);
//        StringBuilder builder = new StringBuilder();
//        System.out.println(builder.append(s1).replace(2,4, "hi"));
//        StringBuffer stringBuffer = new StringBuffer();
        Logger logger = Logger.getAnonymousLogger();
        int a = 8;
        int b = 0;
        try {
            FileWriter fileWriter = new FileWriter("text.txt");
            fileWriter.write("I love and hate java!");
            System.out.println("file wrote successfully");
            logger.info("try block");
           int  c= a/b;
            fileWriter.close();
        } catch (Exception e) {
            logger.warning("err!");
            System.out.println("divide by zero here! ");
        }


    }
}
