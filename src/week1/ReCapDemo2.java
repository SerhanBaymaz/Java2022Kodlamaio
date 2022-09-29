package week1;

public class ReCapDemo2 {
    public static void main(String[] args) {
        //creating array
        double[] arr = {1.2, 2.3, 3.4, 4.5, 5.6, 8.8};

        //read the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",  ");
        }



        double sum=0;
        double maxNumber = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            //sum of the elements
            sum+=arr[i];

            //finding the max number in the array
            if (arr[i]>maxNumber){
                maxNumber = arr[i];
            }
        }
        System.out.println("\n Sum of the elements : "+sum);
        System.out.println("Our max number in the array is : " + maxNumber);

    }
}
