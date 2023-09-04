public class InnerClassConcept {
    private int x=10;
    private class SubInnerClass
    {
        int y=5;
    }
        public static void main(String[] args) {
            InnerClassConcept.SubInnerClass in= new InnerClassConcept().new SubInnerClass();
            System.out.println(in.y);
            InnerClassConcept out= new InnerClassConcept();
            System.out.println(out.x);

        }

}
