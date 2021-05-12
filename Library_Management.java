

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

class Library1
{
    String [] name_of_Books = new String[100];
     int books = 5;
     String author_of_the_book;

   Library1()
    {
    name_of_Books[0] = "Maths";
    name_of_Books[1] = "Java";
    name_of_Books[2] = "Computer Science";
    name_of_Books[3] = "Physics";
    name_of_Books[4] = "Economic";
    
   }
    
    void ShowAvailableBooks()
    {
        System.out.println("The list of available books are: ");
        for (String item : this.name_of_Books){

            if (item == null){
                continue;
            }

            System.out.println("* " + item);
            System.out.println();
    }
    }

    void Author_of_Book()
    {
        try{
            Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter author of book: ");
        this.author_of_the_book = sc.nextLine();
        }
        catch(InputMismatchException e){
            System.out.println(e);
            System.out.println("Please Enter String Type Input");
        }
        }
       
    void issueBook()  {
        
        Calendar c = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        ShowAvailableBooks();
        System.out.print("\nEnter the name of book you want to issue: ");
        String user1 = sc.nextLine();
        for (int i = 0; i < this.name_of_Books.length; i++) {

            if (user1.equalsIgnoreCase(this.name_of_Books[i]))
            {
                System.out.println("Congratulation!You issued this book.Issued date is " + c.get(Calendar.DAY_OF_MONTH) + ":" + c.get(Calendar.MONTH) + ":" + c.get(Calendar.YEAR));

                this.name_of_Books[i] = null;
                return;
        }
    }
        System.out.println("Sorry!This Book is not available.This book already issued");
    }

    void addBook()
    {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter this name of book you want to add: ");
            String user2 = sc.next();
            Author_of_Book();
            this.name_of_Books[books] = user2;
            books++;
            System.out.println("\nThis book is Successfully added to the library");
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
       
    }

    void returnIssuedBook()
    {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter the name of book you want to return: ");
            String user3 = sc.next();
            this.name_of_Books[books] = user3;
            books++;
            System.out.println("\nThis book is Successfully return");
        }
        catch(InputMismatchException e){
            System.out.println(e);    }
            
    }

    void runAllMethod()
    {
       while (true){
           try{
            System.out.println("What you want from these options!\n" +
            "Press 1 for Issue Books\n" +
            "Press 2 for Return Books\n" +
            "Press 3 for Add new Books\n" +
            "Press 4 for List of available Books\n" +
            "Press 5 for Exit");
            
    System.out.print("\nType here: ");
    Scanner sc= new Scanner(System.in);
    int user = sc.nextInt();

    if (user == 1) {
        issueBook();
    } else if (user == 2) {
        returnIssuedBook();
    } else if (user == 3) {
        addBook();
    } else if (user == 4) {
        ShowAvailableBooks();
    } else if(user==5){
        System.exit(1);
    }
     else {
        System.out.println("Something Wrong!Please enter again");
    }
           }
       catch(InputMismatchException e){
           System.out.println("Exception : " +e);
           System.out.println("Please Try Again with Valid Input");
       }             
       }
    }
}
public class Library_Management {
    public static void main(String[] args) {
        System.out.println("Welcome to the Library");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter you name: ");
        String name_of_user = sc.nextLine();
        System.out.println("Hello "+name_of_user);

        Library1 run = new Library1();
       run.runAllMethod();
    }
}