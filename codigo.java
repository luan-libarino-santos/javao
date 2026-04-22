void main () {
    int ano = Integer.parseInt(IO.readln("Digite o ano:"));
    boolean bissexto = false;
    if (ano % 4 == 0 ) {
        bissexto = true;
    };
     if (bissexto) {
        IO.println(ano + " " + "é bissexto");
     }
     else {
        IO.println(ano + " " + "não é bissexto");
     }
}