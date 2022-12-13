public class SelectionSort implements SortStrategy {
//function sorts the array using Selection Sort
    public void sort(String [] studentList){
        System.out.println("Using Selection Sort");
String temp = " ";
        for(int i = 0; i < studentList.length-1;i++)
        {
                int min = i; 

                for(int j = i+1; j < studentList.length;j++)
                {
                    if(studentList[j].compareTo(studentList[min])>0)
                    {
                        min = j;
                    }
                    temp = studentList[j];
                    studentList[j]=studentList[min];
                    studentList[min]=temp; 

                }
        }
    }
}