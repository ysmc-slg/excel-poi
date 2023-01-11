package top.zxqs.exception;

/**
 * @Author: zxq
 * @date: 2023-01-06 15:31
 */
public class FileNameLengthLimitExceededException extends RuntimeException {
    public FileNameLengthLimitExceededException(int defaultFileNameLength) {
        super(String.format("上传的文件名最长 %d 个字符", defaultFileNameLength));
    }
}
