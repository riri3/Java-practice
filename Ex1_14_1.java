class Ex1_14_1 {
	public static void main (String[] args) {

		int coinNumber = args.length;		//投入された硬貨の枚数
		int coinChk = 0;					//チェック対象の硬貨の金額
		int coinSum = 0;					//投入された硬貨の合計金額（有効な硬貨のみ）


		for ( int i=0 ; i<=args.length ; i++ ) {
			//このループでチェックする硬貨をセット
			coinChk = Integer.parseInt(args[i]);

		if ( coinChk == 10 || coinChk == 50 || coinChk == 100 || coinChk == 500 ) {
			System.out.println("１円玉は使えません");

		}
		else if ( coinChk == 5 ) {
			System.out.println("５円玉は使えません");
		}

		else {
			System.out.println( coinChk + "は硬貨として適切な値ではありません" );
		}
		System.out.println("ただいまの投入金額は" + coins +"円です");
		}

	}
}