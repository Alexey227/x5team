public class task10 {
    public static void main(String[] args) {
        int[] elements = new int[] {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        int swapCount = 0;
        int lastIndex = elements.length-1;
        for(int i = lastIndex-1; i >=0; i--) {
            if(elements[i] == 0) {
                elements[i] = elements[lastIndex-swapCount];
                elements[lastIndex-swapCount] = 0;
                swapCount++;
            }
        }
        for(int i : elements) {
            System.out.print(i + ", ");
        }
    }
}


