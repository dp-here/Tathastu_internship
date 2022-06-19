public class revstr{
    public static void main(String args[]) {
    String str="Jeepsy",rev="";
    char ch;
    for(int i=0;i<str.length();i++){
        ch=str.charAt(i);
        rev=ch+rev;
    }

      System.out.println("Reversed string is " + rev);
    }
}