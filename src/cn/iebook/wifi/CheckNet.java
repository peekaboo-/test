package cn.iebook.wifi;

public class CheckNet {

	public void checkNet() {
		System.out.println("aa");
		System.out.println("cccc");
		System.out.println("bb");
		System.out.println("bbbb");
//		/* �жϿͻ�����ѡ���� */
//		if (getFirstNet()) {
//			logger.d("----....----.....---->>>first net is wifi");
//		/* �ж� ����wifi�Ƿ��Ǵ�״̬ */
//			if (mWifiAccessManager.isWifiEnable()) {
//				wifiInfo = mWifiAccessManager.getWifiInfo();
//				logger.d("----....----.....---->>>wifiEnabled is true");
//				/* �ж��Ƿ��Ѿ����ϸ�����wifi�ȵ��� */
//				if (wifiInfo.getNetworkId() != -1 && wifiInfo.getSSID() != null) {
//				/* ������ĳ��WIFI�ȵ�֮�� */
//					logger.d("...---->>>WIFI has binded a wifi hot");
//					GlobalSetting.WLAN_NAME = wifiInfo.getSSID();
//					checkWifiTaskHandler.sendEmptyMessageDelayed(0, 2000);
//				} else {
//				/* �]�и����������κ�wifi�ȵ��� */
//					logger.d("...---->>>WIFI hasn't binded any wifi hot");
//				/* UI�ı�״̬��֪ͨ�����ȵ� ��������Ӧ�Ի��� */
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
		* @return true:��ѡwlan false:��ѡcmwap
		*/
//		public boolean getFirstNet() {
//			return settings.getBoolean(Args.FIRST_NET, true);
//		}
}
