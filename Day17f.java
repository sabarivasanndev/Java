class Day17f
{
    public static void main(String[] args) throws Exception

    {
       Object o = Class.forName(args[0]).newInstance();
       System.out.println(o.getClass().getName());

    }
}