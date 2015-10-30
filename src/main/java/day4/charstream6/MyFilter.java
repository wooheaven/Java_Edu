package day4.charstream6;

import java.io.*;

public class MyFilter extends FilterInputStream {

	public MyFilter(InputStream in) {
		super(in);
	}

	@Override
	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c : Character.toUpperCase((char) c));
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int result = super.read(b, off, len);
		for (int i = off; i < off + result; i++) {
			b[i] = (byte) Character.toUpperCase((char) b[i]);
		}
		return result;
	}
}
