package cn.hecg.generic;

import java.util.Collection;
import java.util.Iterator;

/**
 * 功能：测试利用有限制的通配符来提升api的灵活性
 *
 * @author hecg
 * @version 2019年5月25日
 */
public class Stack2<E> {
	public Stack2() {
	}

	public void push(E e) {
	};

	public E pop() {
		return null;
	};

	public boolean isEmpty() {
		return false;
	};

//	public void pushAll(Iterable<E> src) {
//		for (E e : src) {
//			push(e);
//		}
//	}

	public void pushAll(Iterable<? extends E> src) {
		for (E e : src) {
			push(e);
		}
	}
	
	public static void main(String[] args) {
		Stack2<Number> numberStack = new Stack2<Number>();
		Iterable<Integer> integers = new Iterable<Integer>() {
			@Override
			public Iterator<Integer> iterator() {
				return null;
			}
		};
		numberStack.pushAll(integers);
		
	}
	
	public void popAll(Collection<? super E> dst) {
		while(!isEmpty()) {
			dst.add(pop());
		}
	}

}
