package file;

import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) throws SocketException, IOException {
		List<File> lists=new ArrayList<>();
		File file=new File("C:\\Users\\gjq\\Desktop\\微信图片_20180519204333.jpg");
		boolean uploadFile = FTPUtil.uploadFile(lists);
		System.out.println(uploadFile);
		
	}
}
