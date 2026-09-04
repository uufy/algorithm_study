public class question283 {
    public static void main(String[] args) {
        int index=0,flag=0;
        int[] nums = {0,1,0,3,12,0,0,0,0,0,0,7,98,0,64,0,77,0,0,0};


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && flag==0){
                index=i;
                flag++;
            }
            if (nums[i]!=0 && nums[index]==0){
                nums[index]=nums[i];
                nums[i]=0;
                for (int j = index; j < nums.length; j++) {
                    if (nums[j]==0){
                        index=j;
                        break;
                    }
                }

            }
        }


        for (int i = 0; i < nums.length; i++) {
            if (i==0){
                System.out.print("[");
            }
            if (i!=nums.length-1){
                System.out.print(nums[i]+",");
            }
            if (i==nums.length-1){
                System.out.print(nums[i]+"]");
            }
        }


    }
}
