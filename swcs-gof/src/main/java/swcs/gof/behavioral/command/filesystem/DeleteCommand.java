package swcs.gof.behavioral.command.filesystem;

import java.io.File;

public class DeleteCommand implements Command {

    private final File file;

    public DeleteCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute(FileSystem fs) {
        fs.delete(this.file);
    }
}
