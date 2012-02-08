package com.roobit.android.restclient;

import android.net.Uri;
import android.os.AsyncTask;

public class RestClientRequestTask extends AsyncTask<Object, Void, RestResult> {

	public interface RestClientRequestListener {
		public void requestStarted();
		public void requestCancelled();
		public void requestFinished(RestResult result);
	}

	RestClientRequestListener listener;
	
	public RestClientRequestTask(RestClientRequestListener listener) {
		this.listener = listener;
	}

	@Override
	protected RestResult doInBackground(Object... args) {
		RestClient.Operation op = (RestClient.Operation) args[0];
		Uri uri = (Uri) args[1];
		return RestClientRequest.synchronousExecute(op, uri);
	}

	
	@Override
	protected void onPreExecute() {
		if (listener != null) {
			listener.requestStarted();
		}
	}

	@Override
	protected void onCancelled() {
		if (listener != null) {
			listener.requestCancelled();
		}
	}

	@Override
	protected void onPostExecute(RestResult result) {
		if (listener != null) {
			listener.requestFinished(result);
		}
	}	
}
