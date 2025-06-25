public class Student {
    private int id;
    private String name;
    private float marks;
    void setName(String ip_name){
        this.name = ip_name;
    }
    void setID(int ip_id){
        this.id = ip_id;
    }
    void setMarks(float ip_marks) {
        this.marks = ip_marks;
    }
    float getMarks(){
        return this.marks;
    }
    int getID(){
        return this.id;
    }
    String getName(){
        return this.name;
    }
}
