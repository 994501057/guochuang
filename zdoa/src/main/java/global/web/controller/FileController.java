package global.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * Controller - 文件
 */
@Controller("commonFileController")
@RequestMapping("/common/file")
@PropertySource("classpath:/file/file.properties")
public class FileController {
	@Autowired
	Environment env;

	/**
	 * 上传
	 */
	@PostMapping("/upload")
	public ResponseEntity<?> upload(HttpServletRequest request, MultipartFile file) {
		Map<String, Object> data = new HashMap<>();
		if (file == null || file.isEmpty()) {
			data.put("message", "上传失败,文件不能为空");
		}
		String path = env.getProperty("upLoadPath");
		if (!file.isEmpty()) {
			// 上传文件路径
			if (StringUtils.isEmpty(path)) {
				path = request.getServletContext().getRealPath("/images/");
			}
			// 上传文件名
			String filename = file.getOriginalFilename();
			File filepath = new File(path, filename);
			// 判断路径是否存在，如果不存在就创建一个
			if (!filepath.getParentFile().exists()) {
				filepath.getParentFile().mkdirs();
			}
			// 将上传文件保存到一个目标文件当中
			File tofile = new File(path + File.separator + filename);
			try {
				file.transferTo(tofile);
				data.put("url", tofile.getAbsolutePath());
				data.put("message", "上传成功");
			} catch (IllegalStateException e) {
				data.put("message", "上传异常");
			} catch (IOException e) {
				data.put("message", "上传异常");
			}

		} else {
			data.put("message", "上传失败");
		}
		return ResponseEntity.ok(data);
	}
}