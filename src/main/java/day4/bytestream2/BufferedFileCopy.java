package day4.bytestream2;

import java.io.*;

public class BufferedFileCopy {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("src/test/java/day4/bytestream1/FileCopy/origin.zip");
		BufferedInputStream bin = new BufferedInputStream(in);
		// BufferedInputStream bin = new BufferedInputStream(new FileInputStream("origin.zip"));

		OutputStream out = new FileOutputStream("src/test/java/day4/bytestream1/FileCopy/destin.zip");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		// BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("destin.zip"));

		File f = new File("src/test/java/day4/bytestream1/FileCopy/destin.zip");
		if (f.canWrite()) {
			f.delete();
			System.out.println("src/test/java/day4/bytestream1/FileCopy/destin.zip 파일이 있어서 지움");
		} else {
			System.out.println("src/test/java/day4/bytestream1/FileCopy/destin.zip 파일이 없음");
		}
		
		int copyByte = 0;
		int bData;

		long start = System.currentTimeMillis();

		while (-1!=(bData=bin.read())) {
			bout.write(bData);
			copyByte++;
		}

		long end = System.currentTimeMillis();

		bin.close();
		bout.close();
		System.out.println(end - start);
		System.out.println("복사된 파일은  " + copyByte + " 바이트 입니다.");
	}
}
