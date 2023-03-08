//Determine whether each of these files will compile and run without error. If they won't, how would you fix them?

//A
//não rodou pois a classe "Books" não foi inicializada antes de adicionar os valores

// class Books{
//     String title;
//     String author;
// }

// class BooksTestDrive{
//     public static void main(String[] args){
//         Books[] myBooks = new Books[3];
//         int x = 0;
//         myBooks[0].title = "Thegrapes of Java";
//         myBooks[1].title = "The Java Gatsby";
//         myBooks[2].title = "The Java Cookbook";
//         myBooks[0].author = "bob";
//         myBooks[1].author = "sue";
//         myBooks[2].author = "ian";

//         while(x < 3){
//             System.out.printl(myBooks[x].title);
//             System.out.printl(" by ");
//             System.out.printl(myBooks[x].author);
//             x = x + 1;
//         }
//     }
// }

//correção:
public class Books {
	String title;
	String author;
}

class BooksTestDrive {
	public static void main(String[] args) {
		Books[] myBooks = new Books[3];
		int x = 0;
		
		while (x < 3) {
            myBooks[x] = new Books();
            x = x + 1;
        }
		
		myBooks[0].title = "Thegrapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        x = 0;
        while (x < 3) {
            System.out.println(myBooks[x].title + " by " + myBooks[x].author);
            x = x + 1;
        }
	}
}

//B
//não compila pois o "h" só vai até o tamanho 2 mesmo recebendo 3

// class Hobbits {
// 	String name;
	
// 	public static void main(String[] args) {
// 		Hobbits[] h = new Hobbits[3];
// 		int z = 0;
		
// 		while (z < 4) {
// 			z = z + 1;
// 			h[z] = new Hobbits();
// 			h[z].name = "bilbo";
// 			if(z == 1) {
// 				h[z].name = "frodo";
// 			}
// 			if (z == 2) {
// 				h[z].name = "sam";
// 			}
// 			System.out.print(h[z].name + " is a ");
// 			System.out.println("good Hobbit name");
// 		}
// 	}
// }

//correção
public class Hobbits {
	String name;
	
	public static void main(String[] args) {
		Hobbits[] h = new Hobbits[3];
		int z = -1;
		
		while (z < 2) {
			z = z + 1;
			h[z] = new Hobbits();
			h[z].name = "bilbo";
			if(z == 1) {
				h[z].name = "frodo";
			}
			if (z == 2) {
				h[z].name = "sam";
			}
			System.out.print(h[z].name + " is a ");
			System.out.println("good Hobbit name");
		}
	}
}
