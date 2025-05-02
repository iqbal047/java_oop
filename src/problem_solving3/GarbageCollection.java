package problem_solving3;

public class GarbageCollection {
    //57.How perform garbage collection in java Program
    public static void main(String [] args) throws Exception
    {
        Runtime rs = Runtime.getRuntime();
        System.out.println("Free memory in JVM before Garbage Collection = "+rs.freeMemory());
                rs.gc();
        System.out.println("Free memory in JVM after Garbage Collection = "+rs.freeMemory());
    }

}
