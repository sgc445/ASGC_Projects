package commandLine;

/**
 * Created by sgc on 2/10/16.
 */
public class Test {
        public static void main(String[] args) {
            int passed = 0;
            int failed = 0;
            for (String className : args) {
                try {
                    Class c = Class.forName(className);
                    c.getMethod("test").invoke(c.newInstance());
                    passed++;
                } catch (Exception ex) {
                    System.out.printf("%s failed: %s%n", className, ex);
                    failed++;
                }
            }
            System.out.printf("passed=%d; failed=%d%n", passed, failed);
        }

}
