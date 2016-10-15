package bo.gob.asfi.tipos.app;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * Created by fernando on 10/14/16.
 */
public class SubFolders
{
	public List recurseDir(String dir) {
		String result, _result[];

		result = recurseInDirFrom(dir);
		_result = result.split("\\|");
		return Arrays.asList(_result);
	}

	private String recurseInDirFrom(String dirItem) {
		File file;
		String list[], result;

		result = dirItem;

		file = new File(dirItem);
		if (file.isDirectory()) {
			list = file.list();
			System.out.println("(dir)" + file);
			for (int i = 0; i < list.length; i++)
				result = result + "|" + recurseInDirFrom(dirItem + File.separatorChar + list[i]);
		} else {
			System.out.println("     " + dirItem);
		}
		return result;
	}

	public void run() {
		recurseDir("./");
	}
}
