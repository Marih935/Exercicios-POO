//Exercise: making your first object

//1-Write yout class

class Aluno {
    String nome;
    int idade;
    String curso;

    void estudar() {
        System.out.println("Estou estudando");
    }
}

//2-Write a tester (TestDrive) class
//3-In your tester, make an object an accsess the object's variables and methods

class AlunoTestDrive {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome = "Maria";
        a.idade = 18;
        a.curso = "Engenharia";
        a.estudar();
    }
}