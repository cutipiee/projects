package com.java.threads;

public class FileMock {
	private String content[];
	private int index;

	public FileMock(int size, int length) {
		content = new String[size];
		for (int i = 0; i < 10; i++) {
			StringBuffer buffer = new StringBuffer(length);

			for (int j = 0; j < length; j++) {
				int indice = (int) Math.random() * 255;
				buffer.append((char) indice);
			}
			content[i] = buffer.toString();
		}
		index = 0;
	}

	public boolean hasMoreLine() {
		return index < content.length;
	}

	public String getLine() {
		if (this.hasMoreLine()) {
			System.out.println("Mock:" + (content.length - index));
			return content[index++];
		}
		return null;
	}

}
