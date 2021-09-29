class Ex1_14_2{
	public static void main (String[] args) {

		int coinNum = args.length - 1;							//投入された硬貨の枚数
		int price = Integer.parseInt(args[args.length - 1]);	//購入された商品の値段
		int coinChk = 0 ;                                	    //チェック対象の硬貨の金額
		int coinSum = 0 ;                                       //投入された硬貨の合計金額 ※使用可能な硬貨のみで算出
		int change = 0;                                     	//お釣り

		for ( int i=0 ; i < coinNum ; i++ ) {
			coinChk = Integer.parseInt(args[i]) ;

			if ( coinChk == 10 || coinChk == 50 || coinChk == 100 || coinChk == 500 ) {
				System.out.println(coinChk + "円が投入されました");
				coinSum += coinChk;
			}else if( coinChk == 1 || coinChk == 5 ) {
				System.out.println("警告：" + coinChk + "円玉は使えません");
			}else {
				System.out.println("警告：" + coinChk + "は硬貨として適切な値ではありません");
			}
		}
		//合計金額から購入された商品の値段を引いてお釣りを算出
		change = coinSum - price ;

		if (change > 0) {
			System.out.println("お釣りは" + change + "円です。ありがとうございました。");
		}else if( change == 0 ){
			System.out.println("ちょうどのお預かりです。ありがとうございました。");
		}else {
		System.out.println("お金が" + Math.abs(change) + "円足りません。追加で投入してください。");
		}
	}
}