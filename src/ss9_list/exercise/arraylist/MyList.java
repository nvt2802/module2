package ss9_list.exercise.arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] element;

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        element = new Object[capacity];
    }

    /**
     * @param index
     * @param element kiem tra capacity va tang kich thuoc neu da full
     *                neu size nhap vao lon hon length cua element thi bao loi
     *                dich chuyen tung phan tu toi trc
     *                them element vao vi tri index
     *                tang size +1
     */
    public void add(int index, E element) {
        ensureCapacity(this.element.length);
        if (size > this.element.length) {
            throw new IndexOutOfBoundsException("size: " + size + ", length element:" + this.element.length);
        }
        for (int i = this.element.length - 1; i > index; i--) {
            this.element[i] = this.element[i - 1];
        }
        this.element[index] = element;
        this.size++;
    }

    /**
     * @param index
     * @return element thu index
     * gan phan tu thu index bang null
     */
    public E remove(int index) {
        this.element[index] = null;
        return (E) this.element[index];
    }


    public int size() {
        return this.size;
    }

    /**
     * @return arrayList moi
     * tao ra mot Mylist va gan gia tri va kich thuoc cho no
     */
    public MyList<E> cloneObj() {
        MyList<E> myNewList = new MyList<E>();
        myNewList.element = element;
        myNewList.size = size;
        return myNewList;
    }

    /**
     * @param o Object
     * @return true/false
     * tim Object co chua trong element
     */
    public boolean contain(E o) {
        for (int i = 0; i < element.length; i++) {
            if (o.equals(element[i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param o Object
     * @return index cua Object neu tim thay, -1 neu khong tim thay
     * tim object va tra ve index cua no
     */
    public int indexOf(E o) {
        for (int i = 0; i < this.element.length; i++) {
            if (o.equals(element[i])) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param e element
     * @return true
     * them phan tu e vao cuoi mang
     */
    public boolean add(E e) {
        ensureCapacity(this.element.length);
        element[size++] = e;
        return true;
    }

    /**
     * @param minCapacity capacity nho nhat
     *                    tang kich thuoc cua array list len gap doi neu size = capacity
     */
    public void ensureCapacity(int minCapacity) {
        if (this.size == minCapacity) {
            int newSize = element.length * 2;
            element = Arrays.copyOf(element, newSize);
        }
    }

    /**
     * @param i index
     * @return tra ve doi tuong thu i
     */
    public E get(int i) {
        return (E) this.element[i];
    }

    /**
     * xoa tat ca phan tu trong arraylist
     */
    public void clear() {
        for (int i = 0; i < this.element.length; i++) {
            if (element[i] != null) {
                element[i] = null;
                size--;
            }
        }
    }
}
