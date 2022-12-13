public class InsertionSort implements SortStrategy {
//function sorts the array using Insertion Sort
    public void sort(String [] studentList){
        System.out.println("Using Insertion Sort");
        String key;
        int j;
        for(int i = 1; i < studentList.length; i++)
        {
            key = studentList[i];
            
            j = i - 1; 

            while (j >= 0)
            {
                if (key.compareTo(studentList[j])>0)
                {
                    break;
                }
                studentList[j+1] = studentList[j];
                j--;
            }
            studentList[j+1] = key;
        }
    }
}

