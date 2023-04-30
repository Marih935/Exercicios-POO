//determine wich of the reference variables refer to which objects

class HeapQuiz {
    int id = 0;

    public static void main(String[] args) {
        int x = 0;
        HeapQuiz[] hq = new HeapQuiz[5];
        while (x < 3) {
            hq[x] = new HeapQuiz();
            hq[x].id = x;
            x = x + 1;
        } //ocorre um loop de 0 a 2, criando 3 objetos e atribuindo a cada um deles um id de 0 a 2
        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];
        //do stuff
    }
}

//id = 0 -> hq[0] -> hq[3] -> hq[2]
//id = 1 -> hq[1] -> hq[4]
//id = 2 -> hq[2] -> hq[0]
