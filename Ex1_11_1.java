/*-< 演習：Ex1_11_1 >---------------------------------
while文を使用して、6の目がでるまでサイコロを降り続けるプログラムを作成してください。
※1～6までのランダムなint型の値を取得する方法 ： 1 + (int)(Math.random() * 6.0)
※6の目が出たら「6が出たのでを終了します」と表示してください
----------------------------------------------------*/
class Ex1_11_1 {
	public static void main (String[] args) {

		System.out.println("「６が出るまでサイコロをふり続けます」");

		//	初期値設定
		int dice = 0 ;

		//	サイコロをふる（１〜６のランダムな値を格納）
		dice = 1 + (int)(Math.random() * 6.0 );

		//	サイコロの目を表示
		System.out.println(dice);

		//	６が出るまでサイコロをふりつづける
		while( dice != 6 ) {

			dice = 1 + (int)( Math.random() * 6.0 ) ;
			System.out.println(dice) ;

		}

		//	繰り返しが終わったら、終了メッセージを表示
		System.out.println("「６が出たので終了します」");


	}
}
