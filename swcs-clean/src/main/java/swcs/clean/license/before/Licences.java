package swcs.clean.license.before;

import java.util.HashMap;
import java.util.Map;

public final class Licences {
    private final Map<LicenceType, String> licences;

    public Licences() {
        this.licences = new HashMap<>();
        this.licences.put(new LicenceType("demo-licence"), "XARD-LOKU-CJKF-CLLF-OPLJJ");
    }

    public String get(LicenceType licence) {
        return licences.get(licence);
    }

    public void put(LicenceType licence, String value) {
        this.licences.put(licence, value);
    }
}
