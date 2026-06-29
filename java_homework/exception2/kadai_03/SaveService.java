package java_homework.exception2.kadai_03;

public class SaveService {

    public void save(String text) throws FileSaveException {
        try (SimpleFileWriter writer = new SimpleFileWriter()){
           
            writer.write(text);
            System.out.println("保存に成功しました");

        } catch (FileWriteException e) {
            throw new FileSaveException("保存処理に失敗しました", e);

        } 
    }
}