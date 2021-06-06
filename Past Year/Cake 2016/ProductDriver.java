
public class ProductDriver {
    public static void main(String[] args) {
        Product [] prodArr = new Product[]{new Movie("Jeniffer Lawrence, Josh Hutcherson",2.22,"M1001","Hunger Games",99.99),
                                           new Book("Danial Liang",550,"B001","Programming",65.55)};
        
        for(int i=0;i<prodArr.length;i++){
            if(prodArr[i] instanceof Movie){
                System.out.println("Movie\n=====");
            }else{
                System.out.println("\nBook\n=====");
            }
            
            System.out.println(prodArr[i].toString());
        }
    }
}
