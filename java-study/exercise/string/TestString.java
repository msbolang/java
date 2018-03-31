
/**
 *判断几个大写字母 几个小写字母 几个非字母
 *
 * @author Administrator
 */
class TestString {

    public static void main(String[] args) {

//方法1        
        String s = "AaaaBdddCkkkfjdjaks3232442l_JF@3$%DF";
        int Slength = s.length();
        int D = 0;//大寫
        int S = 0;//小寫
        int DF = 0;//非字母
        String ss = "AAAA";
        for (int i = 0; i < Slength; i++) {
//             System.out.println(s.charAt(i));
            char c = s.charAt(i);
            //用char類型比較 實際是比較ASIN編碼 英文字母也可以做大小比較。。。天
            if (c >= 'a' && c <= 'z') {
                S++;
            } else if (c >= 'A' && c <= 'Z') {
                D++;
            } else {
                DF++;
            }
        }
        System.out.println("大寫" + D);
        System.out.println("小寫" + S);
        System.out.println("其他" + DF);

//方法2
        int DD = 0;//大寫
        int SS = 0;//小寫
        int DFDF = 0;//非字母
        String A = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String B = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < Slength; i++) {
            char c = s.charAt(i);
            //使用indexOf判斷  類似javascript
            if (B.indexOf(c) > -1) {
                SS++;
            } else if (A.indexOf(c) > -1) {
                DD++;
            } else {
                DFDF++;
            }
        }
        System.out.println("方法2大寫" + DD);
        System.out.println("方法2小寫" + SS);
        System.out.println("方法2其他" + DFDF);

        //方法3
        //使用Character string的包裝類 isLowerCase判斷是否大寫    isUpperCase 方法 判斷是否小寫
        int DDD = 0;//大寫
        int SSS = 0;//小寫
        int DFDFDF = 0;//非字母
        String AA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String BB = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < Slength; i++) {
            char c = s.charAt(i);
            //使用indexOf判斷  類似javascript
            if (Character.isLowerCase(c)) {
                SSS++;
            } else if (Character.isUpperCase(c)) {
                DDD++;
            } else {
                DFDFDF++;
            }
        }
        System.out.println("方法3大寫" + DDD);
        System.out.println("方法3小寫" + SSS);
        System.out.println("方法3其他" + DFDFDF);

    }

}
