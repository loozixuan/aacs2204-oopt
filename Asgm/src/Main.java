import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        
        //Product
        Product[] product= new Product[100];
        product[Product.getNumProd()]=new Product("Love Cookies",102,8.20);
        product[Product.getNumProd()]=new Product("Choc Cookies",53,12.00);
        product[Product.getNumProd()]=new Product("Cream Cookies",33,15.70);
        product[Product.getNumProd()]=new Product("Afghan biscuits",123,19.90);
        product[Product.getNumProd()]=new Product("Berger Cookies",250,9.90);
        
        //Staff
        Staff[] staff=new Staff[100];
        staff[Staff.getTotalEpy()]=new Staff("abcd1001",'C',1200.00,"John","0101234567");
        staff[Staff.getTotalEpy()]=new Staff("abcd1002",'C',1200.00,"Alex","0105678241");
        staff[Staff.getTotalEpy()]=new Staff("abcd1003",'C',1200.00,"Joyce","0101528736");
        staff[Staff.getTotalEpy()]=new Staff("abcd1004",'C',1200.00,"May","0107652819");
        staff[Staff.getTotalEpy()]=new Staff("abcd1005",'C',1200.00,"John","0109876543");
        staff[Staff.getTotalEpy()]=new Staff("mmmm1001",'M',2000.00,"John","0109178362");
        
         //Member
         Member [] member=new Member[100];
        //REGISTED MEMBER ->EXISTING MEMBERS IN THE STORE
        member[Member.getNumOfMember()]=new Member("John Smith","01912345443");
        member[Member.getNumOfMember()]=new Member("Lily Tan","011226745443");
        member[Member.getNumOfMember()]=new Member("Henry","01234345443");
        member[Member.getNumOfMember()]=new Member("Kendy George","01232345443");
        member[Member.getNumOfMember()]=new Member("Peter Low","01912345443");
        
        Purchase []purchase = new Purchase[100];
        
        Sales sales=new Sales(product);
        int found=login(staff);
        if(found==1){
            logo();
            do{
                System.out.print("\n===================\n"
                                +"Product's Main Menu\n"
                                +"===================\n"+
                                "1. Product\n"+
                                "2. Purchase\n"+
                                "3. Staff\n"+
                                "4. Summary Report\n"+
                                "5. Member Purchase History\n"+
                                "6. Exit\n\n");            

                boolean continueInput = true;
                do{
                    try{
                        System.out.print("Enter a choice: ");
                        choice = scan.nextInt();
                         scan.nextLine();
                        continueInput = false;
                    }
                    catch(Exception ex){
                        System.err.println("Invalid Input");
                        scan.nextLine();
                    }
                }while(continueInput);

                switch(choice){
                    case 1:
                        productMain(product);
                        break;
                    case 2:
                        purchase(product, purchase, member);
                        break;
                    case 3:
                        addStaff(staff);
                        break;
                    case 4:
                        sales(sales,product,staff);
                        break;
                    case 5:
                        memberPurchasingHistory(member);
                }
            }while(choice!=6);
        }    
    }
    
    public static void logo(){
        System.out.println("____________________________________________");
        System.out.println("|        ****  ****  **   **  **   **       |");
        System.out.println("|       **    **      ** **     ***         |");
        System.out.println("|       **    **        *       ***         |");
        System.out.println("|        ****  ****     *     **   **       |");
        System.out.println("|                 CCYX COOKIES              |");
        System.out.println("|___________________________________________|");
        
    }
    
    public static int login(Staff []staff){
        Scanner scan = new Scanner(System.in);
        
        String staffID;
        String password;
        char ans;
        int found=0;
        int again=0;
        do{
            System.out.print("Enter staff ID:");
            staffID=scan.next();
            for(int i=0;i<Staff.getTotalEpy();i++){
                if(staffID.equals(staff[i].getStaffID())){

                    found=1;
                }   
            }
            if(found==0){
                    System.err.println("This staff ID not found!");
                    System.out.print("Do you want to continue login(Y-Yes/N-No):");
                    ans=scan.next().charAt(0);

                if(Character.toUpperCase(ans)=='Y'){
                     again=1;
                }
                else{
                     again=0;
                }

            }else{
                found=0;
                System.out.print("Enter password: ");
                password=scan.next();
                for(int i=0;i<Staff.getTotalEpy();i++){
                    if(password.equals(staff[i].getPassword())&&staffID.equals(staff[i].getStaffID())){
                        found=1;
                        again=0;
                    }

                }

                if(found==0){
                    System.err.println("This Password not same with the account!");
                    System.out.print("Do you want to continue login(Y-Yes/N-No):");
                    ans=scan.next().charAt(0);
                    if(Character.toUpperCase(ans)=='Y'){
                        again=1;
                    }
                    else{
                        again=0;
                    }
                }
            }
        
        }while(again!=0);
        
        return found;     
    }
    
    public static void productMain(Product []p) {
        int choice,qty = 0, qtyDEC= 0,qtyADD=0;
       
        double price = 0 ,newPrice=0;
        boolean found=false;
        String productName,confirm,cont,productID;
        boolean validate=false;
        
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
               
        do{
            System.out.print("\n===================\n"
                            +"Product's Main Menu\n"
                            +"===================\n"+
                            "1. Add New Product\n"+
                            "2. Restock\n"+
                            "3. Reduce Stock\n"+
                            "4. Update Price\n"+
                            "5. Display Product List\n"+
                            "6. Exit\n\n"+
                            "Enter a choice: ");            
            choice = scan.nextInt();
            
            switch(choice){
                //ADD new product
                case 1:            
                    do{
                    System.out.println("--------------\nADDING PRODUCT\n--------------");
                        do{
                        System.out.print("Enter Product Name: ");
                        productName =scan.next();
                         for(int i=0;i<productName.length();i++){
                          if(!Character.isLetter(productName.charAt(i))){
                              validate=false;
                          }else{
                              validate=true;
                          }
                        }
                         if(validate==false){
                              System.out.println("===============================================\nInvalid input name (Must consists only letters)\n==============================================\n");
                         }
                        }while(validate==false);
                        
                        
                            boolean continueInput = true;                      
                            do{   
                                try{//avoid user to enter alphabet and invalid quantity
                                   
                                    System.out.print("Enter Product Quantity: ");
                                    qty =scan.nextInt();
                                        if(qty<=0){
                                            validate=false;
                                            System.out.println("======================\nInvalid quantity input\n======================\n");
                                        }else{
                                            validate=true;
                                        }
                                    scan.nextLine();
                                    continueInput = false;
                                } catch(Exception ex){
                                    System.out.println("=================\nDigit Required!!!\n=================");
                                    scan.nextLine();
                                }
                            }while(validate==false || continueInput);
                            
                        boolean continueInput2 = true;        
                        do{         
                            try{//avoid user to enter alphabet and invalid price
                            System.out.print("Enter Price: ");
                            price =scan.nextDouble();
                                if(price<=0){
                                    validate=false;
                                    System.out.println("===================\nInvalid price input\n===================\n");
                                }else{
                                    validate=true;
                                }  
                                 scan.nextLine();
                                 continueInput2 = false;
                                } catch(Exception ex){
                                    System.out.println("=================\nDigit Required!!!\n=================");
                                    scan.nextLine();
                                }
                           }while(validate==false || continueInput2);
                       
                        
                        //ASKING FOR CONFIRMATION
                        System.out.print("Do you confirm to add this product? ");
                        confirm =scan.next();
                        if(confirm.charAt(0)=='y'||confirm.charAt(0)=='Y'){    
                            p[Product.getNumProd()]= new Product(productName,qty,price); //product added successfully
                            System.out.println("\n***************************\nProduct addded successfully\n***************************");
                        }else{
                            System.out.println("\n********************************\nThis process has been cancelled.\n********************************");
                        }           
                    System.out.print("\nDo you want to continue add another product? ");
                    cont=scan.next();
                    }while(cont.charAt(0)=='y'||cont.charAt(0)=='Y');
                    break;
                
                //ADD product quantity(restock)
                case 2:
                    do{
                        System.out.println("----------------\nRestock Process\n----------------");
                        System.out.print("Enter the product ID: ");
                        productID=scan.next();
                        for(int i=0;i<Product.getNumProd();i++){
                            if(productID.equals(p[i].getProdID())){
                                found=true;
                                 boolean continueInput=true;
                                do{
                                    try{
                                        System.out.print("Enter how many quantity to add: ");       
                                        qtyADD=scan.nextInt();
                                        scan.nextLine();
                                        continueInput = false;
                                    }catch(Exception ex){
                                        System.out.println("=================\nDigit Required!!!\n=================");
                                        scan.nextLine();
                                     }
                                }while(continueInput);
                                    
                                if(p[i].increaseProductQty(qtyADD)){
                                    System.out.println("\n"+p[i].getProdID()+"'s quantity already been restocked sucessfully");
                                    System.out.println("Newest Quantity for "+p[i].getProdID()+" : "+p[i].getQuantity());
                                }else{
                                    System.out.println("\n**************************\nInvalid Input of Quantity!\n**************************");
                                }
                            }
                        }
                    if(found==false){
                        System.out.println("\n***********************\nProduct ID not found!!!\n***********************");
                    }
                    
                    System.out.print("\nDo you want to continue restock process? ");
                    cont=scan.next();
                    }while(cont.charAt(0)=='y'||cont.charAt(0)=='Y');
                    
                    
                    break; 
                    
                //REDUCE product quantity
                case 3:      
                    do{
                        
                        System.out.println("--------------\nReduce Process\n--------------");
                        System.out.print("Enter the product ID: ");
                        productID=scan.next();
                        for(int i=0;i<Product.getNumProd();i++){
                            if(productID.equals(p[i].getProdID())){
                                found=true;
                                boolean continueInput=true;
                                do{
                                    try{
                                        System.out.print("Enter how many quantity to reduce: ");       
                                        qtyDEC=scan.nextInt();
                                        scan.nextLine();
                                        continueInput = false;
                                    }catch(Exception ex){
                                        System.out.println("=================\nDigit Required!!!\n=================");
                                        scan.nextLine();
                                     }
                                }while(continueInput);
                                
                                if(p[i].decreaseProductQty(qtyDEC)){
                                    System.out.println(p[i].getProdID()+"'s quantity already been reduced sucessfully");
                                    System.out.println("Newest Quantity for "+p[i].getProdID()+" : "+p[i].getQuantity());
                                }else{
                                    System.out.println("\n**************************\nInvalid Input of Quantity!\n**************************");
                                }
                            }
                        }
                    //not found print out error message
                    if(found==false){
                        System.out.println("\n***********************\nProduct ID not found!!!\n***********************");
                    }
                    System.out.print("\nDo you want to continue reduce process? ");
                    cont=scan.next();
                    }while(cont.charAt(0)=='y'||cont.charAt(0)=='Y');
                                    
                    break;
                
              
               case 4:
                     do{
                         System.out.println("--------------\nUpdate Process\n--------------");
                        System.out.print("Enter the product ID: ");
                        productID=scan.next();
                        for(int i=0;i<Product.getNumProd();i++){                            
                            if(productID.equals(p[i].getProdID())){
                                found=true;
                                boolean continueInput=true;
                                 do{
                                    try{
                                        System.out.print("Enter new price: ");       
                                        newPrice=scan.nextDouble();
                                        scan.nextLine();
                                        continueInput = false;
                                }catch(Exception ex){
                                        System.out.println("=================\nDigit Required!!!\n=================");
                                        scan.nextLine();
                                }
                                }while(continueInput);
                                if(p[i].updatePrice(newPrice)){
                                    System.out.println(p[i].getProdID()+"'s price updated sucessfully");
                                    System.out.println("Latest price for "+p[i].getProdID()+" : "+p[i].getPrice());
                                }else{
                                    System.out.println("\n***********************\nInvalid Input of Price!\n***********************");
                                }
                            }
                        }
                    //not found print out error message
                    if(found==false){
                        System.out.println("\n***********************\nProduct ID not found!!!\n***********************");
                    }
                    System.out.print("\nDo you want to continue update process? ");
                    cont=scan.next();
                    }while(cont.charAt(0)=='y'||cont.charAt(0)=='Y');            
                    break;
                //DISPLAY all product info    
                case 5:
                    displayProductListing(p);
                    System.out.println("\n**********************************\nPress any key to back to main menu\n**********************************");
                    String backMain=scan.next();   
                    break;         
                   
                case 6:
                    System.out.println("Exit Product Main Menu....");
                    break;
                    
                default:
                    System.out.println("\n**********************************\nInvalid Input! Please Enter Again.\n**********************************");
            }       
        }while(choice!=6);
    }
    
    public static void displayProductListing(Product[] product) {
        System.out.println("\n\n===============================================================");
  	System.out.printf("%38s\n","Product Listing");
        System.out.println("===============================================================");
  	System.out.printf("%-15s %-20s %-16s %-15s\n","Product ID", "Product Name", "Quantity", "Price(RM)");
        System.out.println("---------------------------------------------------------------");
        
  	for (int i = 0; i < Product.getNumProd(); ++i){
            System.out.printf("%s\n",product[i].toString());
        }
    }
    
    public static void purchase(Product []product, Purchase []purchase, Member []member){
        Scanner scan = new Scanner(System.in);
        char verification;
        
        do{
            System.out.printf("Does customer want to do purchase? (Y = Yes / N = No) : ");
            verification = scan.nextLine().charAt(0);
            if(Character.toUpperCase(verification) != 'Y' && Character.toUpperCase(verification) != 'N')
                System.out.println("Invalid Input\n");
        }while(Character.toUpperCase(verification) != 'Y' && Character.toUpperCase(verification) != 'N');
        
        while(Character.toUpperCase(verification) == 'Y'){ 
            Product []prodPurchased = new Product[100];
            int numberOfProduct = 0; // To store how many different product in a purchase entered by the user
            double total = 0;
            
            //Display menu
            displayProductListing(product);
            
            //Purchasing Process
            do{ 
                System.out.println();
                boolean checkProductID = false; //Used to check the product ID entered the user
                
                System.out.print("Product ID : ");
                String id = scan.nextLine();
                for (int i = 0; i < Product.getNumProd(); i++){ //Check the match for product ID enter by user and the productID in the system
                    
                    //Validation of product ID
                    if(id.equalsIgnoreCase(product[i].getProdID())){
                        checkProductID = true;
                        
                        boolean found = false;
                        if(product[i].getQuantity() != 0){                              
                            System.out.println("Product Name : " + product[i].getProdName());
                            System.out.println("Product Price : " + product[i].getPrice());
                            
                            boolean continueInput = true;
                            int quantity = 0;
                            do{
                                try{
                                    System.out.print("Quantity : ");
                                    quantity = scan.nextInt();
                                    scan.nextLine();
                                    continueInput = false;
                                }
                                catch(Exception ex){
                                    System.out.println("Invalid Input");
                                    scan.nextLine();
                                }
                            }while(continueInput);
                            
                            if(product[i].quantityValidation(quantity)){           
                                for (int j = 0; j < numberOfProduct; j++) {
                                    if(id.equalsIgnoreCase(prodPurchased[j].getProdID())){
                                        found = true;
                                    }
                                }
                                if(found){
                                    prodPurchased[numberOfProduct-1].increaseProductQty(quantity);
                                }
                                else{
                                    prodPurchased[numberOfProduct] = new Product();
                                    prodPurchased[numberOfProduct].setProdID(id);
                                    prodPurchased[numberOfProduct].setProdName(product[i].getProdName());
                                    prodPurchased[numberOfProduct].setPrice(product[i].getPrice());
                                    prodPurchased[numberOfProduct].setQuantity(quantity);
                                    total+=product[i].getPrice()*quantity;
                                    numberOfProduct++;
                                }
                            }
                            else{
                                System.out.println("Invalid Input of Quantity\n");
                            }
                        }
                        else{
                            System.out.println("There is no available stock for Product " + product[i].getProdID() + "\n");
                        }
                    }
                }
                
                if(!checkProductID){ //if the product ID entered by the user is incorrect
                    System.out.println("Invalid Product ID\n");
                }
                
                do{
                    System.out.print("Add another product (Y = Yes / N = No) ? : ");
                    verification = scan.nextLine().charAt(0);
                    if(Character.toUpperCase(verification) != 'Y' && Character.toUpperCase(verification) != 'N')
                        System.out.println("Invalid Input\n");
                }while(Character.toUpperCase(verification) != 'Y' && Character.toUpperCase(verification) != 'N');
                
            }while(Character.toUpperCase(verification) == 'Y'); 
            
            if(numberOfProduct > 0){
                do{
                    System.out.print("Confirm purchase (Y = Yes / N = No)? : ");
                    verification = scan.nextLine().charAt(0);
                    if(Character.toUpperCase(verification) != 'Y' && Character.toUpperCase(verification) != 'N')
                        System.out.println("Invalid Input\n");
                }while(Character.toUpperCase(verification) != 'Y' && Character.toUpperCase(verification) != 'N');
                
                if(Character.toUpperCase(verification) == 'Y'){    
                    do{
                        System.out.print("Are you the member ? (Y = Yes / N = No) : ");
                        verification = scan.nextLine().charAt(0);
                        if(Character.toUpperCase(verification) != 'Y' && Character.toUpperCase(verification) != 'N')
                            System.out.println("Invalid Input\n");
                    }while(Character.toUpperCase(verification) != 'Y' && Character.toUpperCase(verification) != 'N');
                    
                    int count = 0;
                    int index = 0;
                    
                    while(Character.toUpperCase(verification) == 'Y'){        
                        System.out.print("Member ID: ");
                        String id = scan.nextLine();
                   
                        for (int i = 0; i < Member.getNumOfMember(); i++) {
                            if(member[i].memberValidation(id)){
                                count++;
                                System.out.printf("Member Discount (RM) : %.2f\n", total * Member.getDISCOUNT_RATE(total));
                                total -= Member.getDISCOUNT_RATE(total);
                                verification = 'N';
                                index = i;
                            }
                        }  
                        if(count == 0){
                            System.out.println("Member ID not found");
                            do{
                                System.out.print("Are you the member ? (Y = Yes / N = No) : ");
                                verification = scan.nextLine().charAt(0);
                                if(Character.toUpperCase(verification) != 'Y' && Character.toUpperCase(verification) != 'N')
                                System.out.println("Invalid Input\n");
                            }while(Character.toUpperCase(verification) != 'Y' && Character.toUpperCase(verification) != 'N');
                        }
                    } 
                    
                    boolean checkPayment = false;
                    System.out.printf("Total (RM) : %.2f\n", total);
                    
                    do{
                        double payment = 0;
                        boolean continueInput = true;
                        do{
                            try{
                                System.out.print("\nEnter the payment amount (RM) : ");
                                payment = scan.nextDouble();
                                scan.nextLine();
                                continueInput = false;
                            }
                            catch(Exception ex){
                                System.out.println("Invalid Input");
                                scan.nextLine();

                            }
                        }while(continueInput);
                        
                        if(payment < total){
                            System.out.print("Invalid Amount");
                        }
                        else{
                            checkPayment = true;
                            verification = 'N';
                            if(payment > total){
                                System.out.printf("Change : %.2f\n", (payment - total));
                            }
                            purchase[Purchase.getNumberOfPurchase()] = new Purchase(prodPurchased, numberOfProduct);
                            if(count == 1){
                                member[index].setPurchase(purchase[Purchase.getNumberOfPurchase()-1]);
                            }
                            invoice(purchase[Purchase.getNumberOfPurchase()-1], count);

                            for (int i = 0; i < Product.getNumProd(); i++) {  
                                for (int j = 0; j < numberOfProduct; j++) {
                                    if(prodPurchased[j].getProdID().equalsIgnoreCase(product[i].getProdID())){
                                        product[i].decreaseProductQty(prodPurchased[j].getQuantity());
                                        product[i].updateProductSales(prodPurchased[j].getQuantity());
                                    }
                                }
                            }
                        }

                        if(!checkPayment){
                            do{
                                System.out.print("\nEnter payment amount again? (Y = Yes / N = No) : ");
                                verification = scan.nextLine().charAt(0);
                                if(Character.toUpperCase(verification) != 'Y' && Character.toUpperCase(verification) != 'N')
                                System.out.println("Invalid Input");
                            }while(Character.toUpperCase(verification) != 'Y' && Character.toUpperCase(verification) != 'N');
                        }
                    }while(Character.toUpperCase(verification) == 'Y');
                }
            }
        
            System.out.println();
            do{
                    System.out.print("\nDo you want to check out for next customer (Y = Yes / N = No) ? : ");
                    verification = scan.nextLine().charAt(0);
                    if(Character.toUpperCase(verification) != 'Y' && Character.toUpperCase(verification) != 'N')
                    System.out.println("Invalid Input\n");
            }while(Character.toUpperCase(verification) != 'Y' && Character.toUpperCase(verification) != 'N');
        }
    }
    
    public static void invoice(Purchase purchase, int memberValidation){
        Product []prodPurchased = purchase.getProdPurchased();
        System.out.println("\n------------------------------------------------------------");
        System.out.println("                        CCYX Cookies                        ");
        System.out.println("------------------------------------------------------------");
        
        for (int i = 0; i < purchase.getNumberOfProduct(); i++) {
            System.out.printf("%-10s%-20s%-10.2f%-10d%10.2f\n", prodPurchased[i].getProdID(), prodPurchased[i].getProdName(), prodPurchased[i].getPrice(), prodPurchased[i].getQuantity(), prodPurchased[i].getPrice() * prodPurchased[i].getQuantity());
        }
        
        if(memberValidation == 1){
            purchase.setDiscount(purchase.getTotal());
            System.out.printf("\n%50s%10.2f\n", "Member Discount : ",purchase.getDiscount());
        }
        
        System.out.printf("%60s\n","======");
        System.out.printf("%60.2f\n",purchase.getTotal());
        System.out.printf("%60s","======"); 
    }

  
    public static void sales(Sales prodSales, Product []product,Staff[] staff){
        Scanner scan = new Scanner(System.in);
        String staffID;
        String password;
        char ans;
        int found=0;
        int again=0;
        do{
        System.out.print("Enter manager ID: ");
        staffID=scan.next();
        for(int i=0;i<Staff.getTotalEpy();i++){
            if(staffID.equals(staff[i].getStaffID())&&staffID.charAt(0)=='A'){
                
                found=1;
            }
            
            
        }
        if(found==0){
         System.err.println("This manager ID not found!");
         System.out.print("Do you want to continue login(Y-Yes/N-No):");
         ans=scan.next().charAt(0);
         if(Character.toUpperCase(ans)=='Y'){
             again=1;
         }
         else{
             again=0;
         }
        }else{
            found=0;
            System.out.print("Enter password: ");
            password=scan.next();
                  for(int i=0;i<Staff.getTotalEpy();i++){
            if(password.equals(staff[i].getPassword())&&staffID.equals(staff[i].getStaffID())){
                
                found=1;
                again=0;
            }
            
        }
         if(found==0){
         System.err.println("This Password not same with the account!");
         System.out.print("Do you want to continue login(Y-Yes/N-No):");
         ans=scan.next().charAt(0);
         if(Character.toUpperCase(ans)=='Y'){
             again=1;
         }
         else{
             again=0;
         }
        }
        }
        
        }while(again!=0);
        
        if(found==1){
             char exit;
                    
             
                 System.out.println("\n=====================================================================================");
                 System.out.printf("%50s \n","Sales Record");
                 System.out.println("=====================================================================================");
                 System.out.printf("%-15s |%-15s |%-15s |%-15s |%-15s |\n","Product ID","Name","Price","Quantity","Subtotal");
                 System.out.println("=====================================================================================");
                 for(int i=0;i<prodSales.getNoOfProduct();i++){
                  System.out.printf("%-16s| %15s| %15.2f| %15d| %15.2f|\n",product[i].getProdID(),product[i].getProdName(),
                  product[i].getPrice(),product[i].getUpdateProductSales(),prodSales.calculateSubtotal()[i]);
                  }
            System.out.println("=====================================================================================");
            System.out.printf("%84.2f|\n",prodSales.calculateTotalAmount());
            System.out.println("=====================================================================================");
            System.out.print("Enter any key to exit:");
            exit=scan.next().charAt(0);
       
        }
 
    }
    public static void addStaff(Staff[] staff){ 
        int option=0;
        boolean continueInput=true;
        Scanner scan = new Scanner(System.in);
        do{
            do{
                try{
          
                 System.out.print("\n===================\n"
                                + "Staff's Main Menu\n"
                                + "===================\n"
                                + "1.Display Staff\n"
                                + "2.Add Staff\n"
                                + "3.Exit\n"
                                + "Enter option:");
               
                option=scan.nextInt();
                continueInput=false;
                 scan.nextLine();
                }catch(Exception ex){
                    System.err.println("Invalid Input");
                    scan.nextInt();
                     scan.nextLine();
                }
            }while(continueInput);
            switch(option){
                case 1:
                    char ans;
                    
                   
                    System.out.println("\n==================================================================================");
                    System.out.printf("%50s %6s\t\t\t | \n","Staff Record","");
                    System.out.println("==================================================================================");
                    System.out.printf("%-15s |%-14s |%-15s |%-14s |%-15s|\n","Staff ID","Name","Phone No","Position","Salary");
                    System.out.println("==================================================================================");
                    for(int i=0;i<Staff.getTotalEpy();i++){
                         System.out.println(staff[i].toString());  
                    }
                    System.out.println("==================================================================================");
                    System.out.print("Enter any key to exit:");
                    ans=scan.next().charAt(0);
                  
                     break;
                   
              case 2:
                    boolean validPhone=false;
                    boolean valid=false;
                    String password;
                    char position;
                    char confirmAdd;
                    String phoneNo="";
                    double salary=0.00;
                    boolean continueAdd=true;
                    System.out.print("Enter Name:");
                    String name=scan.next();
                    //Phone
                    do{
                        do{
                            try{
                                System.out.print("Enter phone number:");
                                phoneNo=scan.next();
                                continueAdd=false;
                                scan.nextLine();
                                 validPhone=staff[Staff.getTotalEpy()-1].validatePhoneNo(phoneNo);
                                 if(validPhone==false){
                                     System.err.println("Phone number requires 10 or 11 digits.");
                                 }
                            }catch(Exception ex){
                                System.err.println("Invalid Input");
                                scan.nextLine();
                            }
                        }while(continueAdd);
                    }while(validPhone!=true);
                    //Position
                    do{
                    System.out.print("Enter position(M-Manager /C-Cashier):");
                    position=scan.next().charAt(0);
                    if(Character.toUpperCase(position)!='M'&&Character.toUpperCase(position)!='C'){
                        System.err.println("Please enter M or C only");
                    }
                    //position validation M/C
                    }while(Character.toUpperCase(position)!='M'&&Character.toUpperCase(position)!='C');
                    
                    boolean continueSalary=true;
                    do{
                        try{
                    
                            System.out.print("Enter salary:");
                            salary=scan.nextDouble();
                            scan.nextLine();
                            continueSalary=false;
                              
                        }catch(Exception ex){
                            System.err.println("Invalid Input!");
                            scan.nextLine();
                        }
                    }while(continueSalary);
                    //Password
                    do{
                    System.out.println("Password requires 8 characters, must contain letter and number.");
                    System.out.print("Enter password:");
                    password=scan.next();
                        valid=staff[Staff.getTotalEpy()-1].validatePassword(password);
                        if(valid==false){
                            System.err.println("Please follow the password format");
                        }
                    }while(valid!=true);


                    System.out.print("Are you confirm add staff (Y-Yes/N-No):");
                    confirmAdd=scan.next().charAt(0);
                    if(Character.toUpperCase(confirmAdd)=='Y'){
                    staff[Staff.getTotalEpy()]=new Staff(password,Character.toUpperCase(position),salary,name,phoneNo);
                    }

                    break;                
            }
        }while(option!=3);
      
    }
    
    public static void memberPurchasingHistory(Member []member){
        Scanner scan = new Scanner(System.in);
        char verification;      
        do{
            System.out.print("Do you want to check member purchase history? (Y = Yes / N = No) : ");
            verification = scan.nextLine().charAt(0);
            if(Character.toUpperCase(verification) != 'Y' && Character.toUpperCase(verification) != 'N')
            System.out.println("Invalid Input\n");
        }while(Character.toUpperCase(verification) != 'Y' && Character.toUpperCase(verification) != 'N');
        
        while(Character.toUpperCase(verification) == 'Y'){
            System.out.print("Enter the Member ID : ");
            String id = scan.nextLine();
            int index = 0;
            boolean checkID = false;
            for(int i = 0; i < Member.getNumOfMember(); i++){
                if(id.equals(member[i].getMemberID())){
                    index = i;
                    Purchase []purchase = member[i].getPurchase();
                    checkID = true;
                }
            }

            if(checkID){
                Purchase []purchase = member[index].getPurchase();
               
                if(member[index].getNumberOfPurchase() > 0){
                    for (int i = 0; i < member[index].getNumberOfPurchase(); i++) {                       
                        Product []product = purchase[i].getProdPurchased();

                        System.out.println("\n------------------------------------------------------------");
                        System.out.printf("%33s\n",purchase[i].getPurchaseID());
                        System.out.println("------------------------------------------------------------");

                        for (int j = 0; j < purchase[i].getNumberOfProduct(); j++) {
                             System.out.printf("%-10s%-20s%-10.2f%-10d%10.2f\n", product[j].getProdID(), product[j].getProdName(), product[j].getPrice(), product[j].getQuantity(), product[j].getPrice() * product[j].getQuantity());
                        }
                        System.out.printf("\n%50s%10.2f\n", "Member Discount : ",purchase[i].getDiscount());        
                        System.out.printf("%60s\n","======");
                        System.out.printf("%60.2f\n",purchase[i].getTotal());
                        System.out.printf("%60s\n\n","======"); 
                    }
                    System.out.println(member[index].getNumberOfPurchase() + " purchase returned.\n");
                }
                else{
                    System.out.printf("No purchase history found for member %s\n\n", member[index].getMemberID());
                }
                
                
            }
            else{
                System.out.println("Member ID not found.\n");
            }
            
            do{
                System.out.print("Search another member ? (Y = Yes / N = No) : ");
                verification = scan.nextLine().charAt(0);
                if(Character.toUpperCase(verification) != 'Y' && Character.toUpperCase(verification) != 'N')
                System.out.println("Invalid Input\n");
            }while(Character.toUpperCase(verification) != 'Y' && Character.toUpperCase(verification) != 'N');
        }
    }
    
    
}