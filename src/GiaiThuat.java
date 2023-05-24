import java.util.ArrayList;

public class GiaiThuat {
////Chương trình sửa lại xâu kí tự:
//        //Cho một xâu kí tự s gồm nhiều từ. Trong đó mỗi từ sẽ được bắt đầu bởi một kí tự in hoa.
//        //Vì một lí do gì đó, người ta quên chèn các khoảng trắng giữa các từ.
//        //Hãy viết chương trình sửa lại xâu kí tự đó theo yêu cầu sau:
//        //
//        //Tách các từ, và thêm 1 kí tự cách (space) giữa 2 từ liên tiếp
//        //Chuyển đổi các kí tự in hoa thành kí tự in thường
//        //Đầu vào: s = “CodegymDaNang”
//        //Đầu ra mong đợi: codegym da nang
    String solution(String s){
        String []arr= s.split("");
        ArrayList<String>arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(arr[i].toUpperCase())){
                arrayList.add(" ");
                arrayList.add(arr[i].toLowerCase());
            }else {
                arrayList.add(arr[i]);
            }

        }
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            a.append(arrayList.get(i));
        }
        return a.toString().trim();
    }
}
