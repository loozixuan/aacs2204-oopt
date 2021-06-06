
public class Question3 {
    public static void main(String[] args) {
        
        if(args.length == 0){
            System.out.println("Please enter data");
            System.exit(-1); //running not sucessfully
        }
        
        String fName="";
        String sName="";
        String title="";
        boolean isFound=false;
        
        for(int i=0;i<args.length-1;i++){
            String data = args[i];
            
            /*Method 1
            if(data.charAt(0)== '['){
                data=data.replace("[","\0");
                data=data.replace("]","\0");            
            }*/
            
            if(data.matches("\\[.*\\]")){
                data=data.replaceAll("[\\[\\]]", "");
                isFound=true;
            }
            
             //first letter change to uppercase 
            data = data.substring(0, 1).toUpperCase() + data.substring(1).toLowerCase();
            
            
            if(isFound){
              sName=data;
              isFound= false;
            }
                       
            fName += data+" ";            
        }
        
        title=args[args.length-1];
        System.out.println("To : "+fName);
        System.out.println("Wishing you Merry Chritmas, " + title + " " +sName);
    }
    
    
}
