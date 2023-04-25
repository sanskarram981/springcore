package org.springcore.standalonecollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> phone;
    private Map<String,Integer> fees;
    private Properties props;

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phones) {
        this.phone = phone;
    }

    public Map<String, Integer> getFees() {
        return fees;
    }

    public void setFees(Map<String, Integer> fees) {
        this.fees = fees;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "Person{" +
                "phone=" + phone +
                ", fees=" + fees +
                ", props=" + props +
                '}';
    }
}
