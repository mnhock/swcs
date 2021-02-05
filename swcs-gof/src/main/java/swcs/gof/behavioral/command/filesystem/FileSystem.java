package swcs.gof.behavioral.command.filesystem;

import java.io.File;

public class FileSystem {

    public void create(File file) {
        System.out.println(String.format("Create %s",
                file.getName()));
    }

    public void delete(File file) {
        System.out.println(String.format("Delete %s",
                file.getName()));
    }

    public void move(File source, File target) {
        System.out.println(String.format("Move %s to %s",
                source.getName(),
                target.getName()));
    }
}
