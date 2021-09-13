/*-< 演習：Ex1_05_1 >-------------------------------------------------------------------
以下①～⑤のデータを格納する変数を定義したい。
それぞれに適した型で変数宣言&初期化を行ってください。
なお、変数名はJavaの一般的に規則に従っていることはもちろん、
「どのようなデータが格納されているか一目でわかる名前」になるよう意識してつけてください。
  ① IT業界の生涯賃金（調べてください）
  ② IT業界の市場規模（調べてください）
  ③ 自分の好きな漢字1文字 ※char型を使いましょう
  ④ 自分のなりたい職業
  ⑤ 自分が既卒かどうか ※boolean型を使いましょう
--------------------------------------------------------------------------------------*/
class Ex1_05_1 {
	public static void main (String[] args) {

		int     itIndustryLifetimeWage = 201258100 ;            //IT業界の生涯賃金
		System.out.println("IT業界の生涯賃金：" + itIndustryLifetimeWage);

		long    itIndustryMarketSize  = 17268300000000L ;		//IT業界の市場規模
		System.out.println("IT業界の市場規模：" + itIndustryMarketSize);

		char    kanji                  = '瞳' ;            		//自分の好きな漢字1文字
		System.out.println("自分の好きな漢字１文字：" + kanji);

		String  myIdealJob             = "system engineer" ;    //自分のなりたい職業
		System.out.println("自分のなりたい職業：" + myIdealJob);

		boolean isPreviousGraduate     = true ;                 //自分が既卒かどうか
		System.out.println("既卒かどうか：" + isPreviousGraduate);

	}
}