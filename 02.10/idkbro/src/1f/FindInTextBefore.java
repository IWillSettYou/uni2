void main(){
    String what = "what the hell is going on here, but for real man";

    IO.println(firstFindIdx(what, 5, 10));

    IO.println(firstFindIdx(what.replace(" ", ""), 5, 10));
}

int firstFindIdx(String str, int n, int m){
    for(int i = 0; i <= str.length(); i++){
        if(str.substring(n, m).equals(str.substring(i, m - n + i))){
            return i;
        }
    }
    return -1;
}
