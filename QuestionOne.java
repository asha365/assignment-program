  
// 1.Write a program to create a room class, the attributes of this class is Room_no,
// room_type and room_area. In this class the member functions are set_data and display_data. 

public class QuestionOne {
    public static void main(String[] args) {
        Room room = new Room();
        room.setData(5, "Quad ", 1500);
        room.displayData();
    }
}
 
class Room {
    int room_no;
    String room_type;
    double room_area;

    void setData(int room_id, String room_type, double room_area) {
        this.room_no = room_id;
        this.room_type = room_type;
        this.room_area = room_area;
    }

    void displayData() {
        System.out.println("Room no is: " + this.room_no);
        System.out.println("Room Type is: " + this.room_type);
        System.out.println("Room Area is: " + this.room_area);
    }
}