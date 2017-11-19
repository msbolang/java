
/*
   冒泡排序算法 （就像一个个泡泡往上冒 ）
 */
public class Bubble_Sort_01 {

    public static void main(String[] args) {
        Date[] dateArr = new Date[5];
        dateArr[0] = new Date(2011, 5, 9);
        dateArr[1] = new Date(2012, 5, 9);
        dateArr[2] = new Date(2011, 6, 9);
        dateArr[3] = new Date(2011, 5, 12);
        dateArr[4] = new Date(2017, 5, 8);
        dateArr = bubbleSort(dateArr);
        for (int i = 0; i < dateArr.length; i++) {
            System.out.println(dateArr[i].y + "年" + dateArr[i].m + "月" + dateArr[i].d + "日");
        }
    }

   // 冒泡排序算法重点
    public static Date[] bubbleSort(Date[] a) {
        int len = a.length;
        for (int i = len - 1; i>=1; i--) {
            for (int j = 0; j <=i-1; j++) {
                System.out.println((a[j].bj(a[j + 1]) > 0));
                if (a[j].bj(a[j + 1]) > 0) {
                    Date temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

}

class Date {

    int y;
    int m;
    int d;

    Date(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    public int bj(Date o) {
        return o.y > y ? 1
                : o.y < y ? -1
                        : o.m > m ? 1
                                : o.m < m ? -1
                                        : o.d > d ? 1
                                                : o.d < d ? -1
                                                        : 0;
    }

}
