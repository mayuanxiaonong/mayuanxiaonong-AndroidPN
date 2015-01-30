package org.androidpn.demoapp;

import java.util.List;

/**
 * Created by 9527 on 2015/1/30.
 */
public interface ExtList<E> extends List<E> {

	public void setOnDataChangedListener(DataChangedListener onDataChangedListener);

}
