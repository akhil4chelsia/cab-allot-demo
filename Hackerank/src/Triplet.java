
public class Triplet {

    public static void main(String[] args) {

        int []  arr = {1, 4, 45, 6, 10, 8};
        int sum = 22;

        for(int i=0;i<arr.length;i++){
            for(int  j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==sum){
                        System.out.println("found triplet {"+arr[i]+","+arr[j]+","+arr[k]+"}");
                    }
                }
            }
        }
    }
}
