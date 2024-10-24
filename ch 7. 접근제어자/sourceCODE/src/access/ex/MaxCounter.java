package access.ex;

public class MaxCounter {

    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (max >= count) { // 초과할 수 없습니다 = max와 같아도 되지만 넘으면 안됨
            count += 1; // count++;
        } else {
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }

    public int getCount() {
        return count;
    }
}
