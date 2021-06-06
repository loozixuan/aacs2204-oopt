
public class RoomDriver {
    public static void main(String[] args) {
        Facility [] facilityArr = new Facility [] {new GuestRoom("City View", 395,"Deluxe Twin",30),
                                                  new EventHall(300,"Sit-Down Dinner","Round Table",550)};
    
        for(int i=0;i< facilityArr.length;i++){
            if(facilityArr[i] instanceof GuestRoom){
                System.out.println("Facility: Guest Room\n====================");
            }else{
                System.out.println("Facility: Event Hall\n====================");
            }

            System.out.println(facilityArr[i].toString() + "\n");
        }
    }
}
