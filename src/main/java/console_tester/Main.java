package console_tester;

import base.Param;
import base.Tamagotchi;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, JAXBException {
        Tamagotchi tamagotchi = new Tamagotchi();

        Param<String> nameParam = new Param<String>();
        nameParam.setParamName("name");
        nameParam.setValue("Toma");

        Param<Integer> ageParam = new Param<Integer>();
        ageParam.setParamName("age");
        ageParam.setValue(Integer.valueOf(17));
        ageParam.setMaxValue(Integer.valueOf(100));
        ageParam.setMinValue(Integer.valueOf(0));
        ageParam.setAdequeteValue(null);

        tamagotchi.addParameter(nameParam);
        tamagotchi.addParameter(ageParam);
        System.out.println(tamagotchi);

        FileOutputStream fileOutputStream = new FileOutputStream("test_ser.out");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(tamagotchi);
        objectOutputStream.flush();
        objectOutputStream.close();

        JAXBContext jaxbContext = JAXBContext.newInstance(Tamagotchi.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        StringWriter stringWriter = new StringWriter();
        marshaller.marshal(tamagotchi, stringWriter);
        stringWriter.close();
        System.out.println(stringWriter.toString());
    }
}
