// 정수 n개의 합
class Test {
    long sum(int[] a) {
        long sum = 0;

        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

}
