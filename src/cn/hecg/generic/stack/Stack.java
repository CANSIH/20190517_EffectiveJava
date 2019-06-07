package cn.hecg.generic.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 功能：测试带泛型的自定义栈
 *
 * @author hecg
 * @version 2019年5月21日
 */
public class Stack<E> {
	// 定义一个数组，保存数据，即栈
	private E[] elements;
	// 当前栈的下标
	private int size = 0;
	// 栈的初始大小
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	@SuppressWarnings("unchecked")
	public Stack() {
		elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
	}

	/**
	 * 功能：向栈中添加元素，后进先出，需要先判断栈是否已满，如果已满则新建一个栈，新栈的大小为原先栈大小的2倍+1，然后将原先栈的元素依次复制到新栈中
	 *
	 * @author hecg
	 * @version 2019年5月21日
	 */
	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}

	/**
	 * 功能：从栈中取出元素，后进先出，需要先判断栈中的元素是否已经取完了，如果已经取完了则抛出异常
	 *
	 * @author hecg
	 * @version 2019年5月21日
	 */
	public E pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		E result = elements[--size];
		elements[size] = null;
		return result;
	}

	/**
	 * 功能：判断栈是否已空
	 *
	 * @author hecg
	 * @version 2019年5月21日
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * 功能：判断栈中数据是否已满，如果已满则新建一个数组，长度是原先栈的长度的2倍+1，并且原数组的值拷贝到新建的新数组里面
	 *
	 * @author hecg
	 * @version 2019年5月21日
	 */
	private void ensureCapacity() {
		if (size == elements.length) {
			elements = Arrays.copyOf(elements, 2 * size + 1);
		}
	}
}
