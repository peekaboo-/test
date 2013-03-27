package cn.iebook.wifi;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class TestWIFIActivity extends Activity {
    /** Called when the activity is first created. */
	private Button button=null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				getWifi();
				WifiInfoManager wifiInfoManager=new WifiInfoManager();
				ArrayList list=wifiInfoManager.getWifiInfo(TestWIFIActivity.this);
				
//				Collections.synchronizedList(list);
//				for (int i=0;i<list.size();i++) {
//					System.out.println(((WifiInfos)list.get(i)).mac);
//				}
			}
		});
    }
    
	public void getWifi() {
		WifiManager wm = (WifiManager) this
				.getSystemService(Context.WIFI_SERVICE);

		if (wm.startScan()) {
			//��ȡ�����п��õ�wifi
			List<ScanResult> wifis = wm.getScanResults();
			for (ScanResult scanResult : wifis) {
				
				Toast.makeText(this, "wifi��SSID���ǣ�"+scanResult.SSID+ "��wifi��������Ϣ�ǣ�"+scanResult.toString(), Toast.LENGTH_LONG).show();
			}
			//��ȡ��ǰ���ӵ�wifi
			List<WifiConfiguration> list = wm.getConfiguredNetworks();
			for (WifiConfiguration wifiConfiguration : list) {
				System.out.println("status="+wifiConfiguration.status
						+ "networkId="+wifiConfiguration.networkId + "��wifi��SSID���ǣ�="+wifiConfiguration.SSID);
			}
			Toast.makeText(this, "���Ѿ�������wifi", Toast.LENGTH_LONG).show();
		} else {
			Toast.makeText(this, "�Բ�������û�п���wifi,���ȿ���", Toast.LENGTH_LONG).show();
			startActivityForResult(new Intent(android.provider.Settings.ACTION_WIRELESS_SETTINGS), 0);
		}
	}
    
}