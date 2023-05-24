package s10_bt_thêm.view;

import s10_bt_thêm.controller.VehicleManager;

public class Main {
    public static void main(String[] args) {
        VehicleManager vehicleManager = new VehicleManager();
        VehicleManager.showMenuVehicle();
//        String solution(String s) {
//
//            String[] arr = s.split("");
//            ArrayList<String> arrayList = new ArrayList<>();
//            for(int i = 0; i< arr.length; i++){
//                if(arr[i].equals(arr[i].toUpperCase())){
//                    arrayList.add(" ");
//                    arrayList.add(arr[i].toLowerCase());
//                }else{
//                    arrayList.add(arr[i]);
//                }
//            }
//            String a = "";
//            for (int i = 0; i < arrayList.size(); i++) {
//                a+=arrayList.get(i);
//            }
//            return a.trim();


//
//        int[] solution(int[] a) {
//            for (int i = 0; i < a.length; i++) {
//                for (int j = 0; j < a.length; j++) {
//                    int temp = 0;
//                    if (a[i] != -1 && a[j] != -1 && a[i] < a[j]) {
//                        temp = a[i];
//                        a[i]=a[j];
//                        a[j]=temp;
//                    }
//                }
//            }
//            return a;
//        }

//        }


//        boolean solution(int[] a) {
//            int [] arr = {1,2,3,3};
//            int sum1 =0;
//            int sum2 =0;
//            boolean flag = true;
//            if(arr.length<=3){
//                return false;
//            }
//            if(0<=arr.length&& arr.length<=10000){
//                for(int i =0; i < arr.length; i++){
//                    sum1+=arr[i];
//                }
//                for(int j = 0; j < arr.length; j++){
//                    sum2+=sum1-arr[j];
//                }
//                if(sum1==sum2){
//
//                }
//            }else {
//                flag = false;
//                return flag;
//            }
//            return flag;
//
//
//
//
//
//        }
    }
}
