import java.util.ArrayList;


class LibraryItem{
        private int id;
        public String title;
        public int year;
        public LibraryItem(int id, String title, int year){
            this.id=id;
            this.title=title;
            this.year=year;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;

        }
        public String Details(){
            return "Id: " + id + " Title: "+title + " Year: " +year;
        }
    }
    class Book extends LibraryItem{
       public  String author;
       public Book(int id, String title, int year, String author){
           super(id, title, year);
           this.author= author;

       }
       public String Details(){
           return super.Details()+ "Author: "+author;
       }

    }
    class Magazine extends LibraryItem{
        public String issueDate;
        public Magazine(int id, String title, int year, String author, String issueDate) {
            super(id, title, year);
            this.issueDate = issueDate;
        }
            public String Details(){
                return super.Details()+ ", Issue Date: " + issueDate;
            }
        }

    class Library{
        public ArrayList<LibraryItem> items;
        public Library(){
            items = new ArrayList<>();
        }
        public void addItem(LibraryItem item){
            items.add(item);
        }
        public void removeItem(LibraryItem item){
            items.remove(item);
        }
        public void displayItems(){
            for(LibraryItem item : items){
                System.out.println(item.Details());
            }
        }

    }
public class Main {
    public static void main(String[] args) {
        Library l1 = new Library();
        Book b1 = new Book(1001, "HarryPotter ", 2011, " Jk Rowling");
        Magazine m1 = new Magazine(1002, "Hamlet", 2015, "ShakeSphere", "16-May-2023");
        l1.addItem(b1);
        l1.addItem(m1);
        l1.displayItems();


    }
}


