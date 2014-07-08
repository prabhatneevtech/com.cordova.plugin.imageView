package com.neev.cordova;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;
import org.json.JSONException;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class ImageViewer extends CordovaPlugin{
	private static final String TAG = "Image";
	
	//actions
	private static final String OPENIMAGE = "openImage";;
	
	
	private CallbackContext connectCallback;
	
	@Override
    public boolean execute(String action, CordovaArgs args, CallbackContext callbackContext) throws JSONException {
		LOG.d(TAG, "action = " + action);
		
		if (action.equals(OPENIMAGE)) {
			String url =args.getString(0);
			//getPairedDevice(callbackContext);
			openImage(url);
		}
		
		return true;
	}
	
	public void openImage(String url){
		Intent intent = new Intent();
		intent.setAction(Intent.ACTION_VIEW);
		intent.setDataAndType(Uri.parse(url), "image/*");
		this.cordova.getActivity().startActivity(intent);
	}
}