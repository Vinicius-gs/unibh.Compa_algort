package ordenacao;

public class Decrescente {
	
    private int[] vector;

    public Decrescente(int[] vector) {
        this.vector = vector;
    }

    public int[] getVector() {
        return vector;
    }
	
    public void decrescente() {
        for (int i = 1; i < vector.length; i++) {
            for (int j = 0; j < i; j++) {
                if (vector[i] > vector[j]) {
                    int temp = vector[i];
                    vector[i] = vector[j];
                    vector[j] = temp;
                }
            }
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
