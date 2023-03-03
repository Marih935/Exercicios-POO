//Determine whether each of these files will compile and run without error. If they won't, how would you fix them?

//A
class Books{
    String title;
    String author;
}

class BooksTestDrive{
    public static void main(String[] args){
        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0].title = "Thegrapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while(x < 3){
            System.out.printl(myBooks[x].title);
            System.out.printl(" by ");
            System.out.printl(myBooks[x].author);
            x = x + 1;
        }
    }
}

//deu erro porque não foi instanciado o objeto myBooks[0], myBooks[1] e myBooks[2] e também não foi declarado o tipo do objeto, que é String.