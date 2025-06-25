import java.util.ArrayList;
import java.util.Scanner;
public class CRUD {
    CRUD(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentArrayList = new ArrayList<>();
        boolean flag = true;
        int id;
        while(flag){
            print();
            System.out.println("Enter a choice-");
            int ch = sc.nextInt();
            switch(ch) {
                case 1:
                    Student s = new Student();
                    System.out.println("Enter the student id-");
                    int ip_id = sc.nextInt();
                    System.out.println("Enter the student name-");
                    String ip_name = sc.next();
                    System.out.println("Enter the student marks-");
                    float ip_marks = sc.nextFloat();
                    s.setID(ip_id);
                    s.setName(ip_name);
                    s.setMarks(ip_marks);
                    System.out.println("Student details added successfully");
                    studentArrayList.add(s);
                    break;
                case 2:
                    System.out.println("Enter student id-");
                    id = sc.nextInt();
                    int val = 0;
                    for (Student s1 : studentArrayList) {
                        if (s1.getID() == id) {
                            System.out.println("ID = " + s1.getID() + ", Name = " + s1.getName() + ", Marks = " + s1.getMarks());
                            val = 1;
                            break;
                        }
                    }
                    if (val == 0) {
                        System.out.println("Details not found - No student exists with ID " + id);
                    }
                    break;
                case 3:
                    System.out.println("Enter the student ID which u want to modify-");
                    id = sc.nextInt();
                    int data = 0;
                    for (Student s1 : studentArrayList) {
                        if (s1.getID() == id) {
                            data = 1;
                            System.out.println("1. Modify ID?");
                            System.out.println("2. Modify Name?");
                            System.out.println("3. Modify Marks?");
                            System.out.println("Enter a choice");
                            int choice = sc.nextInt();
                            switch (choice) {
                                case 1:
                                    int new_id = sc.nextInt();
                                    s1.setID(new_id);
                                    System.out.println("ID Modified Successfully");
                                    break;
                                case 2:
                                    String new_name = sc.next();
                                    s1.setName(new_name);
                                    System.out.println("Name Modified Successfully");
                                    break;
                                case 3:
                                    float new_marks = sc.nextFloat();
                                    s1.setMarks(new_marks);
                                    System.out.println("Marks Modified Successfully");
                                    break;
                                default:
                                    System.out.println("Invalid Choice..");

                            }
                        }
                    }
                    if(data == 0){
                        System.out.println("No student exists with ID - " + id);
                    }
                    break;
                case 4:
                    System.out.println("Enter student ID to be deleted:");
                    id = sc.nextInt();
                    int blockval = 0;
                    for(Student s1 : studentArrayList) {
                        if (s1.getID() == id) {
                            studentArrayList.remove(s1);
                            blockval = 1;
                            System.out.println("Student details removed successfully");
                            break;
                        }
                    }
                    if(blockval == 0) {
                        System.out.println("No student exists with ID " + id);
                    }
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    void print(){
        System.out.println("1.Add a new student");
        System.out.println("2.Details of an existing student");
        System.out.println("3.Modify an existing student");
        System.out.println("4.Delete an existing student");
        System.out.println("5. Exit");
    }
}
