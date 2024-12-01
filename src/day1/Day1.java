package day1;

public class Day1 {


    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] a = {3,4,2,1,3,3};
        int[] b = {4,3,5,3,9,3};
        System.out.println(a);

        sort(a);
        sort(b);

        resolve(a,b);
    }

    public static void sort(int[] a){
        int n = a.length;
        boolean swapped;

        for (int i = 0; i < n -1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }

        }
    }



    public static void resolve(int[] a, int[] b){
        int sum = 0;
        int longitud = a.length == b.length ? a.length : Math.max(a.length, b.length);
        for (int i = 0; i < longitud; i++) {
                if(a[i] > b[i]){
                    sum += a[i] - b[i];
                }else if(a[i] < b[i]){
                    sum += b[i] - a[i];
            }
        }

        System.out.println("Distance: " + sum);
    }

}
