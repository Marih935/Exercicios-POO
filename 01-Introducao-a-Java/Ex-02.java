//Exercise: determine wether each of these files will compile. If they won't compile, how would you fix them?

//A
// class Exercise1a{
//     public static void main(String[] args){
//         int x = 1;
//         while (x < 10){
//             if (x > 3){
//                 System.out.println("big x");
//             }
//         }
//     }
// }

//B
// public static void main(String[] args){
//     int x = 5;
//     while (x > 1){
//         x = x - 1;
//         if (x < 3){
//             System.out.println("small x");
//         }
//     }
// }

//C
// class Exercise1c{
//     int x = 5;
//     while (x > 1){
//         x = x - 1;
//         if (x < 3){
//             System.out.println("small x");
//         }
//     }
// }

//A: compila
//B: não compila, pois não há uma classe e um método main
//C: não compila, pois não há um método main

//Correções:

//B
// class Exercise1b{
//     public static void main(String[] args){
//         int x = 5;
//         while (x > 1){
//             x = x - 1;
//             if (x < 3){
//                 System.out.println("small x");
//             }
//         }
//     }
// }

//C
// class Exercise1c{
//     public static void main(String[] args){
//         int x = 5;
//         while (x > 1){
//             x = x - 1;
//             if (x < 3){
//                 System.out.println("small x");
//             }
//         }
//     }
// }