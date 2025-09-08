public class Basic {
    public static void main(String[] args){
        // ways to use string
        String msg = new String("hey there!!");
        String data = "hello people";
        
        // concatenation 
        String concatString = msg +" Sakshi";
        
        // methods of string
        System.out.println("length of string "+concatString.length());
        System.out.println("start with " + concatString.startsWith("sad"));
        System.out.println("ends with " + concatString.endsWith("i"));
        System.out.println("index of " + concatString.indexOf("!"));
        System.out.println("replace " + concatString.replace("!",":)"));
    }    
}
