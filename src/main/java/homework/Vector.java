package homework;

public class Vector implements DynamicIntegerArray {
    private int index;
    private int length;
    private int size;
    private int[] array;

    public Vector() {
        this.index = 31;
        this.length = 63;
        this.size = 0;
        this.array = new int[this.length];
    }

    @Override
    public int get(int index) {
        return this.array[this.index + index];
    }

    private void reshuffle() {
        int newLength = 1;
        while (newLength < size) {
            newLength = newLength * 2;
        }
        newLength = newLength * 4 - 1;
        int[] buff = new int[newLength];
        System.arraycopy(array, index, buff, (newLength + 1) / 2, size);
        index = (newLength + 1) / 2;
        length = newLength;
        array = buff;
    }

    @Override
    public void push_back(int value) {
        if (size == (length + 1) / 2 | index + size == length) reshuffle();
        array[index + size] = value;
        size++;
    }

    @Override
    public int pop_back(int value) {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("Cannot pop from empty array!");
        }
        size--;
        return array[index + size + 1];
    }

    @Override
    public void push_front(int value) {
        if (size == (length + 1) / 2 | index == 0) reshuffle();
        size++;
        index--;
        array[index] = value;
    }

    @Override
    public int pop_front(int value) {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("Cannot pop from empty array!");
        }
        size--;
        index++;
        return array[index - 1];
    }

    @Override
    public int size() {
        return this.size;
    }

    public String toString() {
        if (size == 0) return "";
        String ans = "" + array[index];
        for (int i = 1; i < size; ++i) {
            ans = ans + " " + array[index + i];
        }
        return ans;
    }
}
