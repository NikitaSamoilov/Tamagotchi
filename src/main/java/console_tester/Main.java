package console_tester;

import base.Param;
import base.Tamagotchi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        Tamagotchi tamagotchi = new Tamagotchi();

        Param<Integer> ageParam = new Param<Integer>();
        ageParam.setParamName("age");
        ageParam.setValue(Integer.valueOf(17));
        ageParam.setMaxValue(Integer.valueOf(100));
        ageParam.setMinValue(Integer.valueOf(0));
        ageParam.setAdequeteValue(null);

        tamagotchi.addParameter(ageParam);
        System.out.println(tamagotchi);

        FileOutputStream fileOutputStream = new FileOutputStream("test_ser.out");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(tamagotchi);
        objectOutputStream.flush();
        objectOutputStream.close();
    }
}
