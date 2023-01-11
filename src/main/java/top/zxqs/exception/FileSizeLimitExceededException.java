package top.zxqs.exception;

/**
 * 文件名大小限制异常类
 *
 * @author ruoyi
 */
public class FileSizeLimitExceededException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public FileSizeLimitExceededException(long defaultMaxSize) {
        super(String.format("上传的文件大小超出限制的文件大小！<br/>允许的文件最大大小是：%d MB！", defaultMaxSize));
    }
}
