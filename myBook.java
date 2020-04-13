
//T4
import java.util.Scanner;

public class myBook {
    public static void main (String [] args) {
    
        Scanner input = new Scanner(System.in);
        
        int n=0;
        
        String title, mostExpensiveBook="";
        double price;
        double highestPrice=0;

        System.out.print("Number of books: ");
        n = input.nextInt();
        Book [] Library = new Book[n];

        for (int i=0;i<n;i++){
            input.nextLine();
            System.out.print("Title: ");
            
            title = input.nextLine();
            System.out.print("Price: ");
            price = input.nextDouble();

            Library[i] = new Book(title,price);

            if (Library[i].getPrice()>highestPrice){
            
                highestPrice = Library[i].getPrice();
                mostExpensiveBook = Library[i].getTitle();
            }
        }
        System.out.printf(mostExpensiveBook , "\" has the highest price with RM " , highestPrice);
        System.out.println();
        System.out.println("Books that contain the term " + "Java"+ " in their title:");
        
        for(int j=0;j<n;j++){
        
            if(Library[j].getTitle().indexOf("Java")!=-1)
                System.out.println(Library[j].getTitle());
        }

    }
}

class Book {

    private String title;      //book’s title
    private double price;      //book’s price

    public Book(String t, double p) {
    
        title = t;
        price = p;
    }
    public String getTitle() {
    
        return title;
    }

    public double getPrice() {
    
        return price;
    }
}

