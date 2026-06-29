package java_homework.exception2.kadai_03;

public class Main {
    public static void main(String[] args) {
        SaveService service = new SaveService();

        String[] texts = {"Hello", "error", "Java"};

        for (String text : texts) {
            try {
                service.save(text);

            } catch (FileSaveException e) {
                System.out.println("保存に失敗しました：" + e.getMessage());
                System.out.println("スタックトレースを表示します");
                e.printStackTrace();
            }

            System.out.println();
        }
    }
}
