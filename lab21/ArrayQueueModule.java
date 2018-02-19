package ru.isbo1016.chumakov.lab21;

public class ArrayQueueModule {
    private Object[] A = new Object[100];
    private Object[] B = new Object[100];
    private int msize = 0;

    public 	void enqueue(Object[] A, Object O) {
        for (int i =0; i<msize; i++){
            B[i] = A[i];
        }

        for (int i =1; i<msize+1; i++){
            A[i] = B[i-1];
        }

        msize++;

        A[0] = O;
    }

    public 	Object element(Object [] A){
        return A[0];
    }

    public 	Object dequeue (Object[] A){
        for (int i =0; i<msize; i++){
            B[i] = A[i];
        }
        Object temp = A[0];

        for (int i =1; i<msize; i++){
            A[i-1] = B[i];
        }

        A[msize] = null;

        msize--;

        return temp;
    }

    public 	int size(Object [] A){
        return A.length;
    }

    public 	boolean isEmpty(){
        if (A[0] == null) return true;
        else return false;
    }

    public 	void clear(Object [] A){
        for (int i =0; i<msize; i++){
            A[i] = null;
        }
    }
}
