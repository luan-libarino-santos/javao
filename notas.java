void main() {
    float nota1 = Float.parseFloat(IO.readln("Digite a primeira nota \n "));
    float nota2 = Float.parseFloat(IO.readln("Digite a segunda nota \n "));
    float nota3 = Float.parseFloat(IO.readln("Digite a terceira nota \n "));
    

    if ((nota1 + nota2 + nota3)/3 >= 7.0) {
        System.out.printf("Aluno Aprovado com média %3.2f", (nota1 + nota2 + nota3)/3);
    } else {
        System.out.printf("Reprovadooooo! com média %3.2f", (nota1 + nota2 + nota3)/3 );
    }
}