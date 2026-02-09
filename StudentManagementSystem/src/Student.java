public class Student {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getMarks(){
        return this.marks;
    }

    public void setMarks(double newMark)
    {
        this.marks = newMark;
    }

}
