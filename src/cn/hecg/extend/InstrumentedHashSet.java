package cn.hecg.extend;

import java.util.Collection;
import java.util.HashSet;

/**
 * 功能：复合优先于继承
 *
 * @author hecg
 * @version 2019年5月19日
 */
public class InstrumentedHashSet<E> extends HashSet<E> {
	private static final long serialVersionUID = 1507547547151638108L;

	private int addCount = 0;

	public int getAddCount() {
		return addCount;
	}

	public InstrumentedHashSet() {

	}

	public InstrumentedHashSet(int initCap, float loadFactor) {
		super(initCap, loadFactor);
	}

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}
}