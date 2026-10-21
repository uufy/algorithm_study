public class question11 {
    public static void main(String[] args) {
        //双指针原来是有前后两个指针，然后移动较小的指针，不是遍历
        int[] height = {1,8,6,2,5,4,8,3,7};
        int index_front=0,index_back=height.length-1,max=0,temp=0;
        boolean flag=true;

        while (true){
            temp=index_back-index_front;
            flag=height[index_front]>height[index_back];
            if (flag){
                temp=temp*height[index_back];
                index_back--;
            }else {
                temp=temp*height[index_front];
                index_front++;
            }
            if (temp>max){
                max=temp;
            }

            if (index_front>index_back){
                break;
            }

        }


        System.out.println(max);


    }
}







//有很多变量的，i这一层只需要1/2

//public static void main(String[] args) {
//
//    int[] height = {1,8,6,2,5,4,8,3,7};
//    int temp=0,temp2=0,max=0;
//    int i1=0,i2=0;
//    int result=0,result2=0,index_back=0;
//    for (int i = 0; i < height.length; i++) {
//        index_back = height.length-i-1;
//        i1=height[i];
//        i2=height[index_back];
//        if (i>index_back){
//            break;
//        }
//        for (int j = i+1; j < height.length; j++) {
//            result = i>j ? i-j : j-i;
//            result2 = index_back>j ? index_back-j : j-index_back;
//
//            //前面
//            if (i1>height[j]){
//                temp=height[j]*result;
//            }else {
//                temp=i1*result;
//            }
//            //后面
//            if (i2>height[j]){
//                temp2=height[j]*result2;
//            }else {
//                temp2=i2*result2;
//            }
//
//            if (temp>temp2){
//                if (temp>max) {
//                    max = temp;
//                }
//            }else {
//                if (temp2>max){
//                    max = temp2;
//                }
//            }
//
//
//
//
//
//
//
//
//
////                if (height[i]>height[j]){
////                    temp=height[j]*(i-j);
////                }else {
////                    temp=height[i]*(i-j);
////                }
////                if (temp>0) {
////                    if (temp > max) {
////                        max = temp;
////                    }
////                }else {
////                    if (-temp > max) {
////                        max = -temp;
////                    }
////                }
//        }
//    }
//
//    System.out.println(max);
//
//
//}

