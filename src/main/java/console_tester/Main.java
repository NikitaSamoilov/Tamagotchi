package console_tester;

import base.Param;
import base.Tamagotchi;

public class Main {

    public static void main(String[] args) {
        Tamagotchi tamagotchi = new Tamagotchi();

        Param<Integer> ageParam = new Param<Integer>();
        ageParam.setParamName("age");
        ageParam.setValue(Integer.valueOf(17));
        ageParam.setMaxValue(Integer.valueOf(100));
        ageParam.setMinValue(Integer.valueOf(0));
        ageParam.setAdequeteValue(null);

        tamagotchi.addParameter(ageParam);
        System.out.println(tamagotchi);

    }
}
