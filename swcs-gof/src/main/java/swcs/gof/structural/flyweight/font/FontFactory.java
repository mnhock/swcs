package swcs.gof.structural.flyweight.font;

import java.util.HashSet;
import java.util.Set;

public final class FontFactory {

    private final Set<Font> fonts = new HashSet<>();

    public Font of(String name, int size) {
        for (Font font : this.fonts) {
            if (font.name().equals(name) && font.size() == size) {
                return font;
            }
        }

        Font font = new Font(name, size);
        this.fonts.add(font);

        return font;
    }
}