//match the candidate blocks of code with the output that 
//you'd see if the blocks werw inserted

// public class Mix4 {
//     int counter = 0;

//     public static void main(String[] args){
//         int count = 0;
//         Mix4[] mixes = new Mix4[20];
//         int i = 0;
//         while(){
//             mixes[i] = new Mix4();
//             mixes[i].counter = mixes[i].counter + 1;
//             count = count + 1;
//             count = count + mixes[i].maybeNew(i);
//             i = i + 1;
//         }
//         System.out.println(count + " " + mixes[1].counter);
//     }

//     public int maybeNew(int index){
//         if(){
//             Mix4 mix = new Mix4();
//             mix.counter = mix.counter + 1;
//             return 1;
//         }
//         return 0;
//     }
// }

//i < 9 e index < 5

// public class Mix4 {
//     int counter = 0;

//     public static void main(String[] args){
//         int count = 0;
//         Mix4[] mixes = new Mix4[20];
//         int i = 0;
//         while(i < 9){
//             mixes[i] = new Mix4();
//             mixes[i].counter = mixes[i].counter + 1;
//             count = count + 1;
//             count = count + mixes[i].maybeNew(i);
//             i = i + 1;
//         }
//         System.out.println(count + " " + mixes[1].counter);
//     }

//     public int maybeNew(int index){
//         if(index < 5){
//             Mix4 mix = new Mix4();
//             mix.counter = mix.counter + 1;
//             return 1;
//         }
//         return 0;
//     }
// }

//output: 14 1

//i < 20 e index < 5

// public class Mix4 {
//     int counter = 0;

//     public static void main(String[] args){
//         int count = 0;
//         Mix4[] mixes = new Mix4[20];
//         int i = 0;
//         while(i < 20){
//             mixes[i] = new Mix4();
//             mixes[i].counter = mixes[i].counter + 1;
//             count = count + 1;
//             count = count + mixes[i].maybeNew(i);
//             i = i + 1;
//         }
//         System.out.println(count + " " + mixes[1].counter);
//     }

//     public int maybeNew(int index){
//         if(index < 5){
//             Mix4 mix = new Mix4();
//             mix.counter = mix.counter + 1;
//             return 1;
//         }
//         return 0;
//     }
// }

//output: 25 1  

//i < 7 e index < 7

// public class Mix4 {
//     int counter = 0;

//     public static void main(String[] args){
//         int count = 0;
//         Mix4[] mixes = new Mix4[20];
//         int i = 0;
//         while(i < 7){
//             mixes[i] = new Mix4();
//             mixes[i].counter = mixes[i].counter + 1;
//             count = count + 1;
//             count = count + mixes[i].maybeNew(i);
//             i = i + 1;
//         }
//         System.out.println(count + " " + mixes[1].counter);
//     }

//     public int maybeNew(int index){
//         if(index < 7){
//             Mix4 mix = new Mix4();
//             mix.counter = mix.counter + 1;
//             return 1;
//         }
//         return 0;
//     }
// }

//output: 14 1

public class Mix4 {
    int counter = 0;

    public static void main(String[] args){
        int count = 0;
        Mix4[] mixes = new Mix4[20];
        int i = 0;
        while(i < 19){
            mixes[i] = new Mix4();
            mixes[i].counter = mixes[i].counter + 1;
            count = count + 1;
            count = count + mixes[i].maybeNew(i);
            i = i + 1;
        }
        System.out.println(count + " " + mixes[1].counter);
    }

    public int maybeNew(int index){
        if(index < 1){
            Mix4 mix = new Mix4();
            mix.counter = mix.counter + 1;
            return 1;
        }
        return 0;
    }
}

//output: 20 1