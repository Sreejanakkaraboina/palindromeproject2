public class Palindrome{
    public static void main(String[] args){
        if(args.length==0){
            system.out.println("Please a provide a word to check");
            return;
        }
        String word=args[0];
        if(isPalindrome(word)){
            system.out.println(word+"is a palindrome");
        }
        else{
            system.out.println(word+"is not a palindrome");
        }
        public static boolean isPalindrome(String str){
            String reversed=newStringBuilder(str).reverse().toString();
            return str.equalsIgnoreCase(reversed);
        }
    }
}