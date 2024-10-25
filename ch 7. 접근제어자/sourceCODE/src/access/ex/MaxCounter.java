package access.ex;

public class MaxCounter {

    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (max > count) { // 등호 붙이면 안됨 -> max와 count가 같을 때 count값을 1 증가시키기 때문
            count += 1; // count++;
        } else {
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }

    public int getCount() {
        return count;
    }
}
