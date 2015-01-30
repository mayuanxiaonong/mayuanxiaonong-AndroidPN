package org.androidpn.demoapp;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by 9527 on 2015/1/30.
 */
public class ExtArrayList<E> extends ArrayList<E> implements ExtList<E> {

	private DataChangedListener onDataChangedListener = null;

	@Override
	public boolean add(E object) {
		boolean b = super.add(object);
		notifyDataChanged();
		return b;
	}

	@Override
	public void add(int index, E object) {
		super.add(index, object);
		notifyDataChanged();
	}

	@Override
	public boolean addAll(Collection<? extends E> collection) {
		boolean b = super.addAll(collection);
		notifyDataChanged();
		return b;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> collection) {
		boolean b = super.addAll(index, collection);
		notifyDataChanged();
		return b;
	}

	@Override
	public void clear() {
		super.clear();
		notifyDataChanged();
	}

	@Override
	public E remove(int index) {
		E e = super.remove(index);
		notifyDataChanged();
		return e;
	}

	@Override
	public boolean remove(Object object) {
		boolean b = super.remove(object);
		notifyDataChanged();
		return b;
	}

	@Override
	protected void removeRange(int fromIndex, int toIndex) {
		super.removeRange(fromIndex, toIndex);
		notifyDataChanged();
	}

	@Override
	public E set(int index, E object) {
		E e = super.set(index, object);
		notifyDataChanged();
		return e;
	}

	@Override
	public void setOnDataChangedListener(DataChangedListener onDataChangedListener) {
		this.onDataChangedListener = onDataChangedListener;
	}

	private void notifyDataChanged() {
		if(onDataChangedListener != null)
			onDataChangedListener.onChanged();
	}
}
