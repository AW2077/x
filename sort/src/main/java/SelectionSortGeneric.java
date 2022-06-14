public class SelectionSortGeneric<T extends Comparable<T>> {
    public static void main(String[] args)
    {
        Integer[] arrayOfInt = {12, 111, 543, 3, 6, 86, 45, 87, 435, 223, 46, 22, 0, 5};
        SelectionSortGeneric<Integer> intSorter   = new SelectionSortGeneric<>();
        intSorter.selectionSort(arrayOfInt);
        System.out.println(java.util.Arrays.toString(arrayOfInt));

        Double[] arrayOfDoubles = {132.0, 0.02, 0.36, 0.82, 0.27, 0.49, 0.41, 0.17, 0.30, 0.89, 0.37, 0.66, 0.82, 0.17, 0.20, 0.96, 0.18, 0.25, 0.37, 0.52};
        SelectionSortGeneric<Double> doubleSorter   = new SelectionSortGeneric<>();
        doubleSorter.selectionSort(arrayOfDoubles);
        System.out.println(java.util.Arrays.toString(arrayOfDoubles));
    }

    void selectionSort(T[] array)
    {

        for (int currentIndex = 0; currentIndex < array.length - 1; currentIndex++)
        {

            int minIndex = currentIndex;

            for (int i = currentIndex + 1; i < array.length; i++)
            {

                if (array[i].compareTo(array[minIndex]) < 0)
                {

                    minIndex = i;
                }
            }
            
            if (minIndex != currentIndex)
            {
                T temp = array[currentIndex];
                array[currentIndex] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
