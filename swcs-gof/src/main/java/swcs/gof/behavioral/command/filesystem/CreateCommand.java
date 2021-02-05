package swcs.gof.behavioral.command.filesystem;

import java.io.File;

public class CreateCommand implements Command {

    private final File file;

    public CreateCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute(FileSystem fs) {
        fs.create(this.file);
    }
}
