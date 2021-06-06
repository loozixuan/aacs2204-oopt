
public class MirrorDriver {
    public static void main(String[] args) {
        Mirror [] mirrorArr = new Mirror[]{new RectangleMirror(52,162,"R1234","Wood","White",480.00), 
                                           new RoundMirror(40,"C9876","Steel","Dark brown",92.00)};
        
        for (int i=0; i< mirrorArr.length ; i++){
            if(mirrorArr[i] instanceof RectangleMirror){
                System.out.println("Rectangle Mirror");
            }else{
                System.out.println("\nRoundMirror");
            }
            
            System.out.println(mirrorArr[i].toString());
        }
    }
}

