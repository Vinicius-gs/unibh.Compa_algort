package ordenacao;

public class InsertionSort {
    private int[] vector;

    public InsertionSort(int[] vector) {
        this.vector = vector;
    }

    public int[] getVector() {
        return vector;
    }

    public void sort(){
        int key;
        for (int j = 1; j < vector.length; j++) {
            key = vector[j];
            int i = j-1;
            while ( (i > 0) && (vector[i]>key)){
                vector[i+1] = vector[i];
                i--;
            }
            vector[i+1] = key;
        }
    }
    
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
  
        System.out.println();
    }
}
