import java.util.Scanner;

public class StringManipulate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        String output = reverseWords(input);
        System.out.println("Output: " + output);
        }
        public static String reverseWords(String s) {
            String[] f=s.split(" ");
            String l=" ";
            for(int i=0;i<f.length;i++){
                l+=revWord(f[i]);
                if(i<f.length-1) l+=" ";
            }
                return l.trim();
            }
        public static String revWord(String s3){
            char[] a=s3.toCharArray();
            int i=0;
            int j=a.length-1;
            while(i<j){
                char temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
            String s1=new String(a);
                return s1;
        }
    }
