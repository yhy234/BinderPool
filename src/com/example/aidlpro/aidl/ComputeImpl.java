package com.example.aidlpro.aidl;

import android.os.RemoteException;

public class ComputeImpl extends ICompute.Stub{

	@Override
	public int add(int a, int b) throws RemoteException {
		return a+b;
	}

}
