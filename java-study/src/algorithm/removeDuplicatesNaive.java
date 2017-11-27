
/**
 * 删除重复数组
 *
 * @author bo.li
 */
public class removeDuplicatesNaive {

    public static void main(String[] A) {
        if (A.length < 2) {
            System.out.println("数组长度不够");
        }
        //return A.length;

        int j = 0;
        int i = 1;

        while (i < A.length) {
            if (A[i] == A[j]) {
                i++;
            } else {
                j++;
                A[j] = A[i];
                i++;
            }
        }
        System.out.println(j + 1);
//	return j + 1;
    }
}
