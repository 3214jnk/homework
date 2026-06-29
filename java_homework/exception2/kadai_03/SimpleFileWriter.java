package java_homework.exception2.kadai_03;

public class SimpleFileWriter implements AutoCloseable {

    public SimpleFileWriter() {
        System.out.println("ファイルを開きました");
    }

    public void write(String text) throws FileWriteException {
        if (text.equals("error")) {
            throw new FileWriteException("書き込みに失敗しました");
        }

        System.out.println("書き込みました：" + text);
    }

    @Override
    public void close() {
        System.out.println("ファイルを閉じました");
    }
}