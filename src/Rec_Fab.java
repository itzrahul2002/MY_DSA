public class Rec_Fab {
    public static int fab(int n){
        int sum=0;
        int next=1;
        if(n>=0){
            sum+=next+fab(n-1);
        }
        else {
            return 1;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(fab(9));
//        for (int i = 0; i < n; i++) {
//
//            System.out.print(fab(i) + " ");
//        }

    }
}
