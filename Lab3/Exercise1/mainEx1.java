public class mainEx1 {
    

    public static void main(String []args){
//initializing the variables for Course1
    String Title1 = "Chemistry 101";
    String studentList[]={"Gustavo Fring",
                           "Saul Goodman",
                           "Tim Duncan",
                           "Walter White",
                           "Jesse Pinkman"};
    //declaring a new course object with the variables above
    //BubbleSort() is declared as the sort strategy in the constructor
    Course course1 = new Course(Title1, studentList, new BubbleSort());
//calling the sort students function 
    course1.sortStudents();
//printing out the students info 
    course1.printCourseInfo();
System.out.println(); 


//initializing the variables for Course2
    String Title2 = "Medival History";
    String studentList2[]={"Jon Snow",
                          "Theon Greyjoy",
                          "Steve Nash",
                          "Ned Stark",
                          "Daenerys Targaryen"};
//declaring a new course object with 
//bubble sort is the sort strategy 
    Course course2 = new Course(Title2, studentList2, new BubbleSort()); 
//changing the sort strategy using the setSortStrategy function to selection sort
    course2.setSortStrategy(new SelectionSort());
    course2.sortStudents();
    course2.printCourseInfo();
System.out.println(); 
    String Title3 = "Sports and Exercise";
    String studentList3[]={"Michael Jordan",
                           "Lamar Jackson",
                           "Wayne Gretsky",
                           "Carson Wentz",
                           "Tom Brady"};
    Course course3 = new Course(Title3, studentList3, new InsertionSort()); 
    course3.sortStudents();
    course3.printCourseInfo();





    



        
    }
}
