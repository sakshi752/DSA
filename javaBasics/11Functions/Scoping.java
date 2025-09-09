public class Scoping {
    public static void main(String[] args) {
        int a =20;
        System.out.println("a before "+a);

        {
            // this is block scope and what is happening in here cannot be used outside of this block
            int val = 78;


            // int a =100 same variable cannot be initialized here but it can be reassigned
            a=100; 
            System.out.println("a after in block scope "+a);
        }
        System.out.println("a after"+a);
    }    

    static void random(){
        // System.out.println(a); here is can't be used as it is not present in current function scope
    }
}
