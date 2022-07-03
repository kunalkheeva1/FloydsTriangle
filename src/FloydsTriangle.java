import jdk.swing.interop.SwingInterOpUtils;

public class FloydsTriangle {

    public static void floydsTriangle(int row){
        int number =1;
        for(int i=1; i<=row; i++){
            for(int j= 1; j<=i; j++){
                System.out.print(number +" ");
                number++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        floydsTriangle(4);

    }
}
