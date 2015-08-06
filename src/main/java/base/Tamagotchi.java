package base;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Tamagotchi implements Serializable {
    protected Map<String, Param<?>> params;

    protected Map<String, Param<?>> getMap() {
        if (params == null) {
            params = new HashMap<String, Param<?>>();
        }
        return params;
    }

    public void addParameter(Param<?> param) {
        if (getMap().containsKey(param.getParamName())) {
            throw new IllegalArgumentException(
                    String.format("Parameter with name %s has already exist", param.getParamName()));
        }
        getMap().put(param.getParamName(), param);
    }

    public Param<?> getParameter(String paramName) {
        return getMap().get(paramName);
    }


    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder("Tamagotchi:\n");
        for (Map.Entry<String, Param<?>> paramEntry : getMap().entrySet()) {
            strBuilder.append(String.format("\t%s : %s\n", paramEntry.getKey(), paramEntry.getValue().getValue()));
        }
        return strBuilder.toString();
    }
}
