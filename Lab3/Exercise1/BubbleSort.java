public class BubbleSort implements SortStrategy {
//function sorts the array using Bubble Sort
    public void sort(String [] studentList)
    {
        System.out.println("Using Bubble Sort");
        String temp;
        for(int i = 0; i<studentList.length;i++)
        {
            for(int j = i+1; j <studentList.length;j++)
            {

                if(studentList[i].compareTo(studentList[j]) >0)
                {
                    temp=studentList[j];
                    studentList[j]=studentList[i];
                    studentList[i]=temp;
                }
            }
        }
    }
}
