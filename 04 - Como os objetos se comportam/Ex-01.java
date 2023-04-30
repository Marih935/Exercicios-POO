//given the mthod below, which of the method calls 
//listed on the right are legal?

// int calcArea(int height, int width) {
//     return height * width;
// }

//1
// int a = calcArea(7, 12); // legal
// short c = 7;
// calcArea(c, 15); // legal

//2
// calcArea(2, 3); // legal

//3
// long t = 42;
// int f = calcArea(t, 17); // ilegal

//4
// int g = calcArea(); // ilegal

//5
// calcArea(); // ilegal

//6
// byte h = calcArea(4, 20); // legal

//7
// int j = calcArea(2, 3, 5); // ilegal

//os métodos 1, 2, 6 são legais
//os métodos 3, 4, 5, 7 são ilegais