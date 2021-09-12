/*
九九を表示するプログラム。
数値を一つ入力して実行することで、入力した数の団のみを表示することができる。
数値を入力せずに実行し場合は全ての段が表示される。
*/

class Ex1_04_1 {
  public static void main (String[] args) {
    for(int i = 1 ; i <= 9  ; i++){
      String disp3 = "";
      for(int j = 1 ; j <= 9  ; j++){
        disp3 = disp3 + i*j + " ";
      }
      if(args.length == 1)
        if(i == Integer.parseInt(args[0])){
          System.out.println(disp3);
        }
      }
      else{
        System.out.println(disp3);
      }
    }
  }
}

// ;が出てきたら、そのまま改行（インデント不要）。
// }が出てきたら、改行してタブを押す（インデント追加）。{がある文の先頭と、}は同じインデントにくる。