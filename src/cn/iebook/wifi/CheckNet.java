package cn.iebook.wifi;

public class CheckNet {

	public void checkNet() {
		System.out.println("aa");
		System.out.println("cccc");
		System.out.println("bb");
		System.out.println("bbbb");
//		/* 判断客户端优选网络 */
//		if (getFirstNet()) {
//			logger.d("----....----.....---->>>first net is wifi");
//		/* 判断 机器wifi是否是打开状态 */
//			if (mWifiAccessManager.isWifiEnable()) {
//				wifiInfo = mWifiAccessManager.getWifiInfo();
//				logger.d("----....----.....---->>>wifiEnabled is true");
//				/* 判断是否已经连上附着在wifi热点上 */
//				if (wifiInfo.getNetworkId() != -1 && wifiInfo.getSSID() != null) {
//				/* 附着在某个WIFI热点之上 */
//					logger.d("...---->>>WIFI has binded a wifi hot");
//					GlobalSetting.WLAN_NAME = wifiInfo.getSSID();
//					checkWifiTaskHandler.sendEmptyMessageDelayed(0, 2000);
//				} else {
//				/* 沒有附着连接在任何wifi热点上 */
//					logger.d("...---->>>WIFI hasn't binded any wifi hot");
//				/* UI改变状态，通知搜索热点 ，弹出相应对话框 */
//					handler.sendEmptyMessage(R.string.search_wlan);
//					showMyDialog(Contants.DIALOG_TYPE_CHOICE_NET);
//				}
//			} else {
//				GlobalSetting.CURRENTNETTYPE = GlobalSetting.WAP;
System.out.println("test");
//				sendLogin();
//			}
//		} else {
//			GlobalSetting.CURRENTNETTYPE = GlobalSetting.WAP;
//			sendLogin();
//		}
	}

		/**
		* @return true:优选wlan false:优选cmwap
		*/
//		public boolean getFirstNet() {
//			return settings.getBoolean(Args.FIRST_NET, true);
//		}
}
