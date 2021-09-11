package swcs.gof.behavioral.command.filesystem;

import java.io.File;

public class FileSystem {

    public void create(File file) {
        System.out.printf("Create %s%n",
                file.getName());
    }

    public void delete(File file) {
        System.out.printf("Delete %s%n",
                file.getName());
    }

    public void move(File source, File target) {
        System.out.printf("Move %s to %s%n",
                source.getName(),
                target.getName());
    }
}
