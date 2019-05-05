package global.help;

import java.util.HashMap;

public class LogUtils {

	
	public static String getStartLogMessage(String webName, HashMap<String, String> arg) {
		StringBuilder sb = new StringBuilder();
		sb.append(webName);
		if (arg != null && arg.size() > 0) {
			sb.append(",参数(");
			for (String key : arg.keySet()) {
				sb.append(key);
				sb.append(":");
				sb.append(arg.get(key));
				sb.append(",");
			}
			sb.append(")");
		}
		return sb.toString().replace(",)", ")");
	}
}
