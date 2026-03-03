void main() {
    String fox = "The red fox jumps jumps over the lazy dog";
    int n = 6;
    int m = 7;


    IO.println(Hossz(fox));

    IO.println(Elso(fox));

    IO.println(Utolso(fox));

    IO.println(Elso(fox) + Utolso(fox));

    IO.println(ParamKarakter(fox, n, m));

    IO.println(Prefix(fox));
}

int Hossz(String fox){
    return fox.length();
}

String Elso(String fox){
    return fox.substring(0, 1);
}

String Utolso(String fox){
    return fox.substring(Hossz(fox) - 1, Hossz(fox));
}

String ParamKarakter(String fox, int n, int m){
    return fox.substring(0,n) + fox.substring(m,Hossz(fox));
}

String Prefix(String fox){
    String res = "";
    for(int i = 0; i < Hossz(fox); i++){
        for(int j = 0; j < i; j++){
            res += fox.charAt(j);
        }
    }
    return res;
}