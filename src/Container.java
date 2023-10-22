public class Container {
    private int size = 0;
    private Object[] array;

    public Container() {
        array = new Object[size];
    }

    public int getSize() {
        return size;
    }

    public void Add(Object item) {
        Object[] a = new Object[size + 1];
        for (int i = 0; i < size; i++) {
            a[i] = array[i];
        }
        a[size++] = item;
        array = a;
    }

    public void RemoveAt(int idx) {
        if (idx < 0 || idx >= size)
            return;
        Object[] a = new Object[size - 1];
        int a_i = 0;
        for (int i = 0; i < size; i++) {
            if (i != idx) {
                a[a_i] = array[i];
                a_i++;
            }
        }
        size--;
        array = a;
    }

    public Object ElementAt(int idx) {
        return array[idx];
    }

    public void EditAt(int idx, Object item) {
        array[idx] = item;
    }
}
