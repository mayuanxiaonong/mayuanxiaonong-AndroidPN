package org.androidpn.demoapp;

import java.util.List;
import java.util.SortedSet;

/**
 * Created by 9527 on 2015/1/30.
 */
public class Test {

	public static void main(String[] args) {
		final ExtList<String> list = new ExtArrayList<String>();
		list.setOnDataChangedListener(new DataChangedListener() {
			@Override
			public void onChanged() {
				System.out.println("changed " + list);
			}
		});

		list.add("123");
		list.add("abc");
		list.set(1, "zzz");
	}
}
