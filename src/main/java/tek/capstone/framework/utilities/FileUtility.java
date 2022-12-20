package tek.capstone.framework.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileUtility {

	public static FileInputStream getFileInputStream(String filepath) throws FileNotFoundException {
		return new FileInputStream(new File(filepath));
	}
}
