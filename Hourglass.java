import java.util.Scanner;
class Hourglass
{
    public static void main(String args[]){
        int array[][] = new int[6][6];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<6;i++){
            for(int j = 0;j<6;j++)
            array[i][j] = sc.nextInt();
        }
        int h = -100;
        for(int m=0;m<4;m++){
            for(int n=0;n<4;n++){
                int num=array[m][n];
                int num1=array[m][n+1];
                int num2=array[m][n+2];
                int num3=array[m+1][n+1];
                int num4=array[m+2][n];
                int num5=array[m+2][n+1];
                int num6=array[m+2][n+2];
                int sum = num+num1+num2+num3+num4+num5+num6;
                if(sum>h)
                h=sum;
            }
        } System.out.println(h);
    }
}
