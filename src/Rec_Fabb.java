public class Rec_Fabb {
    public static int fabb(int n){
        int term=1;
        int Nterm=2;
        if(n<=1)return 0;
        return term+=Nterm+(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fabb(3));
    }
}
