package cn.iebook.wifi;

import java.util.ArrayList;

import android.content.Context;
import android.net.wifi.WifiManager;

public class WifiInfoManager {
	        WifiManager wm;
	        
	        public WifiInfoManager(){}
	        
	        public ArrayList getWifiInfo(Context context){
	                ArrayList<WifiInfos> wifi = new ArrayList();
	                wm = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
	                WifiInfos info = new WifiInfos();
	                wifi.add(info);
	                return wifi;
	        }

}
