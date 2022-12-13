
class Course {
    
    private String title;
    private String students[]; 
    private SortStrategy sortStrategy;

//constructior for the TicketSales class
    public Course(String classTitle, String [] studentList, SortStrategy sortStrat){
     title = classTitle;
     students = studentList; 
     sortStrategy = sortStrat;   
    }
//setter and getter for Title
    public void setTitle(String classTitle){
        title = classTitle;

    }
    public String getTitle(){
        return title; 
    }

//setter and getter for the ariable students 
    public void setStudents(String [] studentList){
        students = studentList; 

    }
    public String[] getStudents(){
        return students;
    }
//setter for the sortStrategy
    public void setSortStrategy(SortStrategy strat){
        sortStrategy = strat; 
    }

    public void sortStudents(){
        sortStrategy.sort(students);
    }

    public SortStrategy getSortStrategy(){
        return sortStrategy;
    }
    public void printCourseInfo(){
        System.out.println("Course Title: "+title);
        System.out.println("Student List: ");
        for(int i = 0; i < students.length;i++ ){
            System.out.println(students[i]+" ");
        }
    }
}
