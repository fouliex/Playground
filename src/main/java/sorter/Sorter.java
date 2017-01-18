package sorter;

/**
 * Created by George Fouche on 1/15/17.
 */
public class Sorter {
    private int[] data;

    public Sorter(int[] data) {
        this.data = data;
    }

    public int[] bubbleSort() {
        for (int x = data.length - 1; x >= 1; x--) {
            for (int y = 0; y < x; y++) {
                if (data[y] > data[y + 1]) {
                    swap(y, y + 1);
                }
            }
        }
        return data;
    }

    private void swap(int indexOne, int indexTwo) {
        int temp = data[indexOne];
        data[indexOne] = data[indexTwo];
        data[indexTwo] = temp;
    }
}
