package swcs.converter.after;

import java.io.File;

@FunctionalInterface
interface Compression {

    File compress(File source);

}
