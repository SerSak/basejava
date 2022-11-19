import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        ArrayStorage arr1 = new ArrayStorage();

        Resume r1 = new Resume();
        Resume r2 = new Resume();
        Resume r3 = new Resume();
        r1.uuid = "uuid1";
        r2.uuid = "uuid2";
        r3.uuid = "uuid3";

        arr1.save(r1);
        arr1.save(r2);
        arr1.save(r3);

        System.out.println(arr1.get("uuid1"));
        arr1.delete("uuid1");
        System.out.println(Arrays.toString(arr1.storage));


        System.out.println(Arrays.toString(arr1.getAll()));

    }
}