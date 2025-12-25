package Task;

public class Lab003_Ternary {
    public static void main(String []args) {
int n1 = 2;
int n2 = 9;
int n3 = -11;
int max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
System.out.println("MAX OUT OF THREE "  +  max);
}
        }