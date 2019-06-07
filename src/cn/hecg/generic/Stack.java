package cn.hecg.generic;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 功能：不带泛型的自定义堆栈实现
 *
 * @author hecg
 * @version 2019年5月21日
 */
public class Stack {
	// 定义一个数组，保存数据，即堆栈
	private Object[] elements;
	// 根据当前堆栈的元素下标
	private int size = 0;
	// 定义堆栈的初始化大小为16
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public Stack() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	/**
	 * 功能：向堆栈中添加元素
	 *
	 * @author hecg
	 * @version 2019年5月21日
	 */
	public void push(Object e) {
		// 先判读堆栈是否已满，如果已满则新建一个堆栈，堆栈大小是原先堆栈大小的2倍加1，并将原先堆栈数据复制到新建的堆栈里面
		ensureCapacity();
		elements[size++] = e;
	}

	/**
	 * 功能：向堆栈中取数据
	 *
	 * @author hecg
	 * @version 2019年5月21日
	 */
	public Object pop() {
		// 判断
		if (size == 0) {
			throw new EmptyStackException();
		}
		Object result = elements[--size];
		elements[size] = null;
		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * 功能：判断堆栈中数据是否已满，如果已满则新建一个数组，长度是原先数据的2倍+1，并且原数组的值拷贝到新建的新数组里面
	 *
	 * @author hecg
	 * @version 2019年5月21日
	 */
	private void ensureCapacity() {
		if (elements.length == size) {
			elements = Arrays.copyOf(elements, 2 * size + 1);
		}
	}
}
