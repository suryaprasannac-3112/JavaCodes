public class MultiDimArray {
    public static void main(String[] args){
        int nums[][] = new int[3][];

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];




        for(int i=0;i<nums.length;i++){

            for(int j=0;j<nums[i].length;j++){

                nums[i][j] = (int)(Math.random()*10); //the values created by random funtion are double values hence we need to type cast those values and the method need to be multiplied by 100
                //if we don't multiply the method by 100 no random values are going to be generated

            }
        }

        /*for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j] + " ");

            }
           System.out.println(); 
        }*/
        for(int n[] : nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println(); //it is not used to print the first row it is also used to print the elements in the array
        }

    }
}
